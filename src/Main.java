public class Main {
    public static void main(String[] args) {
        ConexaoSQL sql =new ConexaoSQL();
        if (sql.conectar() == true){
            sql.alterar("Ar");
            sql.exibirBanco();
            sql.desconectar();
        }else {
            System.out.println("erro ao inserir");
            sql.desconectar();
        }
        }
}