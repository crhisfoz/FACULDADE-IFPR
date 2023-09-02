public class Movies extends LibraryItem{
        private  String actors;
        private String director;
        private String classification; 

    

    public Movies(int c, String t, String g, int p, int e, String pc, int y) {
        super(c, t, g, p, e, pc, y);
        //TODO Auto-generated constructor stub
    }



    public String getParticipants() {
        return actors;
    }

    public void setParticipants(String actors) {
        this.actors = actors;
    }

      public String getDirector() {
            return director;
        }



        public void setDirector(String director) {
            this.director = director;
        }



        public String getClassification() {
            return classification;
        }



        public void setClassification(String classification) {
            this.classification = classification;
        }



    
}
