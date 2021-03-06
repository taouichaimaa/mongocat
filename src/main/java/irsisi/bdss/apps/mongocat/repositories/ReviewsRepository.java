package irsisi.bdss.apps.mongocat.repositories;

import irsisi.bdss.apps.mongocat.models.Catalog;
import irsisi.bdss.apps.mongocat.models.Review;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ReviewsRepository  extends MongoRepository<Review,String> {
    public List<Review> findByNomLike(String Nom);
    List<Review> findAll();
}
