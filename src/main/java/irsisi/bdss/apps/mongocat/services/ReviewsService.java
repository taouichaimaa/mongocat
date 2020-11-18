package irsisi.bdss.apps.mongocat.services;

import irsisi.bdss.apps.mongocat.models.Reviews;

import java.util.List;

public interface ReviewsService {
    List<Reviews> findByNom(String Nom);
    List<Reviews> findAll();
}
