package com.lisz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/*
要保证@Configuration家在这里，并且要保证依赖里面加了thymeleaf相关的：
<dependency>
	<groupId>org.thymeleaf</groupId>
	<artifactId>thymeleaf-spring5</artifactId>
</dependency>

<dependency>
	<groupId>org.thymeleaf.extras</groupId>
	<artifactId>thymeleaf-extras-java8time</artifactId>
</dependency>
 */
@Configuration
public class MyConfig implements WebMvcConfigurer {
	// 启动Springboot的时候就会执行
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		System.out.println(2);
		registry.addViewController("/lisz").setViewName("hello-springboot");
	}

	@Bean
	public LocaleResolver localeResolver(){
		return new NativeLocaleResolver();
	}

	protected static class NativeLocaleResolver implements LocaleResolver{
		@Override
		public Locale resolveLocale(HttpServletRequest request) {
			String language = request.getParameter("language");
			Locale locale = Locale.getDefault();
			if (!StringUtils.isEmpty(language)){
				String[] split = language.split("_");
				locale = new Locale(split[0], split[1]);
			}
			return locale;
		}

		@Override
		public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

		}


	}
}

