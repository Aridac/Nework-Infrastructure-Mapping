import java.sql.*;
public class ConexaoSQL {
<<<<<<< HEAD
    private Connection conexao1;

    public boolean conectar() {

        try {
            String url = "jdbc:sqlite:banco.db";
            this.conexao1 = DriverManager.getConnection(url);
            System.out.println("Conectado com sucesso");
        } catch (SQLException ex) {
            System.out.println("Erro ao acessar banco: " + ex.getMessage());
=======
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
            String sql1 = "CREATE TABLE IF NOT EXISTS NOMES(NOME1 TEXT,NOME2 TEXT)";
            preparedStatement = this.conexao.prepareStatement(sql1);
            preparedStatement.execute();
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
    public boolean inserirDados(String nome1,String nome2){
        try{
            String sql = "INSERT INTO NOMES(NOME1,NOME2) VALUES (?,?)";
            this.preparedStatement = this.conexao.prepareStatement(sql);
            this.preparedStatement.setString(1,nome1);
            this.preparedStatement.setString(2,nome2);
            this.preparedStatement.executeUpdate();
            System.out.println("Dados inseridos ao banco com sucesso!!");
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
                String texto2 = resultSet.getString("NOME2");
                System.out.println("Nome : "+texto1 +"\nNome:"+texto2);
            }
        }catch(SQLException ex) {
            System.out.println("Erro ao Visualizar dados no banco: "+ ex.getMessage());
        }finally {
            desconectar();
        }

    }
    public boolean excluirDado(String nome1 || String nome2){
        try{
            String sql = "DELETE FROM NOMES WHARE NOME1 = ?";
            preparedStatement = this.conexao.prepareStatement(sql);
            preparedStatement.setString(1,);
        }catch (SQLException e){
            System.out.println("Erro ao Visualizar dados no banco: "+ e.getMessage());
>>>>>>> 81bfdf1 (Inserindo CRUD)
        }
        return true;
    }
}
