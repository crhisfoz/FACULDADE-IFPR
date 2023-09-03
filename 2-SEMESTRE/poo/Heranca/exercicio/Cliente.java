import java.text.DecimalFormat;

public class Cliente extends Pessoa {
    private float renda;
    private float totalGasto;

    public Cliente(Pessoa pessoa, float renda, float totalGasto) {
        super(pessoa.getNome(), pessoa.getCpf(), pessoa.getEndereco(), pessoa.getDataNasc(), pessoa.getTelefone(),
                pessoa.getEmail());
        this.renda = renda;
        this.totalGasto = totalGasto;
    }

    public float getRenda() {
        return renda;
    }

    public void setRenda(float renda) {
        this.renda = renda;
    }

    public float getTotalGasto() {
        return totalGasto;
    }

    public void setTotalGasto(float total) {
        this.totalGasto = total;
    }

    public void exibirDadosCLiente() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        System.out.println(super.toString());
        System.out.println("Renda: " + df.format(this.renda));
        System.out.println("Valor Total: " + df.format(this.totalGasto));
        System.out.println("--------------");
    }
}
