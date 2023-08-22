public class Passageiro{
    private String nome;
    private String cpf;
    private String data_nasc;
    private String num_assento;
    private String num_voo;

    public String getNome(){
        return this.nome;
    };
    public void setNome(String nome){
        this.nome = nome;
    }

     public String getCpf(){
        return this.cpf;
    };
      public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getDataNasc(){
        return this.data_nasc;
    };
      public void setNasc(String data){
        this.data_nasc = data;
    }

    public String getNumAssento(){
        return this.num_assento;
    };
      public void setAssento(String assento){
        this.num_assento = assento;
    }

    public String getNumVoo(){
        return this.num_voo;
    };
    public void setNumVoo(String voo){
        this.num_voo = voo;
    }


}