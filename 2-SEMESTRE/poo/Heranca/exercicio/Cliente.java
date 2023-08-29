public class Cliente extends Pessoa{
    private float renda;
    private String produtoComprado;
    private float valorGasto;
    private String listaDesejos;
    private String produtoEmEspera;
    
    public float getRenda() {
        return renda;
    }
    public void setRenda(float renda) {
        this.renda = renda;
    }
    public String getProdutoComprado() {
        return produtoComprado;
    }
    public void setProdutoComprado(String produtoComprado) {
        this.produtoComprado = produtoComprado;
    }
    public float getValorGasto() {
        return valorGasto;
    }
    public void setValorGasto(float valorGasto) {
        this.valorGasto = valorGasto;
    }
    public String getListaDesejos() {
        return listaDesejos;
    }
    public void setListaDesejos(String listaDesejos) {
        this.listaDesejos = listaDesejos;
    }
    public String getProdutoEmEspera() {
        return produtoEmEspera;
    }
    public void setProdutoEmEspera(String produtoEmEspera) {
        this.produtoEmEspera = produtoEmEspera;
    }


}
