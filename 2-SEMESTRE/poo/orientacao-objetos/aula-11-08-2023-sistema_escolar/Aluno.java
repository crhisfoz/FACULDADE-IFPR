public class Aluno {
    private String nome;
    private String matricula;
    private float nota1;
    private float nota2;
    private float nota3;
    private float nota4;

    // método getter
    // serve para retornar o valor de um atributo
    public String getNome() {
        return this.nome;
        // this faz referência a um atributo ou método
        // declarado no escopo da classe
    }

    public String getMatricula() {
        return this.matricula;

    }

    public float getNota1() {
        return this.nota1;
    }

    public float getNota2() {
        return this.nota2;
    }

    public float getNota3() {
        return this.nota3;
    }

    public float getNota4() {
        return this.nota4;
    }

    // método stter
    // atribui um valor aum atributo
    public void setNome(String n) {
        this.nome = n;
    }

    public void setMatricula(String m) {
        this.matricula = m;
    }

    public void setNota1(float n1) {
        this.nota1 = n1;
    }

    public void setNota2(float n2) {
        this.nota1 = n2;
    }

    public void setNota3(float n3) {
        this.nota1 = n3;
    }

    public void setNota4(float n4) {
        this.nota1 = n4;
    }

}
