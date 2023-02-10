package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
 Eliminate vebosity in creating Java Beans
 Public accesor methods, constructor
 equals,hascode and toString are automatically created
 record Person : Released in JDK 16 
 */

// You do not need to create getter/setter this creates automatically
record Person(String name, int age, Long iD, String eMail) {
}

//You can add this as parameter into Person as well
record Adress(String street, int plz) {}


@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Name";
	}
	
	@Bean
	public int age() {
		return 15;
	}
	
	@Bean
	public Long iD() {
		return 1L;
	}
	
	@Bean
	public String eMail() {
		return "xyz@abc.com";
	}
	
	@Bean
	public Person person() {
		return new Person("Alex",20,1L,"alex@abc.com");
	}
	
	@Bean
	public Person personWithMethods() {
		return new Person(name(),age(),iD(),eMail());
	}
	
	@Bean
	public Person personWithParameters(String name, int age, Long iD, String eMail) {
		return new Person(name,age,iD,eMail);
	}
	
	
	@Bean(name ="adress2")  //Customizing Bean's name
	public Adress adress() {
		return new Adress("Baker Str.", 39233);
	}
	
}
