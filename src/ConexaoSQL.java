import java.sql.*;
public class ConexaoSQL {

    private Connection conexao = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    public boolean conectar() {
        try {
            String url = "jdbc:sqlite:banco.db";
            this.conexao = DriverManager.getConnection(url);
            System.out.println("Conectado com sucesso");
        } catch (SQLException ex) {
            System.out.println("Erro ao acessar banco: " + ex.getMessage());
        }
        return true;
    }
    public boolean creatTable(){
        try{
            String sql1 = "CREATE TABLE IF NOT EXISTS NOMES(ID INTEGER PRIMARY KEY AUTOINCREMENT, NOME1 TEXT)";
            preparedStatement = this.conexao.prepareStatement(sql1);
            preparedStatement.execute();
            preparedStatement.executeUpdate();
            System.out.println("Tabela criada com sucesso");
        }catch (SQLException e){
            System.out.println("Erro ao criar Tabela em banco: "+e.getMessage());
            return false;
        }
        return true;
    }
    public boolean desconectar(){
        try {
            if(this.preparedStatement != null && this.resultSet != null && this.conexao != null){
                this.conexao.close();
                this.resultSet.close();
                this.preparedStatement.close();
            }
            System.out.println("Banco desconectado");
        }catch (SQLException e){
            System.out.println("Erro ao fechar o banco: "+ e.getMessage());
            return false;
        }
        return true;
    };
    public boolean inserirDados(String nome1){
        try{
            if((verificar_Dados_Entrada_Banco(nome1)) == false){
                String sql = "INSERT INTO NOMES (NOME1) VALUES (?)";
                preparedStatement = this.conexao.prepareStatement(sql);
                preparedStatement.setString(1,nome1);
                preparedStatement.executeUpdate();
                System.out.println("Dados inseridos ao banco com sucesso!!");
            }else{
            System.out.println("Dado repetido! Refaça a operação");
            }
        }catch(SQLException ex) {
            System.out.println("Erro ao inserir dados no banco: "+ ex.getMessage());
            return false;
        }
            return true;
    }
    public void exibirBanco(){
        try{
            String sql = "SELECT * FROM NOMES";
            this.preparedStatement = this.conexao.prepareStatement(sql);
            this.resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                String texto1 = resultSet.getString("NOME1");
                int id = resultSet.getInt("ID");
                System.out.println("|ID:"+id+"| Nome:"+texto1+" |");
            }
        }catch(SQLException ex) {
            System.out.println("Erro ao Visualizar dados no banco: "+ ex.getMessage());
        }

    }
    public boolean excluirDado(String nome){
        try{
            if( nome!=null && (verificar_Dados_Entrada_Banco(nome) == true)) {
                String sql1 = "DELETE FROM NOMES WHERE NOME1 = ?";
                preparedStatement = this.conexao.prepareStatement(sql1);
                preparedStatement.setString(1, nome);
                int verificacao = preparedStatement.executeUpdate();
                if (verificacao > 0) {
                    System.out.println("Registro excluído com sucesso!");
                    return true;
                } else {
                    System.out.println("Nenhum registro encontrado com o nome especificado.");
                    return false;
                }
            }else {
                System.out.println("Erro ao excluir");
                return false;
            }
        }catch (SQLException e){
            System.out.println("Erro ao Excluir dados no banco: "+ e.getMessage());
            return false;
        }
    }
    private boolean verificar_Dados_Entrada_Banco(String dado){
        try {
            String sqlite = "SELECT * FROM NOMES WHERE NOME1 = ?";
            preparedStatement = this.conexao.prepareStatement(sqlite);
            preparedStatement.setString(1, dado);
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                System.out.println("Dado encontrado");
                return true;
            }else {
                System.out.println("Dado não encontrado");
                return false;
            }
        }catch (SQLException e){
            System.out.println("Erro ao Verificar dados no banco: "+ e.getMessage());
            return false;
        }
    }
}
