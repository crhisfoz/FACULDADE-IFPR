public class Magazine extends LibraryItem {
    private int numEditors;
    private String[] editors; // Alterado para um array de Strings para armazenar vários editores

    public Magazine(LibraryItem magazine, int num, String[] eds) {
        super(magazine.getCode(), magazine.getTitle(), magazine.getGender(), magazine.getQntPages(),
                magazine.getEdition(), magazine.getPublishingCompany(), magazine.getReleaseYear());
        this.numEditors = num;
        if (numEditors > 1) {
            this.editors = eds; // Atribui o array de editores apenas se houver mais de 1 editor
        } else {
            this.editors = new String[0]; // Cria um array vazio se não houver editores
        }
    }

    public String[] getEditors() {
        return editors;
    }

    public void setEditors(String[] eds) {
        this.editors = eds;
    }

    public int getNumberEditors() {
        return numEditors;
    }

    public void setNumberEditors(int num) {
        this.numEditors = num;
    }

    public void printDetailsMagazine() {
        System.out.println(" ----- Exibindo Dados ------");
        String libraryItemDetails = super.detailsItem(); // Obtém os detalhes da classe pai
        System.out.println(libraryItemDetails); // Exibe os detalhes da classe pai
        System.out.println("Quantidade de Editores: " + this.editors);
    
        if (numEditors > 1) {
            System.out.print("Editores: ");
            String editorsString = String.join(", ", editors);
            System.out.println(editorsString);
        } else {
            System.out.println("Autor: " + (editors.length > 0 ? editors[0] : "Nenhum editor especificado"));
        }
        System.out.println("--------------");
    }
}
