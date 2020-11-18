package irsisi.bdss.apps.mongocat.repositories;

import irsisi.bdss.apps.mongocat.models.Catalog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface CatalogRepository extends  MongoRepository<Catalog, String>, MongoTemplateRepository {

    ArrayList<Catalog> findByVille(String ville);
    ArrayList<Catalog> findByCategories_Nom(String nom);



}
