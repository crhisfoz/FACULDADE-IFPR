public class Decisao {
    public static void main(String[] args) {
        if(args.length < 2){
            System.out.println("O programa precisa de 2 parametros");
            System.exit(0);
        }
        Integer valor1 = Integer.parseInt(args[0]);
        Integer valor2 = Integer.parseInt(args[1]);
        OperacoesMatematicas opMat = new OperacoesMatematicas();

        if((valor1 < 5) || (valor2!= 2)){
            System.out.println("Multiplicando...");
            System.out.println(opMat.multiplicacao(valor1, valor2));

        }else if (valor2 <= 5){
            System.out.println("Dividindo...");
            System.out.println(opMat.divisao(valor1, valor2));
        }
        //operadores lógicos: && => AND, || -> OR, ! -> NOT
        //relacionais: == -> igual, != -> diferente,
        //= -> atribuição
        //valores numéricos compara com ==
        //string compara com o método equals
    }
}

