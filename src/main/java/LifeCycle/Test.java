package LifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("/LifeCycle/LifeCycle.xml");
//        ((ClassPathXmlApplicationContext)context).stop();

        System.out.println("现在开始初始化容器");

        ApplicationContext context = new ClassPathXmlApplicationContext("/LifeCycle/LifeCycle.xml");
        System.out.println("容器初始化成功");
        // 得到 Computer，并使用
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        System.out.println("现在开始关闭容器！");
        ((ClassPathXmlApplicationContext)context).registerShutdownHook();
    }
}
