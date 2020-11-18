package irsisi.bdss.apps.mongocat.controllers;

import irsisi.bdss.apps.mongocat.models.Catalog;
import irsisi.bdss.apps.mongocat.repositories.CatalogRepository;
import irsisi.bdss.apps.mongocat.services.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("Catalog")
public class CatalogController {
    final CatalogRepository catalogRepository;


    public CatalogController(CatalogRepository catalogRepository) {
        this.catalogRepository = catalogRepository;
    }

    @GetMapping("/all")
    public List<Catalog> findAll(){
        return catalogRepository.findAll();
    }
   @GetMapping("/nom")
    public List<Catalog> findByCategoriesContaining(@PathParam("nom") String nom){
        return catalogRepository.findByCategories_Nom(nom);
   }
   @GetMapping("/ville")
   public List<Catalog> findByVille(@PathParam("ville") String ville){
       return catalogRepository.findByVille(ville);
   }

   /*@GetMapping("/produits/marque")
    public List<Catalog> findByProductsMarque(@PathParam("marque") String mark){
return catalogRepository.findByCategories_Produits_Marque(mark);
    }*/


}
