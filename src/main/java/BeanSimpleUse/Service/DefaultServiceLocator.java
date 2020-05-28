package BeanSimpleUse.Service;

import BeanSimpleUse.Service.ClientService;

//通过静态工厂生成bean
public class DefaultServiceLocator {

    private static ClientService clientService = new ClientService();

    public ClientService createClientServiceInstance() {
        System.out.println("create Clientservice..");
        return clientService;
    }
}