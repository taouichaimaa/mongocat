package irsisi.bdss.apps.mongocat.models;


import java.util.List;


public class Produit {

    //model remove Bean
    private String reference;
    private String libelle;
    private String marque;
    private Double price;
    private Integer stock;
    private String image;
    private Dimension dimension;
    private List<String> caracteristiques;
    private List<Review> reviews;

    public Produit() {
    }

    public Produit(String reference, String libelle, String marque) {
        this.reference = reference;
        this.libelle = libelle;
        this.marque = marque;
    }

    public Produit(String ref, String lib, String marque, List<Review> reviews) {
        this.reference=ref;
        this.libelle=lib;
        this.marque=marque;
        this.reviews=reviews;

    }

    public List<String> getCaracteristiques() {
        return caracteristiques;
    }

    public void setCaracteristiques(List<String> caracteristiques) {
        this.caracteristiques = caracteristiques;
    }

    public Produit(String reference, String libelle, String marque, Double price, int stock, String image, Dimension dimension, List<String> caracteristiques, List<Review> reviews) {

        this.reference = reference;
        this.libelle = libelle;
        this.price = price;
        this.marque = marque;
        this.stock = stock;
        this.image = image;
        this.dimension = dimension;
        this.caracteristiques = caracteristiques;
        this.reviews = reviews;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }


    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }


    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "product is" + this.reference;

    }
}


