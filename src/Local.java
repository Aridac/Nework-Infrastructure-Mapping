public class Local {
    private String nome_Local;
    private int id_local;
    Equipamento equipamento = new Equipamento();

    public String getNome_Local() {
        return nome_Local;
    }

    public void setNome_Local(String nome_Local) {
        this.nome_Local = nome_Local;
    }

    public int getId_local() {
        return id_local;
    }

    public void setId_local(int id_local) {
        this.id_local = id_local;
    }
}
