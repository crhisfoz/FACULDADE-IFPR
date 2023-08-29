public class ExemploHeranca {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("João");
        p1.setEmail("joao@gmail.com");
        p1.setIdade(22);
        System.out.println("Nome: " + p1.getNome());

        Pessoa p2 = new Pessoa(
                "Maria", "mary@ane.com", 33);

        System.out.println("Nome: " + p2.getNome());

        Aluno a1 = new Aluno();
        a1.setNome("Calvin");
        a1.setEmail("teste@gmail.com");
        a1.setIdade(12);
        a1.setNota1(7.5f);
        a1.setNota2(8.5f);
        a1.setNota3(5.0f);
        a1.setNota4(6.5f);
        System.out.println("aluno: "+ a1.getNome());
        System.out.println("Média: "+ String.format("%.1f", a1.calcularMedia()));
        
    }

}
