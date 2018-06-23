package com.wint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.wint.controllers.ConstructorInjectedController;
import com.wint.controllers.MyController;
import com.wint.controllers.PropertyInjectedController;
import com.wint.controllers.SetterInjectedController;

@SpringBootApplication
public class DepInjDemoApplication {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DepInjDemoApplication.class, args);
		MyController controller = (MyController) context.getBean("myController");

		System.out.println(context.getBean(MyController.class).sayHello());
		System.out.println(context.getBean(PropertyInjectedController.class).sayHello()); 
		System.out.println(context.getBean(SetterInjectedController.class).sayHello()); 
		System.out.println(context.getBean(ConstructorInjectedController.class).sayHello());
	}
}
