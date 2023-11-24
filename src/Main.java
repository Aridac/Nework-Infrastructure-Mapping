import javax.swing.*;
import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
//        ConexaoSQL sql =new ConexaoSQL();
//        if (sql.conectar() == true){
//            sql.alterar("Ar");
//            sql.exibirBanco();
//            sql.desconectar();
//        }else {
//            System.out.println("erro ao inserir");
//            sql.desconectar();
//        }

        Projeto p1 = new Projeto();
        p1.iniciar_Projeto(01,01,01,01,01,"Projeto GAlVA3","LIR2","AACOPOT02","SW01","WCAP10220","UDP/S-UDP CAT6A","SW02","SW01",1);
    }
}