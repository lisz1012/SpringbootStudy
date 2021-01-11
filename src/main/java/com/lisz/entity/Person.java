package com.lisz.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.List;

@Component
@ConfigurationProperties(prefix = "person")
@Validated
public class Person {
	//@Value("${person.name}")
	private String name;
	//@Value("${person.age}")
	private Integer age;
	//@Value("${person.gender}")
	private String gender;
	//@Value("#{'${person.likes}'.split(',')}")
	private List<String> likes;
	// @ConfigurationProperties 支持下划线到驼峰标识的转换
	private String lastName;
	// @Email的同时，在类上面还要加@Validate
	@Email
	private String email;

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				", gender='" + gender + '\'' +
				", likes=" + likes +
				", lastName='" + lastName + '\'' +
				", email='" + email + '\'' +
				'}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getLikes() {
		return likes;
	}

	public void setLikes(List<String> likes) {
		this.likes = likes;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
