package irsisi.bdss.apps.mongocat.services;

import irsisi.bdss.apps.mongocat.models.Catalog;

import java.util.List;

public interface CategoriesService {
    List<Catalog> findByNom(String nom);
}
