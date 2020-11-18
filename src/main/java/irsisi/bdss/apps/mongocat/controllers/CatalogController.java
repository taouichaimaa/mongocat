package irsisi.bdss.apps.mongocat.controllers;

import irsisi.bdss.apps.mongocat.models.Catalog;
import irsisi.bdss.apps.mongocat.repositories.CatalogRepository;
import irsisi.bdss.apps.mongocat.services.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CatalogController {
    @Autowired
    CatalogService catServ;
    @Autowired
    CatalogRepository catRepo;

    @GetMapping("/findByCategoryName")
    public int findByCategoryName(@RequestParam("CategoryName") String Category) {
//        List<Catalog> CatList;
//        CatList = catRepo.findByCategoriesName(Category);
//        if (CatList == null) {
//            return -1;
//        }
//        return CatList.size();
        return 0;
    }
}
