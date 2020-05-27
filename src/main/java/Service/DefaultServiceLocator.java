package Service;

public class DefaultServiceLocator {

    private static ClientService clientService = new ClientService();

    public ClientService createClientServiceInstance() {
        System.out.println("create Clientservice..");
        return clientService;
    }
}