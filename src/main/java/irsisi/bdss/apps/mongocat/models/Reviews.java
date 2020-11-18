package irsisi.bdss.apps.mongocat.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "reviews")
public class Reviews {


    @Id
    private String id;
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

    public Reviews(String id, String nom, int stars, String commentaire) {
        this.id = id;
        this.nom = nom;
        this.stars = stars;
        this.commentaire = commentaire;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
