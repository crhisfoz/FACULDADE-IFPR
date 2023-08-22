public class Companhia{

    private Voo[] voos;
    //private int assentos_livres;
    private int qtde_voos;
    private Boolean atraso = false;

    public Companhia(){
        this.voos = new Voo[100];
        this.qtde_voos = 0;
    };

    public Voo getVoo(int posicao) {
        return this.voos[posicao];
    };
    
    public int getQtdeVoos() {
        return this.qtde_voos;
    };

    
    public void setVoos(Voo voo) {
        if (this.qtde_voos < 100) {
            this.voos[qtde_voos] = voo;
            this.qtde_voos++;
        }
    }

   /* public int getAssentosLivres(Voo voo){
        for(int i; i < this.voos.lenght; i++){
            if(i == this.voos[i].numero){
                 return this.voos[i].lenght - this.voos.[i].qte_passageiros
            }
        }
    }*/

    
    public Boolean getAtraso(){
        return this.atraso;
    };

    public void setAtraso(Boolean houve){
        if(true){
            this.atraso = true;
        }
    }
}