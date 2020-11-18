package irsisi.bdss.apps.mongocat.models;

import java.util.ArrayList;
import java.util.List;


public class Categorie {
    private String nom;
    private List<Produit> produits;

    public Categorie() {
    }

    public Categorie(String nom, ArrayList<Produit> produits) {
        this.nom = nom;
        this.produits = produits;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }
}
