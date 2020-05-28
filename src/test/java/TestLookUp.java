import MethodInjection.LookUp.CommandManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLookUp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/MethodInjection/LookUp/Lookup.xml");
        CommandManager manager = context.getBean("commandManager", CommandManager.class);
       System.out.println(manager.process("sudo:1"));
    }
}
