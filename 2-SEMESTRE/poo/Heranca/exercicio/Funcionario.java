import java.text.DecimalFormat;

public class Funcionario extends Pessoa {

   private String funcao;
   private float salario;
   private String dataAdmissao;

   public Funcionario(Pessoa pessoa,
         String funcao, float salario, String dataAdmissao) {
      super(pessoa.getNome(), pessoa.getCpf(), pessoa.getEndereco(), pessoa.getDataNasc(), pessoa.getTelefone(),
            pessoa.getEmail());
      this.funcao = funcao;
      this.salario = salario;
      this.dataAdmissao = dataAdmissao;
   }

   public String getFuncao() {
      return funcao;
   }

   public void setFuncao(String funcao) {
      this.funcao = funcao;
   }

   public float getSalario() {
      return salario;
   }

   public void setSalario(float salario) {
      this.salario = salario;
   }

   public String getDataAdmissao() {
      return dataAdmissao;
   }

   public void setDataAdmissao(String dataAdmissao) {

      this.dataAdmissao = dataAdmissao;
   }

   public void exibirDadosFuncionario() {
      DecimalFormat df = new DecimalFormat("#,##0.00");
      System.out.println(super.toString());
      System.out.println("Função: " + this.funcao);
      System.out.println("Salário: " + df.format(this.salario));
      System.out.println("Data de Admissão: " + this.dataAdmissao);

   }

}
