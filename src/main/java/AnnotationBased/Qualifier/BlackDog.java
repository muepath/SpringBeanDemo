package AnnotationBased.Qualifier;

import org.springframework.stereotype.Component;


public class BlackDog implements Dog {

    @Override
    public void shut() {
        System.out.println("blackDog shut ...");
    }
}
