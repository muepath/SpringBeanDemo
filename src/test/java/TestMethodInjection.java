import MethodInjection.CommandManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;

public class TestMethodInjection {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/MethodInjection/MethodInjection.xml");
        CommandManager manager = context.getBean("commandManager", CommandManager.class);
        Map<String,Integer> map =  new HashMap<>();
        map.put("clear",1);
        System.out.println(manager.process(map));

    }
}
