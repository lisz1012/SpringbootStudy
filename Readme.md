# 笔记

寻找各种Spring starter相关的依赖：  
https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/reference/html/using-spring-boot.html#using-boot-starter
直接把opm中的dependency粘过来，到我们的pom文件中就可以了  

启动类SpringbootStudyApplication的位置是不能随便放置的，改变路径的时候要加一个配置项, 最好不要动它  
可以加上@ComponentScan("com.lisz")让Springboot扫描到，但是一般不去动启动类的存放位置