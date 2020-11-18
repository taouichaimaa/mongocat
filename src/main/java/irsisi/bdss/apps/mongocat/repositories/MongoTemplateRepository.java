package irsisi.bdss.apps.mongocat.repositories;

import irsisi.bdss.apps.mongocat.models.Catalog;

import java.util.List;

public interface MongoTemplateRepository {
    // You will write your queries which will use mongoTemplate here.
    List<Catalog> findByCategoriesName(String category);
}
