package irsisi.bdss.apps.mongocat.services;

import irsisi.bdss.apps.mongocat.models.Catalog;
import org.springframework.data.mongodb.repository.Query;

import java.util.ArrayList;
import java.util.List;

public interface CatalogService {
    List<Catalog>  findByVille(String ville);
    List<Catalog> findByCategories_Nom(String nom);
  //  List<Catalog> findByCategories_Produits_Marque(String nom);
  @Query("{'categories.produits.marque': ?0}")
  List<Catalog> findByMarque(String nom);
}
