import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LibrarySystem {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    private String[] editors = new String[10];
    private String[] actors = new String[10];
    private String[] writers = new String[10];

    public LibraryItem createItem() throws IOException {
        System.out.println("--- Digite os dados  ---");
        System.out.print("Código: ");
        int code = Integer.parseInt(reader.readLine());
        System.out.print("Título: ");
        String title = reader.readLine();
        System.out.print("Gênero: ");
        String gender = reader.readLine();
        System.out.print("Quantidade de páginas: ");
        int qtdePages = Integer.parseInt(reader.readLine());
        System.out.print("Edição: ");
        int edition = Integer.parseInt(reader.readLine());
        System.out.print("Editora: ");
        String publishingCompany = reader.readLine();
        System.out.println("Ano de Lançamento: ");
        int releaseYear = Integer.parseInt(reader.readLine());
        LibraryItem newItem = new LibraryItem(code, title, gender, qtdePages, edition, publishingCompany, releaseYear) {
        };
        return newItem;
    }

    private void createMagazine() throws IOException {
        System.out.println("--- Criando uma Revista ---");

        LibraryItem libraryItem = createItem();

        System.out.print("Número de Editores: ");
        int numEditors = Integer.parseInt(reader.readLine());
        this.editors = handleData(numEditors, "magazine");
        Magazine magazine = new Magazine(libraryItem, numEditors, this.editors);
        magazine.printDetailsMagazine();
    }

    private void createMovie() throws IOException {
        System.out.println("--- Criar um Filme ---");
        LibraryItem libraryItem = createItem();
        System.out.println("Numero de atores que deseja colocar: ");
        int numActors = Integer.parseInt(reader.readLine());
        this.actors = handleData(numActors, "movie");

        System.out.println("Diretor: ");
        String director = reader.readLine();
        System.out.println("Faixa etária: ");
        int ageGroup = Integer.parseInt(reader.readLine());

        Movies movie = new Movies(libraryItem, numActors, this.actors, director, ageGroup);
        movie.printDetailsMovies();
    }

    private void createBook() throws IOException {
        System.out.println("--- Criando um livro ---");

        LibraryItem libraryItem = createItem();

        System.out.print("Número de Escritores: ");
        int numWriters = Integer.parseInt(reader.readLine());
        this.writers = handleData(numWriters, "book");

        Book book = new Book(libraryItem, numWriters, this.writers);
        book.printDetailsBook();
    }

    public String[] handleData(int num, String adjective) throws IOException {
        String[] data = null;
        String message = "";
    
        switch (adjective) {
            case "magazine":
                data = this.editors;
                message = "Digite a lista de Editores separados por ';'. Ex: 'Paulo Cardoso ; Manuela Silva'";
                break;
            case "movie":
                data = this.actors;
                message = "Digite a lista de Atores separados por ';'. Ex: 'Wagner Moura ; Angelina Jolie'";
                break;
            case "book":
                data = this.writers;
                message = "Digite a lista de Escritores separados por ';'. Ex: 'Monteiro Lobato ; Clarice Lispector '";
                break;
            default:
             System.out.println("Opção inválida: " + adjective);
        }
    
        if (num > 0) {
            System.out.println(message);
            String input = reader.readLine();
            String[] arrayInput = input.split(";");
            data = arrayInput; // Atualiza o array com os dados inseridos pelo usuário
        }
    
        return data;
    }
    

    public void creationMenu() throws IOException {
        while (true) {
            System.out.println("--- Menu de Opções !! ---");
            System.out.println("Escolha a opção do objeto que deseja criar: ");
            System.out.println("1) Revista");
            System.out.println("2) Filme");
            System.out.println("3) Livro");
            System.out.println("9) Sair");
            System.out.print("Digite a Opcao: ");
            String op = reader.readLine();

            if (op.equals("9")) {
                break;
            }

            switch (op) {
                case "1":
                    createMagazine();
                    break;
                case "2":
                    createMovie();
                    break;
                case "3":
                    createBook();
                    break;
                case "9":
                    System.out.println("Encerrando o Programa");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente");
                    break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        LibrarySystem librarySystem = new LibrarySystem();
        librarySystem.creationMenu();
    }
}
