SmartLifecycle作用：在容器启动的时候，来进行一些初始化操作。  

对所有的bean在生命周期的不同阶段进行一些操作：  
1.BeanFactoryPostProcessor 实现该接口  
2.InstantiationAwareBeanPostProcessor 实现该接口
3.BeanPostProcessor 实现该接口  
ApplicationContext 会自动寻找并注册实现了上面这些接口的类  

对每个bean的生命周期的不同阶段进行一些操作：  
1.实现BeanFactoryAware, BeanNameAware,ApplicationContextAware可以
在该bean类使用工厂和获得beanName。  
2.实现InitializingBean接口可以在bean初始化之前做一些操作，或者使用
init-method标签来实现。  
3.实现DisposableBean接口可以在bean销毁之前做一些操作，或者使用 destory-method标签来实现。