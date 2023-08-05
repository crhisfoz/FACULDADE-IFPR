public class Repeticoes {
    public static void main(String[] args) {
        int qtde = 5;
        //para
        System.out.println("Repeticao do tipo for: ");
        for(int i = 0; i < qtde; i++){
            System.out.println(i);
        }// poderia ser (int i = 0; i > qtde; i--)

        //enquanto
        System.out.println("Repeticao do tipo while");
        int cont = 0;
        while(cont <= qtde){
            System.out.println(cont);
            cont++;
        };

        //faça enquanto
        System.out.println("Repetição do tipo do.. while");
        cont = 0;
        do{
            System.out.println(cont);
            cont++;
        }while(cont <= qtde);
    }
}