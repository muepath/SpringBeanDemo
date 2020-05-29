package AnnotationBased.ValueAnno;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MovieRecommender {
    @Value("${catalog.name}")
    private  String catalog;


    public MovieRecommender(String catalog) {
        this.catalog = catalog;
    }
    public MovieRecommender() {

    }
    public void printCatalog(){
        System.out.println(catalog);
    }
}
