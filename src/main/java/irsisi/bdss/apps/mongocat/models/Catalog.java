package irsisi.bdss.apps.mongocat.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "catalog")
public class Catalog {
    @Id
    private String id;
    private String nom;
    private String address;
    private String ville;
    List<Categorie> categories;

    public Catalog() {

    }

    public Catalog(String id, String nom, String address, String ville, List<Categorie> categories) {
        this.id = id;
        this.nom = nom;
        this.address = address;
        this.ville = ville;
        this.categories = categories;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public List<Categorie> getCategories() {
        return categories;
    }

    public void setCategories(List<Categorie> categories) {
        this.categories = categories;
    }
}
