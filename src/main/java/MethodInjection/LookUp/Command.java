package MethodInjection.LookUp;



public class Command {
    private Object state;
    public void setState(Object commandState){
        this.state= commandState;
    }
    public Object execute(){
        System.out.println(state);
        return "execute success";
    }
}
