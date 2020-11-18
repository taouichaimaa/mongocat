package irsisi.bdss.apps.mongocat.controllers;


import irsisi.bdss.apps.mongocat.models.Catalog;
import irsisi.bdss.apps.mongocat.models.Categorie;
import irsisi.bdss.apps.mongocat.models.Produit;
import irsisi.bdss.apps.mongocat.models.Review;
import irsisi.bdss.apps.mongocat.repositories.CatalogRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
//ignore just for testing
@RestController
@RequestMapping("test")
public class TestController {

    final CatalogRepository catalogRepository;

    public TestController(CatalogRepository catalogRepository) {
        this.catalogRepository = catalogRepository;
    }


    @GetMapping("/")
    public void save(){
        Catalog catalog = new Catalog();
        catalog.setId("idforbrands54");
        catalog.setAddress("guelijdr");
        catalog.setNom("electro planet");
        catalog.setVille("Marrakech");
        List<Review> reviews =new ArrayList<>();
        reviews.add(new Review("anonym",3,"hbaele"));
        reviews.add(new Review("anon",5,"hbaele"));
        reviews.add(new Review("anon",1,"hbaele"));
        reviews.add(new Review("anon", 2,"hbaele"));

        List<Produit> produits = new ArrayList<>();
        produits.add(new Produit("testproduit", "G8kl", "LG",reviews));
        produits.add(new Produit("testproduit2", "testproduit2", "LG"));
        produits.add(new Produit("testproduit3", "testproduit3", "LG"));


        Categorie categori = new Categorie();
        categori.setNom("Electra");
        categori.setProduits(produits);

        List<Categorie> categories = new ArrayList<>();

        categories.add(categori);


        catalog.setCategories(categories);

        catalogRepository.save(catalog);
    }




}
