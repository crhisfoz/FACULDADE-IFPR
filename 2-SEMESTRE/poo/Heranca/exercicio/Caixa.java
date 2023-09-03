public class Caixa extends Funcionario {
    private String usuario;
    private String senha;

    public Caixa(Funcionario funcionario, String usuario, String senha) {
        super(funcionario, funcionario.getFuncao(), funcionario.getSalario(),
        funcionario.getDataAdmissao());
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void exibirDadosCaixa( ) {
        super.exibirDadosFuncionario();
        System.out.println("Usuario: " + this.usuario);
        System.out.println("Senha: " + this.senha);
        System.out.println("--------------");

    }

}
