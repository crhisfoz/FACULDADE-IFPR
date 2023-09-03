public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;
    private String dataNasc;
    private String telefone;
    private String email;

    public Pessoa(String nome, String cpf, String endereco, String dataNasc, String telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.dataNasc = dataNasc;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String toString() {
        return "\n" + " ----- Exibindo Dados ------"+ "\n" + 
                "Nome: '" + nome + "',\n" +
                "Cpf: '" + cpf + "',\n" +
                "Endereço: '" + endereco + "',\n" +
                "Data Nascimento: '" + dataNasc + "',\n" +
                "Telefone: '" + telefone + "',\n" +
                "Email: '" + email + "'";
    }
}
