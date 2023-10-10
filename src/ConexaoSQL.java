import java.sql.*;

public class ConexaoSQL {
    private Connection conexao;
    public boolean conectar(){

        try{
            //carregar o drive do banco de dados
            //Class.forName("jdbc:sqlite:banco.db"); //espera uma string com o caminho do banco de dados
            String url = "jdbc:sqlite:banco.db";
            this.conexao = DriverManager.getConnection(url);//recebe a url e duas strings
            System.out.println("Conexao realizada com sucesso");
            //fazer uma consulta de banco com o RESULTSET
            //ResultSet nome = conexao.createStatement().executeQuery("SELECT * FROM NOMES");
            Statement statement = this.conexao.createStatement();

            // criando uma tabela
            statement.execute("CREATE TABLE IF NOT EXISTS RC_TEST( ID INTEGER, NOME VARCHAR )");

            // inserindo registros
            statement.execute("INSERT INTO RC_TEST( ID, NOME) VALUES (1, 'Mai'), (2, 'Ariel')");

            // lendo os registros
            PreparedStatement stmt = this.conexao.prepareStatement("select * from RC_TEST");
            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                Integer id = resultSet.getInt("ID");
                String nome = resultSet.getString("NOME");

                System.out.println( id + " - " + nome);
            }

        }
        catch(SQLException ex) {
            System.out.println("Erro ao acessar banco: "+ ex.getMessage());
        }
        return true;
    }
}
