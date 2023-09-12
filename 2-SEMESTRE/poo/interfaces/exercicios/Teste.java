import java.text.DecimalFormat;

public class Teste {
    public static void main(String[] args) {
        Quadrado q = new Quadrado(5, 10.5f);
        System.out.println("A area do quadrado e: " + q.calcularArea());

        Retangulo r = new Retangulo();
        r.setLado1(5);
        r.setBase(12.5f);
        System.out.println("A Area do Retangulo e: " + r.calcularArea());

        Circulo c = new Circulo(12.3f);
        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println("A area do circulo e: " + df.format(c.calcularArea()));

    }



}
