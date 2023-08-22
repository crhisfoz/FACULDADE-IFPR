public class Voo{
    private String numVoo;
    private String data_partida;
    private String data_chegada;
    private String hora_partida ;
    private String hora_chegada ;
    private Passageiro[] passageiros;
    private int qnte_passageiros;
    private String local_partida;
    private String local_destino;
    private int qnte_assentos_livres;
     

    public Voo(){
        this.passageiros = new Passageiro[120];
        this.qnte_passageiros = 0;
    };
    
    public String getNumVoo(){
        return this.numVoo;
    };
    public void setVoo(String numVoo){
        this.numVoo = numVoo;
    };

    public String getDataPartida(){
        return this.data_partida;
    };
    public void setDataPartida( String data){
        this.data_partida = data;
    };

    public String getDataChegada(){
        return this.data_chegada;
    };
    public void setChegada(String data){
        this.data_chegada = data;
    };

    public String getHoraPartida(){
        return this.hora_partida;
    };
    public void setHoraPartida(String hora){
        this.hora_partida = hora;
    };

    public String getHoraChegada(){
        return this.hora_chegada;
    };
    public void setHoraChegada(String hora){
        this.hora_chegada = hora;
    };


    public Passageiro getPassageiro(int posicao) {
        return this.passageiros[posicao];
    }

    public String getLocalPartida(){
        return this.local_partida;
    };
    public void setPartida(String local){
        this.local_partida = local;
    };

    public String getLocalDestino(){
        return this.local_destino;
    };
     public void setDestino(String local){
        this.local_destino = local;
    };

    public int getAssentosLivres(){
       return this.qnte_assentos_livres = (this.passageiros.length - this.qnte_passageiros);
    }

      public void setPassageiros(Passageiro passageiro) {
        if (this.qnte_passageiros < 120) {
            this.passageiros[qnte_passageiros] = passageiro;
            this.qnte_passageiros++;
        }
    }

    
}