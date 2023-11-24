import java.util.Scanner;
public class Equipamento {
    private int id_equipamento;
    private String nome_equipamento;
    private Rack rack;

    public int getId_equipamento() {
        return id_equipamento;
    }

    public String getNome_equipamento() {
        return nome_equipamento;
    }

    public Rack getRack() {
        return rack;
    }

    public Equipamento(){

    }
    public Equipamento(int id_equipamento, String nome_equipamento, Rack rack) {
        this.id_equipamento = id_equipamento;
        this.nome_equipamento = nome_equipamento;
        this.rack = rack;
    }
}
