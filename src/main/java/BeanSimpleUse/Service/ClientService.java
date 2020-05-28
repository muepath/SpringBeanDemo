package BeanSimpleUse.Service;
//用静态工厂方法实例化
public class ClientService {
    private static ClientService clientService = new ClientService();
    public ClientService() {}

    public static ClientService createInstance() {
        return clientService;
    }
    public void call(){
        System.out.println("call .....");
    }
}