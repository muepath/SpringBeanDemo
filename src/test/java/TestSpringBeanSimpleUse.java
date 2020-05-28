import BeanSimpleUse.Service.AccountService;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;

public class TestSpringBeanSimpleUse {
    public static void main(String[] args) {
       // ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/BeanSimpleUse.Service/Services.xml","/BeanSimpleUse.Service.Dao/daos.xml");
        GenericApplicationContext context = new GenericApplicationContext();
        new XmlBeanDefinitionReader(context).loadBeanDefinitions("/BeanSimpleUse/Service/Services.xml","/BeanSimpleUse/Dao/daos.xml");
        context.refresh();
//        PetStoreService petStoreService = context.getBean("petStore",PetStoreService.class);
//        petStoreService.sell(1);
//        ClientService clientService =  context.getBean("clientService1", ClientService.class);
//        clientService.call();
//       System.out.println(context.getType("clientService1"));
//        ExampleBean exampleBean = context.getBean("exampleBean2", ExampleBean.class);
//        System.out.println(exampleBean.toString());
        AccountService accountService = context.getBean("accountService1",AccountService.class);
       accountService.show();
    }
}
