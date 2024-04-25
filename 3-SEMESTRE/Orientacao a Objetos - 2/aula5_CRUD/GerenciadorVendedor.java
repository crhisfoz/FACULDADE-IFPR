import java.util.ArrayList;
import java.util.Scanner;

import com.mysql.cj.protocol.a.NativeConstants.IntegerDataType;

public class GerenciadorVendedor {
    Scanner scanner;
    DaoVendedor daoVendedor;

    public GerenciadorVendedor(){
        scanner = new Scanner(System.in);
        daoVendedor = new DaoVendedor();
    }

    public void menu(){
        int opcao = -1;
        while (opcao != 0) {
			System.out.println("\n-------------------------------");
			System.out.println("Gerenciamento de Vendedores");            
			System.out.println("[1] Cadastrar");            
			System.out.println("[2] Consultar");            
			System.out.println("[3] Alterar");            
			System.out.println("[4] Excluir");            
			System.out.println("[5] Listar Todos");            
			System.out.println("[0] Sair");            
			System.out.println("\n-------------------------------");

            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Informe um numero inteiro");
            }

            switch (opcao) {
            case 1:
                this.cadastrar();
                break;
            case 2:
                this.consultar();
                break;
            case 3:
                this.alterar();
                break;
            case 4:
                this.excluir();
                break;
            case 5:
                this.listarTodos();
                break;
            case 0:
                System.out.println("Até logo.");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
            }
        }
    }

    public void cadastrar(){
        Veiculo v = new Veiculo();
        System.out.println("------------------------------");
        System.out.println("[Cadastro de Vendedores]");
        System.out.println("Nome: ");
        v.setMarca(scanner.nextLine());
        System.out.println("Cpf: ");
        v.setModelo(scanner.nextLine());
        System.out.println("Telefone: ");
        v.setChassi(scanner.nextLine());
        System.out.println("Salario: ");
        v.setAno(Integer.parseInt(scanner.nextLine()));

        //passa para a camada model
        boolean inserido = daoVendedor.inserir(v);
        if(inserido){
            System.out.println("Inserido com sucesso.");
        }
    }

    public void listarTodos(){
        ArrayList<Vendedor> vendedores = daoVendedor.buscarTodos();
        System.out.println("----------------------------");
        System.out.println("Vendedores Cadastrados");
        for(Veiculo v : veiculos){
            System.out.println("Id: " + v.getId()
                + ", Nome: " + v.getNome()
                + ", Cpf: " + v.getCpf()
                + ", Telefone: " + v.getTelefone()
                + ", Salario: " + v.getSalario());
        }
    }

    public void excluir(){
        System.out.println("----------------------------");
        System.out.println("Exclusão de vendedor");
        System.out.println("Id:");
        int id = Integer.parseInt(scanner.nextLine());
        int qtde = daoVendedor.excluir(id);
        if(qtde > 0){
            System.out.println("Excluído com sucesso.");
        }else{
            System.out.println("Não encontrado...");
        }
    }

    public void consultar(){
        System.out.println("----------------------------");
        System.out.println("Consulta de vendedor");
        System.out.println("Id:");
        int id = Integer.parseInt(scanner.nextLine());
        Vendedor v = daoVendedor.consultar(id);
        if(v != null){
            System.out.println("[Dados do vendedor]");
            System.out.println("Id: " + v.getId());
            System.out.println("Nome: " + v.getNome());
            System.out.println("Cpf: " + v.getCpf());
            System.out.println("telefone: " + v.getTelefone());
            System.out.println("Salario: " + v.getSalario());
        }else{
            System.out.println("Não encontrado...");
        }
    }

    public void alterar(){
        System.out.println("----------------------------");
        System.out.println("Alteração de vendedor");
        System.out.println("Id:");
        int id = Integer.parseInt(scanner.nextLine());
        Vendedor v = daoVendedor.consultar(id);

        if(v != null){
            System.out.println("[Dados do Vendedor]");
            System.out.println("[Id: " + v.getId() + "]");

            System.out.println("[Nome: " + v.getNome() + "]");
            String nome = scanner.nextLine();
            if(!nome.isEmpty()){
                v.setNome(nome);
            }

            System.out.println("[Cpf: " + v.getCpf() + "]");
            String cpf = scanner.nextLine();
            if(!cpf.isEmpty()){
                v.setCpf(Integer.parseInt(cpf));
            }

            System.out.println("[Telefone: " + v.getTelefone() + "]");
            String telefone = scanner.nextLine();
            if(!telefone.isEmpty()){
                v.setTelefone(Integer.parseInt(telefone));
            }

            System.out.println("[Salario: " + v.getSalario() + "]");
            String salario = scanner.nextLine();
            if(!salario.isEmpty()){
                v.setSalario(Float.parseFloat(salario));
            }

            int qtdeAlterado = daoVendedor.alterar(v);
            if(qtdeAlterado > 0){
                System.out.println("Atualizado com sucesso.");
            }else{
                System.out.println("Não foi possível atualizar.");
            }
        }else{
            System.out.println("Não encontrado...");
        }        
    }
}
