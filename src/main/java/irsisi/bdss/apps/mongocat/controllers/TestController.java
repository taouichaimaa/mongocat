package irsisi.bdss.apps.mongocat.controllers;


import irsisi.bdss.apps.mongocat.models.Catalog;
import irsisi.bdss.apps.mongocat.models.Categorie;
import irsisi.bdss.apps.mongocat.models.Produit;
import irsisi.bdss.apps.mongocat.repositories.CatalogRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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
        catalog.setId("testpoop");
        catalog.setAddress("test addr");
        catalog.setNom("test catag");
        catalog.setVille("test ville");

        List<Produit> produits = new ArrayList<>();
        produits.add(new Produit("testproduit", "testproduit", "testproduit"));
        produits.add(new Produit("testproduit2", "testproduit2", "testproduit2"));
        produits.add(new Produit("testproduit3", "testproduit3", "testproduit3"));

        Categorie categorie = new Categorie();
        categorie.setNom("nom cat");
        categorie.setProduits(produits);

        List<Categorie> categories = new ArrayList<>();
        categories.add(categorie);

        catalog.setCategories(categories);

        catalogRepository.save(catalog);
    }

    @GetMapping("/all")
    public List<Catalog> findAll(){
        return catalogRepository.findAll();
    }



}
