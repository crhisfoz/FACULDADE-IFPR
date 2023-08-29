import java.util.Date;

public class Funcionario extends Pessoa{
   private String funcao;
   private float salario;
   private Date dataAdmissao;
   private Date ferias;
   private Date dataDemissao;
   
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
   public Date getDataAdmissao() {
      return dataAdmissao;
   }
   public void setDataAdmissao(Date dataAdmissao) {
      this.dataAdmissao = dataAdmissao;
   }
   public Date getFerias() {
      return ferias;
   }
   public void setFerias(Date ferias) {
      this.ferias = ferias;
   }
   public Date getDataDemissao() {
      return dataDemissao;
   }
   public void setDataDemissao(Date dataDemissao) {
      this.dataDemissao = dataDemissao;
   }
   

}
