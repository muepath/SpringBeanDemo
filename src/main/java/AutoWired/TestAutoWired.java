package AutoWired;

import AutoWired.Person;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;

public class TestAutoWired {
    public static void main(String[] args) {
        GenericApplicationContext context = new GenericApplicationContext();
//        new XmlBeanDefinitionReader(context).loadBeanDefinitions("/AutoWired/no.xml");  无自动装配
//        new XmlBeanDefinitionReader(context).loadBeanDefinitions("/AutoWired/byName.xml");   自动装配byName
        new XmlBeanDefinitionReader(context).loadBeanDefinitions("/AutoWired/byType.xml"); //自动装配byType
        context.refresh();
//        Person person = context.getBean("no", Person.class);
//        Person person = context.getBean("byName", Person.class);
        Person person = context.getBean("byType", Person.class);
        person.getCat().sayCat();
    }
}
