public class Magazine extends LibraryItem {
    private String editors;
    private int number;

    public Magazine(int c, String t, String g, int p, int e, String pc, int y, String ed, int num) {
        super(c, t, g, p, e, pc, y);
        this.number = num;
        this.editors = ed;

    }

    public String getEditors() {
        return editors;
    }

    public void setEditors(String editors) {
        this.editors = editors;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
