import java.util.Scanner;
public class Cabo extends Equipamento {
    private String tipo;
    private String nomeCabo;
    private int idCabo;
    Equipamento e = new Equipamento();
    private String origemCabo = getNomeEquipamento();
    private String destinoCabo = getNomeEquipamento();
    private float tamanhoCabo;
    Scanner stin = new Scanner(System.in);
    public Cabo() {
        System.out.println("Digite o tipo de cabo: ");
        this.tipo = stin.next();
        System.out.println("Digite o nome do cabo: ");
        this.nomeCabo = stin.next();
        System.out.println("Digite o id do cabo: ");
        this.idCabo = stin.nextInt();
        this.origemCabo = e.getNomeEquipamento();
        this.destinoCabo = e.getNomeEquipamento();
        this.tamanhoCabo = stin.nextFloat();
        System.out.println("Tipo : "+this.tipo+"|Nome cabo :"+this.nomeCabo+"|Id :"+this.idCabo+"|Equipamento de origem :"+origemCabo+"|Equipamento de destino :"+destinoCabo+"|Tamanho do cabo :"+this.tamanhoCabo);
    }

    public Cabo(String tipo, String nomeCabo, int idCabo, Equipamento e, String origemCabo, String destinoCabo, float tamanhoCabo, Scanner s) {
        this.tipo = tipo;
        this.nomeCabo = nomeCabo;
        this.idCabo = idCabo;
        this.e = e;
        this.origemCabo = origemCabo;
        this.destinoCabo = destinoCabo;
        this.tamanhoCabo = tamanhoCabo;
        this.s = s;
    }
}
