package irsisi.bdss.apps.mongocat.services;

import irsisi.bdss.apps.mongocat.models.Review;

import irsisi.bdss.apps.mongocat.repositories.ReviewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class ReviewsServiceImpl implements ReviewsService{
    @Autowired
    ReviewsRepository RevRep;

    @Override
    public List<Review> findByNom(String Nom) {
        return RevRep.findByNomLike(Nom);
    }

    @Override
    public List<Review> findAll() {
        return RevRep.findAll();
    }
}
