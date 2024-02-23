import java.util.ArrayList;
import java.util.Iterator;

public class LisatagemClientes {
    public static void main(String[] args) {
        ArrayList<Cliente> lista = new ArrayList<Cliente>();

        Cliente c1 = new Cliente();
        c1.setNome("Crhistian");
        c1.setEmail("crhisnokia@live.com");
        c1.setCpf("123456");
        lista.add(c1);

        Cliente c2 = new Cliente();
        c2.setNome("Humberto");
        c2.setEmail("humb@live.com");
        c2.setCpf("458787");
        lista.add(c2);

        Cliente c3 = new Cliente();
        c3.setNome("Ana");
        c3.setEmail("ana@live.com");
        c3.setCpf("654321");
        lista.add(c3);

        System.out.println("Percorrendo com Iterator");
        Iterator<Cliente> itCliente = lista.iterator();
        while (itCliente.hasNext()) {
            Cliente cli = itCliente.next();
            System.out.println("Nome: " + cli.getNome()
                    + " CPF: " + cli.getCpf());
        }

        //remover item da lista
        System.out.println("Removendo item da lista com Iterator");
        Cliente cliRemover = new Cliente();
        cliRemover.setCpf("123456");
        Iterator<Cliente> itRemover = lista.iterator();
        while(itRemover.hasNext()){
            if(itRemover.next().getCpf().equals(cliRemover.getCpf())){
                System.out.println("Removendo o Cliente ");
                itRemover.remove();
            }
        }

        System.out.println("\nPercorrendo com foreach");
        for (Cliente cliente: lista){
            System.out.println("Nome: " + cliente.getNome()
                    + " CPF: " + cliente.getCpf());
        }

         //remover item da lista com foreach
         //está lançando exception ao remover o último item da lista se não colocar um break 
         //sugestão usar iterator
         cliRemover.setCpf("654321");

         for (Cliente cli : lista) {
            if(cli.getCpf().equals(cliRemover.getCpf())){
                System.out.println("Removendo o Cliente " + cli.getNome());
                lista.remove(cli);
                break;
            }
            
         }

    };

}
