import java.util.Scanner;
public class Cabo{
    private int id_cabo;
    private String tipo_cabo;
    private String nome_cabo;
    Equipamento e = new Equipamento();
    Local l = new Local();
    Rack rack = new Rack();
    Projeto projeto = new Projeto();
    private String origem_cabo;
    private String destino_cabo;
    private float comprimento_cabo;
    public Cabo() {
    }

    public void setId_cabo(int id_cabo) {
        this.id_cabo = id_cabo;
    }

    public void setTipo_cabo(String tipo_cabo) {
        this.tipo_cabo = tipo_cabo;
    }

    public void setNome_cabo(String nome_cabo) {
        this.nome_cabo = nome_cabo;
    }

    public void setOrigem_cabo(String origem_cabo) {
        this.origem_cabo = origem_cabo;
    }

    public void setDestino_cabo(String destino_cabo) {
        this.destino_cabo = destino_cabo;
    }

    public void setComprimento_cabo(float comprimento_cabo) {
        this.comprimento_cabo = comprimento_cabo;
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
