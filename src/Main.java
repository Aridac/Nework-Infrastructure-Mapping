
public class Main {
    public static void main(String[] args) {
        ConexaoSQL sql =new ConexaoSQL();
        sql.conectar();
<<<<<<< HEAD
        //sql.inserirDados("Oitavo","Nono");
=======
        sql.creatTable();
        sql.inserirDados("TEsr6","Test7");
        sql.exibirBanco();

        //sql.creatTable();

>>>>>>> 81bfdf1 (Inserindo CRUD)
        }

}