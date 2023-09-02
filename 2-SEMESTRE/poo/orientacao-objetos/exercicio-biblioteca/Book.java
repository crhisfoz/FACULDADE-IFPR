public class Book extends LibraryItem {
    private String author;

    public Book(int c, String t, String g, int p, int e, String pc, int y, String a) {
        super(c, t, g, p, e, pc, y);
        this.author = a;

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
