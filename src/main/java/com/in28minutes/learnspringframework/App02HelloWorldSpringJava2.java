package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PackmanGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;

public class App02HelloWorldSpringJava2 {

	public static void main(String[] args) {
	// The logic goes like this:
		
	//1: Launch a Spring Context in Class A: 
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
	//2: Configure the things that we want Spring to manage : 
		// write @Configuration above of the Class B:
			//in Class B: 
				//write @Bean above of the Methods that we will call below with Sout
		
		
	//3: Retrieves Beans managed by Spring
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("iD"));
		System.out.println(context.getBean("eMail"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("personWithMethods"));
		System.out.println(context.getBean("personWithParameters"));
		System.out.println(context.getBean("adress2"));    // Option #1
		System.out.println(context.getBean(Adress.class)); // Option #2				
	}
}