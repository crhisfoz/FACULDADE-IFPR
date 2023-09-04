import java.text.DecimalFormat;

public class Movies extends LibraryItem {
    private int numActors;
    private String[] actors;
    private String director;
    private int ageGroup;

    public Movies(LibraryItem movie, int num, String[] a, String d, int ag) {
        super(movie.getCode(), movie.getTitle(), movie.getGender(), movie.getQntPages(), movie.getEdition(), movie.getPublishingCompany(),movie.getReleaseYear());
        this.director = d;
        this.ageGroup = ag;
        this.actors = a;
        this.numActors = num;

        if (numActors > 1) {
            this.actors = a; 
        } else {
            this.actors = new String[0];
        }
    }

    public String[] getParticipants() {
        return actors;
    }

    public void setParticipants(String[] actors) {
        this.actors = actors;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getClassification() {
        return ageGroup;
    }

    public void setClassification(int ag) {
        this.ageGroup = ag;
    }


    public void printDetailsMovies() {
        System.out.println(" ----- Exibindo Dados ------");
        String libraryItemDetails = super.detailsItem(); // Obtém os detalhes da classe pai
        System.out.println(libraryItemDetails); // Exibe os detalhes da classe pai
        System.out.println("Quantidade de Atores: " + this.actors);
    
        if (numActors > 1) {
            System.out.print("Atores: ");
            String actorString = String.join(", ", this.actors);
            System.out.println(actorString);
        } else {
            System.out.println("Autor: " + (actors.length > 0 ? actors[0] : "Nenhum ator especificado"));
        }
        System.out.println("--------------");
    }
    
}
