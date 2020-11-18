package irsisi.bdss.apps.mongocat.controllers;

import irsisi.bdss.apps.mongocat.models.Catalog;
import irsisi.bdss.apps.mongocat.repositories.CategoriesRepository;
import irsisi.bdss.apps.mongocat.services.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class CategoriesController {

    @Autowired
    CategoriesService catServ;
    @Autowired
    CategoriesRepository carRepo;
    @RequestMapping(path="/findByNom",method= RequestMethod.GET)
    List<Catalog> findByNom(@PathParam("nom") String nom){
       return carRepo.findByNomLike(nom);

    }
}
