import java.text.DecimalFormat;

public class Vendedor extends Funcionario {
    private float metas;
    private float vendas;
    private float comissao;
    private float comissaoTotal;

    public Vendedor(Funcionario funcionario, float metas, float vendas, float comissao) {
        super(funcionario, funcionario.getFuncao(), funcionario.getSalario(),
                funcionario.getDataAdmissao());
        this.metas = metas;
        this.vendas = vendas;
        this.comissao = comissao;
        setComissaoTotal(comissao, vendas);
    }

    public float getMetas() {
        return metas;
    }

    public void setMetas(float metas) {
        this.metas = metas;
    }

    public float getVendas() {
        return vendas;
    }

    public void setVendas(float vendas) {
        this.vendas = vendas;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    public float getComissaototal() {
        return this.comissaoTotal;
    }

    public void setComissaoTotal(float comissao, float vendas) {
        this.comissaoTotal = (comissao / 100) * vendas;
    }

    public void exibirDadosVendedor() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        super.exibirDadosFuncionario();
        System.out.println("Metas: " + df.format(this.metas));
        System.out.println("Vendas: " + df.format(this.vendas));
        System.out.println("Comissão Total: " + df.format(this.comissaoTotal));
        System.out.println("--------------");
    }
}
