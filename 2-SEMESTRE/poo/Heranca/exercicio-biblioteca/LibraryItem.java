import java.io.BufferedReader;
import java.io.InputStreamReader;

public abstract class LibraryItem {
    private int code;
    private String title;
    private String gender;
    private int qtdePages;
    private int edition;
    private String publishingCompany;
    private int releaseYear;

    public LibraryItem(int c, String t, String g, int p, int e, String pc, int y) {
        this.code = c;
        this.title = t;
        this.gender = g;
        this.qtdePages = p;
        this.edition = e;
        this.publishingCompany = pc;
        this.releaseYear = y;

    };

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getQntPages() {
        return qtdePages;
    }

    public void setQntPages(int numPages) {
        this.qtdePages = numPages;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String detailsItem() {
        return "\n" + " ----- Exibindo Dados ------" + "\n" +
                "Código: '" + code + "',\n" +
                "Título: '" + title + "',\n" +
                "Genêro: '" + gender + "',\n" +
                "Páginas: '" + qtdePages + "',\n" +
                "Edição: '" + edition + "',\n" +
                "Editora: '" + publishingCompany + "',\n" +
                "Ano de Lançamento: '" + releaseYear + "'";
    }

}