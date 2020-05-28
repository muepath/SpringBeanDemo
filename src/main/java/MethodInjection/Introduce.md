背景：  
无状态 Bean 的作用域一般可以配置为 singleton（单例模式），
如果我们往 singleton 的 Boss 中注入 prototype 的 Car，
并希望每次调用 commandManager 的 createCommand() 方法时都能够返回一个新的 
Command，使用传统的注入方式将无法实现这样的要求。
因为 singleton 的 Bean 注入关联 Bean 的动作仅有一次，
虽然 Command 的作用范围是 prototype 类型，但 commandManager
通过 createCommand() 方法返回的对象还是最开始注入的那个 Command。  

解决办法：
如果希望每次调用createCommand() 方法都返回一个新的 
Command  的实例，一种可选的方法就是让 commandManager 实现 ApplicationContextAware  
接口，且能够访问容器的引用，这样 commandManager 的 createCommand()
 方法就可以采取以下实现方式来达到目的：
```
protected Command createCommand() {
        // notice the Spring API dependency!
        return this.applicationContext.getBean("command", Command.class);
    }
```  
方法注入的引入：但这种依赖 Spring 框架接口的设计将应用与
 Spring 框架绑定在一起，部分开发者可能并不喜欢。
针对前面提出的需求，是否有既不与 Spring 框架绑定，
又可享受依赖注入好处的实现方案？Spring 没有让我们失望，
可以通过方法注入的方案完美地解决这个问题。
  
1.lookup 方法注入 （使用CGlib代理实现    
2.replaced-method 方法替换

