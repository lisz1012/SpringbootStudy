package com.lisz;

import com.lisz.servlet.MyServlet;
import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableSwagger2Doc
//有启动项目的时候如果有 Servlet 也要启动，就加上这个注解，还要把Servlet注册为Spring容器里的一个Bean，main方法下面进行了注册. Druid
// 需要配置一个Servlet。@ServletComponentScan(basePackages = "com.lisz.servlet")也能行，但是最好用ServletRegistrationBean注册
@ServletComponentScan
public class SpringbootStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootStudyApplication.class, args);
	}

	@Bean
	public ServletRegistrationBean<MyServlet> getServletRegistrationBean(){
		ServletRegistrationBean<MyServlet> bean = new ServletRegistrationBean<>(new MyServlet(), "/s2"); // 会把Servlet的@WebServlet中的urlPatterns的值给覆盖掉
		bean.setLoadOnStartup(1);
		return bean;
	}
}
