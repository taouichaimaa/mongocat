package irsisi.bdss.apps.mongocat.services;

import irsisi.bdss.apps.mongocat.models.Catalog;

import java.util.ArrayList;

public interface CatalogService {
    ArrayList<Catalog>  findByVille(String ville);
    ArrayList<Catalog> findByCategories_Nom(String nom);
}
