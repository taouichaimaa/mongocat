package irsisi.bdss.apps.mongocat.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


public class Produits {//model remove Bean
        private String reference;
        private String libelle;
        private String marque;
        private float price;
        private int stock;
        private String image;
        private Dimension dimension;
        private List<String> caracteristiques;
        private List<Reviews> reviews;

        public Produits() {
        }

    public List<String> getCaracteristiques() {
        return caracteristiques;
    }

    public void setCaracteristiques(List<String> caracteristiques) {
        this.caracteristiques = caracteristiques;
    }

    public Produits(String reference, String libelle, String marque, float price, int stock, String image, Dimension dimension, List<String> caracteristiques, List<Reviews> reviews) {

        this.reference = reference;
        this.libelle = libelle;
        this.price = price;
        this.marque = marque;
        this.stock = stock;
        this.image = image;
        this.dimension = dimension;
       this.caracteristiques=caracteristiques;
        this.reviews = reviews;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }


    public List<Reviews> getReviews() {
        return reviews;
    }

    public void setReviews(List<Reviews> reviews) {
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

        public float getPrice() {
            return price;
        }

        public void setPrice(float price) {
            this.price = price;
        }

        public String getMarque() {
            return marque;
        }

        public void setMarque(String marque) {
            this.marque = marque;
        }

        public int getStock() {
            return stock;
        }

        public void setStock(int stock) {
            this.stock = stock;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }
        @Override
    public String toString(){
            return "product is"+this.reference;

        }
    }


