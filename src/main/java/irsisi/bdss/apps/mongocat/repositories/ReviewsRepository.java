package irsisi.bdss.apps.mongocat.repositories;

import irsisi.bdss.apps.mongocat.models.Catalog;
import irsisi.bdss.apps.mongocat.models.Reviews;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ReviewsRepository  extends MongoRepository<Reviews,String> {
    public List<Reviews> findByNomLike(String Nom);
    List<Reviews> findAll();
}
