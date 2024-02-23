import java.util.Iterator;
import java.util.ArrayList;

public class ArrayListCores {

    public static void main(String[] args) {
        String[] vetCores = { "Magenta", "Branco", "Verde", "Azul" };
        ArrayList<String> listaCores = new ArrayList<String>();

        System.out.println("Percorrer vetor com contador");
        for (int i = 0; i < vetCores.length; i++) {
            System.out.println(vetCores[i]);
        }

        System.out.println("Percorrer vetor com Foreach");
        for (String cor : vetCores) {
            System.out.println(cor);
            listaCores.add(cor);
        }

        System.out.println("Percorrer arrayList com iterator");
        for (int count = 0; count < listaCores.size(); count++) {
            System.out.println(listaCores.get(count));

        }


        System.out.println("Percorrer arrayList com for usando iterator");
        Iterator<String> it = listaCores.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toUpperCase());

        }


        System.out.println("Percorrer arrayList com foreach");
        for(String cor : listaCores){
            System.out.println(cor);

        }

    }

}