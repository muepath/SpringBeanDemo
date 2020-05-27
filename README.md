# SpringBeanDemo
学习springBean

Spring Bean 三种构建方式的区别和作用。

####Spring Bean的依赖注入 
1.基于构造函数的依赖注入  
构造函数参数解析：构造函数参数类型匹配,构造函数参数索引,构造函数参数名称  
2.基于setter函数的依赖注入

springBean的循环依赖：  
1.构造器循环依赖（无法解决）  
2.setter循环依赖（可以解决）  
3.prototype范围的依赖处理（无法解决）  

父子bean 

depends-on 和ref 依赖的区别

自动装配