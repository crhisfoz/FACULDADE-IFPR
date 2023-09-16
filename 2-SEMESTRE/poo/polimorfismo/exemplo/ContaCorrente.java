public class ContaCorrente {
    private int numConta;
    private String nome;
    private float saldo;

    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void depositar(float dindim){
        this.saldo += dindim;
    }

    public boolean sacar(float saque){
        boolean resultado = false;
        if(this.saldo >= (saque + (saque * 0.005f))){
            this.saldo -= ((saque * 0.005f)+ saque);
            resultado = true;
        }  
        return resultado;
    }

    
}
