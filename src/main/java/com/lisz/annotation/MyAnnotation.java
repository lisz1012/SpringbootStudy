package com.lisz.annotation;

import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyAnnotation {
	public String name = "lisz";
	String name() default "lisz";
}

class Test {
	@MyAnnotation(name="hehe")
	private String name;

	@MyAnnotation
	public void haha(){

	}
}