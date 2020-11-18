package irsisi.bdss.apps.mongocat.services;



import irsisi.bdss.apps.mongocat.models.Review;

import java.util.List;

public interface ReviewsService {
    List<Review> findByNom(String Nom);
    List<Review> findAll();
}
