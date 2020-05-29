package AnnotationBased.Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class Person {
    @Autowired
    @Qualifier("blackDog")
    private Dog dog;

    public void letDogShut(){
        dog.shut();
    }
}
