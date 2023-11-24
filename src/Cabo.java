import java.util.Scanner;
public class Cabo{
    private int id_cabo;
    private String tipo_cabo;
    private String nome_cabo;
    private String origem_cabo;
    private String destino_cabo;
    private float comprimento_cabo;
    private Equipamento equipamento;
    public Cabo(){

    }
    public Cabo(int id_cabo, String tipo_cabo, String nome_cabo, String origem_cabo, String destino_cabo, float comprimento_cabo, Equipamento equipamento) {
        this.id_cabo = id_cabo;
        this.tipo_cabo = tipo_cabo;
        this.nome_cabo = nome_cabo;
        this.origem_cabo = origem_cabo;
        this.destino_cabo = destino_cabo;
        this.comprimento_cabo = comprimento_cabo;
        this.equipamento = equipamento;
    }

    public int getId_cabo() {
        return id_cabo;
    }

    public String getTipo_cabo() {
        return tipo_cabo;
    }

    public String getNome_cabo() {
        return nome_cabo;
    }

    public String getOrigem_cabo() {
        return origem_cabo;
    }

    public String getDestino_cabo() {
        return destino_cabo;
    }

    public float getComprimento_cabo() {
        return comprimento_cabo;
    }
}
