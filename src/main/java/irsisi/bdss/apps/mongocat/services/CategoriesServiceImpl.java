package irsisi.bdss.apps.mongocat.services;

import irsisi.bdss.apps.mongocat.models.Catalog;
import irsisi.bdss.apps.mongocat.repositories.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriesServiceImpl implements CategoriesService  {
    @Autowired
    CategoriesRepository catRepo;
    @Override
    public List<Catalog> findByNom(String nom) {
        return catRepo.findByNomLike(nom);

    }
}
