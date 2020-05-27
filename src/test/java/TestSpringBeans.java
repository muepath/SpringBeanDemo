import Service.PetStoreService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringBeans {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/Service/Services.xml","/Dao/daos.xml");
        PetStoreService petStoreService = ctx.getBean("petStore",PetStoreService.class);
        petStoreService.sell(1);
    }
}
