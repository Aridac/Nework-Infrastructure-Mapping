public class  Local {

    private String nome_Local;
    private int id_Local;

    public String getNome_Local() {
        return nome_Local;
    }

    public int getId_Local() {
        return id_Local;
    }

    public Local(int id_Local, String nome_Local) {
        this.nome_Local = nome_Local;
        this.id_Local = id_Local;
    }
}