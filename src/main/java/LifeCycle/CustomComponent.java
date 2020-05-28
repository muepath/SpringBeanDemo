package LifeCycle;

import org.springframework.context.SmartLifecycle;

//SmartLifecycle作用：在容器启动的时候，来进行一些初始化操作。
public class CustomComponent implements SmartLifecycle {

    private boolean hasData;

    @Override
    public boolean isRunning() {
        // TODO Auto-generated method stub
        System.out.println("isRunning....");
        return hasData;
    }

    @Override
    public void start() {
        System.out.println(">>>>>>>>>>>>>");
        System.out.println("start启动服务加载的数据：.....");
        hasData=true;
    }

    @Override
    public void stop() {
        System.out.println("stop....");
    }

    @Override
    public int getPhase() {
        // TODO Auto-generated method stub
        System.out.println("getPhase.....");
        return 0;
    }

    @Override
    public boolean isAutoStartup() {
        // TODO Auto-generated method stub
        System.out.println("isAutoStartup.....");
        return true;
    }
    //等到ApplicationContext执行stop时，若isRunning 返回true，stop执行。
    @Override
    public void stop(Runnable arg0) {
        stop();
        if(hasData) {
            System.out.println("删除表");
        }
    }

    public void setHasData(Boolean hasData) {
        System.out.println("setHasData....");
        this.hasData=hasData;
    }
}