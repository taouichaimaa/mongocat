package irsisi.bdss.apps.mongocat.models;



public class Reviews {
    private String nom;
    private int stars;
    private String commentaire;

    /* public Reviews( String nom, int stars, String commentaire) {

         this.nom = nom;
         this.stars = stars;
         this.commentaire = commentaire;
     }*/
    public Reviews() {

    }

    public Reviews( String nom, int stars, String commentaire) {
        this.nom = nom;
        this.stars = stars;
        this.commentaire = commentaire;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }
}
