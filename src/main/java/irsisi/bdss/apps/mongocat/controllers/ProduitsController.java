package irsisi.bdss.apps.mongocat.controllers;

import irsisi.bdss.apps.mongocat.models.Catalog;
import irsisi.bdss.apps.mongocat.models.Produit;
import irsisi.bdss.apps.mongocat.repositories.CatalogRepository;
import irsisi.bdss.apps.mongocat.repositories.ProduitsRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RequestMapping("/produits")
@RestController
public class ProduitsController {


    final ProduitsRepository ProdRepository;


    public ProduitsController(ProduitsRepository prodRepository) {
        this.ProdRepository = prodRepository;
    }


    @GetMapping("/marque")
    public List<Produit> findByMarque(@PathParam("marque") String mar){
        return ProdRepository.findByMarque(mar) ;
    }
}
