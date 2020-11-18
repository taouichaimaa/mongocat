package irsisi.bdss.apps.mongocat.models;

import java.util.ArrayList;

public class Categories {
    private String nom;
    private ArrayList<Produits> produits;

    public Categories() {
    }

    public Categories(String nom, ArrayList<Produits> produits) {
        this.nom = nom;
        this.produits = produits;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Produits> getProduits() {
        return produits;
    }

    public void setProduits(ArrayList<Produits> produits) {
        this.produits = produits;
    }
}
