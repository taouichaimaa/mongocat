package irsisi.bdss.apps.mongocat.models;

public class Dimension {
    private float longueur;
    private float largeur;
    private float hauteur;

    public Dimension() {

    }

    public Dimension(float longueur, float largeur, float hauteur) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public float getLongueur() {
        return longueur;
    }

    public void setLongueur(float longueur) {
        this.longueur = longueur;
    }

    public float getLargeur() {
        return largeur;
    }

    public void setLargeur(float largeur) {
        this.largeur = largeur;
    }

    public float getHauteur() {
        return hauteur;
    }

    public void setHauteur(float hauteur) {
        this.hauteur = hauteur;
    }




}
