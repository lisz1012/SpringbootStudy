# Swagger 笔记

## Swagger搭建

- 引入pom.xml依赖：
```
<dependency>
    <groupId>com.spring4all</groupId>
    <artifactId>swagger-spring-boot-starter</artifactId>
    <version>1.9.1.RELEASE</version>
</dependency>
```
（这里最好用spring-boot-starter-parent的2.1.7版本，以便与1.9.1匹配, 详见：  
https://github.com/lisz1012/SpringbootStudy/blob/master/pom.xml）
- 在启动类(如：SpringbootStudyApplication)定义的上面写上注解：`@EnableSwagger2Doc`
- 写好自己的Controller（带有@RestController或者@Controller注解的）
- 启动Springboot项目（也可以运行启动类的main方法）
- 访问本地 Swagger UI：http://localhost:8080/swagger-ui.html
- 选择要测试的Controller