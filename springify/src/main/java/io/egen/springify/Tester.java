package io.egen.springify;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tester {
	public static void main(String args[]){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		HelloWorld hello = context.getBean(HelloWorld.class);
		hello.helloWorld();
		context.close();
	}
}
