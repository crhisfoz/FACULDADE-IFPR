import java.util.ArrayList;
import java.util.Iterator;

public class ListagemClientes {
    public static void main(String[] args) {
        ArrayList<Cliente> lista = new ArrayList<Cliente>();

        Cliente c1 = new Cliente();
        c1.setNome("Humberto");
        c1.setEmail("asd@asd.com");
        c1.setCpf("123456");
        lista.add(c1);

        Cliente c2 = new Cliente();
        c2.setNome("Ana");
        c2.setEmail("ana@asd.com");
        c2.setCpf("234567");
        lista.add(c2);

        Cliente c3 = new Cliente();
        c3.setNome("Pedro");
        c3.setEmail("pedro@asd.com");
        c3.setCpf("345678");
        lista.add(c3);

        Cliente c4 = new Cliente();
        c4.setNome("Marcos");
        c4.setEmail("aaa@asd.com");
        c4.setCpf("111");
        lista.add(c4);

        System.out.println("\nPercorrendo com iterator");
        Iterator<Cliente> itCliente = lista.iterator(); 
        while (itCliente.hasNext()) {
            Cliente cli = itCliente.next();
            System.out.println("Nome:" + cli.getNome()
                + " CPF: " + cli.getCpf());
        }

        //remover item da lista 
        Cliente cliRemover = new Cliente();
        cliRemover.setCpf("123456");
        Iterator<Cliente> itRemover = lista.iterator();
        while (itRemover.hasNext()) {
            if(itRemover.next().getCpf().equals(cliRemover.getCpf())){
                System.out.println("Removendo cliente");
                itRemover.remove();
            }
        }

        System.out.println("\nPercorrendo com foreach");
        for (Cliente cliente : lista) {
            System.out.println("Nome:" + cliente.getNome()
            + " CPF: " + cliente.getCpf());
        }

        //remover da lista com foreach
        //exception ao tentar remover último item da lista se não colocar um break
        //alternativa é usar iterator
        cliRemover.setCpf("111");
        for (Cliente cli : lista) {
            if(cli.getCpf().equals(cliRemover.getCpf())){
                System.out.println("Removendo cliente " + cli.getNome());
                lista.remove(cli);
              //  break;
            }
        }

        System.out.println("\nPercorrendo com foreach");
        for (Cliente cliente : lista) {
            System.out.println("Nome:" + cliente.getNome()
            + " CPF: " + cliente.getCpf());
        }
    }
}
