public class Rack {
    private int id_rack;
    private String nome_rack;
    private Local local;

    public int getId_rack() {
        return id_rack;
    }

    public String getNome_rack() {
        return nome_rack;
    }

    public Local getLocal() {
        return local;
    }

    public Rack(){

    }
    public Rack(int id_rack, String nome_rack, Local local) {
        this.id_rack = id_rack;
        this.nome_rack = nome_rack;
        this.local = local;
    }
}
