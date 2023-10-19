public class Main {
    public static void main(String[] args) {
        ConexaoSQL sql =new ConexaoSQL();
        if (sql.conectar() == true){
            sql.creatTable();
            sql.inserirDados("Ariel1");
            sql.inserirDados("Loki3");
            sql.inserirDados("Cao");
            sql.excluirDado("Ariel");
            sql.excluirDado("Loki");
            sql.exibirBanco();
            sql.desconectar();
        }else {
            System.out.println("erro ao inserir");
            sql.desconectar();
        }
        }
}