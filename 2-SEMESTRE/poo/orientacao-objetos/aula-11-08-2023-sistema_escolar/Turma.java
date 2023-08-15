public class Turma {
    private int numTurma;
    private String nomeCurso;
    private int ano;
    private int qteALunos;
    private Aluno[] vetAlunos;

    public Turma() {
        this.vetAlunos = new Aluno[40];
        this.qteALunos = 0;
    }

    public int getNumTurma() {
        return this.numTurma;
    }

    public String nomeCurso() {
        return this.nomeCurso;
    }

    public int getAno() {
        return this.ano;
    }

    public int qetQteALunos() {
        return this.qteALunos;
    }

    public Aluno getAluno(int posicao) {
        return this.vetAlunos[posicao];
    }

    public void setNumTurma(int num) {
        this.numTurma = num;
    }

    public void setNomeCurso(String nome) {
        this.nomeCurso = nome;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setAluno(Aluno aluno) {
        if (this.qteALunos < 40) {
            this.vetAlunos[qteALunos] = aluno;
            this.qteALunos++;
        }
    }

}
