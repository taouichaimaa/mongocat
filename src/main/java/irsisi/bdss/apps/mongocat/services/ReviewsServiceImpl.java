package irsisi.bdss.apps.mongocat.services;

import irsisi.bdss.apps.mongocat.models.Reviews;
import irsisi.bdss.apps.mongocat.repositories.ReviewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class ReviewsServiceImpl implements ReviewsService{
    @Autowired
    ReviewsRepository RevRep;

    @Override
    public List<Reviews> findByNom(String Nom) {
        return RevRep.findByNomLike(Nom);
    }

    @Override
    public List<Reviews> findAll() {
        return RevRep.findAll();
    }
}
