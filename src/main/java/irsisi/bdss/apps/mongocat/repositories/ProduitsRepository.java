package irsisi.bdss.apps.mongocat.repositories;

import irsisi.bdss.apps.mongocat.models.Produit;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface ProduitsRepository extends MongoRepository<Produit,String> {
    /* @Query(value="{'categories.nom' : ?0",fields="{'produits.reference':1,'produits.libelle':1,'produits.price':1,'produits.marque':1,'produits.stock':1,'produits.image':1")
    ArrayList<Produits> findByCategory(String category);*/
//wil return empty list--our db's archi is funky??
    ArrayList<Produit> findByMarque(String marque);
    ArrayList<Produit> findByPriceLessThanEqual(Double price);
    ArrayList<Produit> findByPriceGreaterThanEqual(Double price);





}
