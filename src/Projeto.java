public class Projeto {
    private int id_projeto;
    private String nome_Projeto;
    private Cabo cabo;

    public Projeto(){

    }
    public Projeto(int id_projeto,String nome_Projeto, Cabo cabo){
    }

    public int getId_projeto() {
        return id_projeto;
    }

    public String getNome_Projeto() {
        return nome_Projeto;
    }

    public Projeto iniciar_Projeto(int id_projeto, int id_local, int id_rack, int id_equipamento, int id_cabo, String nome_Projeto, String nome_Local, String nome_rack, String nome_equipamento, String nome_cabo, String tipo_cabo, String origem_cabo, String destino_cabo, float comprimento_cabo){
        Local local = new Local(id_local,nome_Local);
        Rack rack = new Rack(id_rack,nome_rack,local);
        Equipamento equipamento = new Equipamento(id_equipamento,nome_equipamento,rack);
        Cabo cabo = new Cabo(id_cabo,tipo_cabo,nome_cabo,origem_cabo,destino_cabo,comprimento_cabo,equipamento);
        System.out.println("_________________________________________________");
        System.out.println(nome_Projeto);
        System.out.println("ID do Projeto:       " + id_projeto);
        System.out.println("_________________________________________________");
        System.out.println("ID do Cabo:          " + id_cabo);
        System.out.println("Tipo de cabo:        " + tipo_cabo);
        System.out.println("Nome do cabo:        " + nome_cabo);
        System.out.println("Origem do cabo:      " + origem_cabo);
        System.out.println("Destino do cabo:     " + destino_cabo);
        System.out.println("Comprimento do cabo: " + comprimento_cabo);
        System.out.println("_________________________________________________");
        System.out.println("ID do Equipamento:   " + id_equipamento);
        System.out.println("Nome do Equipamento: " + nome_equipamento);
        System.out.println("_________________________________________________");
        System.out.println("ID do Rack:          " + id_rack);
        System.out.println("Nome do Rack:        " + nome_rack);
        System.out.println("_________________________________________________");
        System.out.println("ID do Local:         " + id_local);
        System.out.println("Nome do Local:       " + nome_Local);
        return new Projeto(id_projeto,nome_Projeto,cabo);
    };

}
