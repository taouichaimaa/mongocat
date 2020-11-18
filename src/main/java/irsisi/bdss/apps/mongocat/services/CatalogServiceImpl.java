package irsisi.bdss.apps.mongocat.services;

import irsisi.bdss.apps.mongocat.models.Catalog;
import irsisi.bdss.apps.mongocat.repositories.CatalogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CatalogServiceImpl implements CatalogService{
List<Catalog> catalogs = new ArrayList<>();
@Autowired
    CatalogRepository catrep;
    @Override
    public List<Catalog> findByVille(String ville) {
        catalogs=catrep.findByVille(ville);
        return catalogs;
    }

    @Override
    public List<Catalog> findByCategories_Nom(String nom) {
        catalogs=catrep.findByCategories_Nom(nom);
        return catalogs;
    }

    @Override
    public List<Catalog> findByMarque(String nom) {
        catalogs=catrep.findByMarque(nom);
        return catalogs;
    }

    @Override
    public List<Catalog> findByVilleOrNomOrCategories_Nom(String Ville, String Nom, String CatNom) {
        catalogs=catrep.findByVilleOrNomOrCategories_Nom(Ville,Nom,CatNom);
        return catalogs;
    }



   /* @Override //not working even though f documentation hia likayna
    public List<Catalog> findByCategories_Produits_Marque(String nom) {
        catalogs=catrep.findByCategories_Produits_Marque(nom);
        return catalogs;
    }*/

}
