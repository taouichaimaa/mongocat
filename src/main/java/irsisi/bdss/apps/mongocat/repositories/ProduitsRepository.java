package irsisi.bdss.apps.mongocat.repositories;

import irsisi.bdss.apps.mongocat.models.Produit;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface ProduitsRepository extends MongoRepository<Produit,String> {
    /* @Query(value="{'categories.nom' : ?0",fields="{'produits.reference':1,'produits.libelle':1,'produits.price':1,'produits.marque':1,'produits.stock':1,'produits.image':1")
    ArrayList<Produits> findByCategory(String category);*/

    ArrayList<Produit> findByMarqueOrLibelle(String marque, String libelle);
    ArrayList<Produit> findByPriceLessThanEqual(float price);
    ArrayList<Produit> findByPriceGreaterThanEqual(float price);





}
