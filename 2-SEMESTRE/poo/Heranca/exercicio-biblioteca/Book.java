public class Book extends LibraryItem {
    private int numAuthors;
    private String[] authors;

    public Book(LibraryItem book, int num, String[] a) {
        super(book.getCode(), book.getTitle(), book.getGender(), book.getQntPages(), book.getEdition(),
                book.getPublishingCompany(), book.getReleaseYear());
        this.numAuthors = num;
        if (numAuthors > 1) {
            this.authors = a;
        } else {
            this.authors = new String[0];
        }

    }

    public int getNumAuthors() {
        return numAuthors;
    }

    public void setNumAuthors(int numAuthors) {
        this.numAuthors = numAuthors;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthor(String[] author) {
        this.authors = author;
    }
    public void printDetailsBook() {
        System.out.println(" ----- Exibindo Dados ------");
        String libraryItemDetails = super.detailsItem(); // Obtém os detalhes da classe pai
        System.out.println(libraryItemDetails); // Exibe os detalhes da classe pai
        System.out.println("Quantidade de Autores: " + this.numAuthors);
    
        if (numAuthors > 1) {
            System.out.print("Autores: ");
            String authorsString = String.join(", ", authors);
            System.out.println(authorsString);
        } else {
            System.out.println("Autor: " + (authors.length > 0 ? authors[0] : "Nenhum autor especificado"));
        }
        System.out.println("--------------");
    }
    
    
}
