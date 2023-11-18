import java.util.Scanner;
public class Equipamento {
    private int id_equipamento;
    private String nome_equipamento;
    Local local = new Local();
    Rack r = new Rack();
    public Equipamento() {
    }
    public void setId_equipamento(int id_equipamento) {
        this.id_equipamento = id_equipamento;
    }

    public void setNome_equipamento(String nome_equipamento) {
        this.nome_equipamento = nome_equipamento;
    }

    public int getId_equipamento() {
        return id_equipamento;
    }

    public String getNome_equipamento() {
        return nome_equipamento;
    }
}
