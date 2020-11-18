package irsisi.bdss.apps.mongocat.controllers;

import irsisi.bdss.apps.mongocat.models.Catalog;
import irsisi.bdss.apps.mongocat.models.Reviews;
import irsisi.bdss.apps.mongocat.repositories.ReviewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReviewsController {
    @Autowired
    ReviewsRepository reRep;

    @RequestMapping(path="/reviews/findByNom",method= RequestMethod.GET)
    public  int findByCategoryName(@RequestParam("Nom") String Nom){
       return reRep.findByNomLike(Nom).size();
    }
    @RequestMapping(path="/reviews/findAll",method= RequestMethod.GET)
    public  int findAll(){
        return reRep.findAll().size();
    }

}
