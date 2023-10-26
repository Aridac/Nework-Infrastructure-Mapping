import java.util.Scanner;
public class Equipamento {
    private String nomeEquipamento;
    private String rack;
    Scanner s = new Scanner(System.in);
    public Equipamento(String nomeEquipamento, String rack) {
        this.nomeEquipamento = nomeEquipamento;
        this.rack = rack;
    }

    public Equipamento() {
        System.out.println("Digite o nome do equipamento: ");
        this.nomeEquipamento = s.next();
        System.out.println("Digite o rack: ");
        this.rack = s.next();
    }

    public String getNomeEquipamento() {
        return nomeEquipamento;
    }

    public void setNomeEquipamento(String nomeEquipamento) {
        this.nomeEquipamento = nomeEquipamento;
    }

    public String getRack() {
        return rack;
    }

    public void setRack(String rack) {
        this.rack = rack;
    }
}
