package AnnotationBased.AutoWired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWiredAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/AnnotationBased/AutoWired/AutoWired.xml");
//        TextEditor te = (TextEditor) context.getBean("textEditor");
//        te.spellCheck();
          Student student = context.getBean("student",Student.class);
          System.out.println(student.getName()+","+student.getAge());
    }

}
