public class Escola {
    private String nome;
    private String fone;
    private int qtdeTurmas;
    private Turma[] vetTurmas;

    public Escola() {
        this.vetTurmas = new Turma[20];
        this.qtdeTurmas = 0;
    }

    public String getNome() {
        return this.nome;
    }

    public String getFone() {
        return this.fone;
    }

    public int getQteTurmas() {
        return this.qtdeTurmas;
    }

    public Turma getTurma(int posicao) {
        return this.vetTurmas[posicao];
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public void setVetTurmas(Turma turma) {
        if (this.qtdeTurmas < 20) {
            this.vetTurmas[qtdeTurmas] = turma;
            this.qtdeTurmas++;
        }

    }

}
