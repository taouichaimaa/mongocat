package irsisi.bdss.apps.mongocat.repositories;

import com.mongodb.DBObject;
import irsisi.bdss.apps.mongocat.models.Catalog;
import irsisi.bdss.apps.mongocat.models.Categories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;

import org.springframework.data.mongodb.core.aggregation.*;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;
import java.util.function.Consumer;

import static org.springframework.data.mongodb.core.aggregation.Aggregation.*;


public class CatalogRepositoryImpl implements MongoTemplateRepository{
    @Autowired
    MongoTemplate mongoTem;
    private MongoOperations mongoOperations;
    @Override
    public List<Catalog> findByCategoriesName(String category) {
        Query query = new Query();
        query.addCriteria(Criteria.where("categories.nom").is(category));
        query.fields().include("categories");
        MatchOperation match = match(new Criteria("categories.name").is(category));
        UnwindOperation unwind = unwind("categories");
        ProjectionOperation project = project().andExclude("_id").andExclude("nom").andExclude("address").andExclude("ville").andArrayOf("categories").as("Category");
        Aggregation aggregation = newAggregation(match, unwind, project);
        AggregationResults<DBObject> result = mongoOperations.aggregate(aggregation, "catalog", DBObject.class);
        result.forEach(new Consumer<DBObject>() {

            public void accept(DBObject obj){
                System.out.println(obj.toString());
            }
        });

        return mongoTem.find(query, Catalog.class);
    }
}
