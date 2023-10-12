import java.sql.*;
public class ConexaoSQL {
    private Connection conexao1;

    public boolean conectar() {

        try {
            String url = "jdbc:sqlite:banco.db";
            this.conexao1 = DriverManager.getConnection(url);
            System.out.println("Conectado com sucesso");
        } catch (SQLException ex) {
            System.out.println("Erro ao acessar banco: " + ex.getMessage());
        }
        return true;
    }
}
