import java.util.Date;

public class Vendedor extends Funcionario{
    private int metas;
    private float vendas;
    private float comissaoTotal;
    
    public int getMetas() {
        return metas;
    }
    public void setMetas(int metas) {
        this.metas = metas;
    }
    public float getVendas() {
        return vendas;
    }
    public void setVendas(float vendas) {
        this.vendas = vendas;
    }
    public float getComissaoTotal() {
        return comissaoTotal;
    }
    public void setComissaoTotal(float comissaoTotal) {
        this.comissaoTotal = comissaoTotal;
    }

}
