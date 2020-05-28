package MethodInjection;

import java.util.HashMap;
import java.util.Map;

public class Command {
    private HashMap<String,Integer> state;
    public void setState(Map commandState){
        this.state= (HashMap<String, Integer>) commandState;
    }
    public Object execute(){
        state.forEach((k,v)->{
            System.out.println(k+":"+v);
        });
        return "execute success";
    }
}
