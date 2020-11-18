package irsisi.bdss.apps.mongocat.repositories;

import irsisi.bdss.apps.mongocat.models.Catalog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface CatalogRepository extends  MongoRepository<Catalog, String> {

    List<Catalog> findByVille(String ville);

    List<Catalog> findByCategories_Nom(String nom);
   @Query("{'categories.produits.marque': ?0}")
    List<Catalog> findByMarque(String nom);


}
