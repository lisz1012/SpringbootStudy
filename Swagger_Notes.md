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
（注意：这里要用spring-boot-starter-parent的2.1.7版本，以便与1.9.1匹配, 否则报错、启动失败。详见：  
https://github.com/lisz1012/SpringbootStudy/blob/master/pom.xml ）
- 在启动类(如：SpringbootStudyApplication.java)定义的上面写上注解：`@EnableSwagger2Doc`
- 写好自己的Controller（带有@RestController或者@Controller注解的）
- 启动Springboot项目（也可以运行启动类的main方法）
- 访问本地 Swagger UI：http://localhost:8080/swagger-ui.html
- 选择要测试的Controller
- 选择需要测试的API，点击"Try it out"
- 对于需要参数的API，输入参数值
- Execute

另外，在 http://localhost:8080/v2/api-docs 中可以访问类似 https://editor.swagger.io/ 中左侧部分的API定义描述代码，
只是浏览器显示的格式比较乱