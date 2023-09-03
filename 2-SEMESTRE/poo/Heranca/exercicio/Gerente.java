import java.text.DecimalFormat;

public class Gerente extends Funcionario {
    private float metas;

    public Gerente(Funcionario funcionario, float metas) {
        super(funcionario, funcionario.getFuncao(), funcionario.getSalario(),
        funcionario.getDataAdmissao());
        this.metas = metas;

    }

    public float getMetas() {
        return metas;
    }

    public void setMetas(float metas) {
        this.metas = metas;
    }

    public void exibirDadosGerente() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        super.exibirDadosFuncionario();
        System.out.println("Metas: " + df.format(this.metas));
        System.out.println("--------------");
    }
}
