package AnnotationBased.ValueAnno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestValueAnno {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MovieRecommender movieRecommender = context.getBean("movieRecommender",MovieRecommender.class);
        movieRecommender.printCatalog();
    }
}
