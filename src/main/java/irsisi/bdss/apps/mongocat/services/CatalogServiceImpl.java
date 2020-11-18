package irsisi.bdss.apps.mongocat.services;

import irsisi.bdss.apps.mongocat.models.Catalog;
import irsisi.bdss.apps.mongocat.repositories.CatalogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CatalogServiceImpl implements CatalogService{
ArrayList<Catalog> catalogs = new ArrayList<>();
@Autowired
    CatalogRepository catrep;
    @Override
    public ArrayList<Catalog> findByVille(String ville) {
        catalogs=catrep.findByVille(ville);
        return catalogs;
    }

    @Override
    public ArrayList<Catalog> findByCategories_Nom(String nom) {
        catalogs=catrep.findByCategories_Nom(nom);
        return catalogs;
    }
}
