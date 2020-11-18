package irsisi.bdss.apps.mongocat.repositories;

import irsisi.bdss.apps.mongocat.models.Catalog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriesRepository extends MongoRepository<Catalog,String> {
    @Query(value="{'categories.nom': ?0",fields = "{ '_id': 0,'nom':1,'address':0,'ville':0, 'categories.$': 1 }")
    public  List<Catalog> findByNomLike(String nom);


}
