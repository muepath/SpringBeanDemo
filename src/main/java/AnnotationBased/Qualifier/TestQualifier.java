package AnnotationBased.Qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestQualifier {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/AnnotationBased/Qualifier/Qualifier.xml");
        Person person =  context.getBean("person",Person.class);
        person.letDogShut();
    }
}
