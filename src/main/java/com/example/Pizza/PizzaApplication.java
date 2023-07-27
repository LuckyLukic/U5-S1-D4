package com.example.Pizza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.Pizza.Classi.User;

@SpringBootApplication
public class PizzaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PizzaApplication.class, args);
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
               PizzaApplication.class);
		
		User user01 = (User) ctx.getBean("getUser01");
		User user02 = (User) ctx.getBean("getUser02");
		User user03 = (User) ctx.getBean("getUser03");
		User user04 = (User) ctx.getBean("getUser04");
		
		
	}

}
