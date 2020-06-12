# Spring 基础框架

Spring比EJB更加轻量级。如果写代码的时候需要继承框架中的很多接口和抽象类，那样就是重了。开发的时候更加倾向于弱耦合、轻量级。
数据库设计的时候预留字段，以备扩充。SSH 还是要看一下，了解一下这套技术为什么被淘汰掉了（麻烦，各有各的配置文件，至少三个配置文件整合）
后来就有了SSM（用的也比较少了，现在多是Springboot，约定大于配置）Spring Boot、Spring Cloud、Spring Cloud Data Flow所依托的都是
Spring Framework。生态是非常重要的，Spring比较火就是因为生态。需要什么功能加入，Spring家族都有提供  

中文文档：https://github.com/DocsHome/spring-docs/blob/master/SUMMARY.md  
这里可以下载Spring所有版本的Jar包：https://repo.spring.io/release/org/springframework/spring/

## IOC

DI指的是实现手段，IOC指的是思想。解耦合：一个组件坏掉了整体就不work了。IOC容器置于所有的组件之中，相当于粘合剂，将系统的对象粘合在一起
发挥作用。高内聚、低耦合。耦合可以是项目组件层面的也可以是代码对象层面的