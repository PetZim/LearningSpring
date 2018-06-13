package com.wint;

import org.omg.CORBA.CTX_RESTRICT_SCOPE;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.wint.controllers.MyController;

@SpringBootApplication
public class DepInjDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DepInjDemoApplication.class, args);
		MyController controller = (MyController) context.getBean("myController");
		controller.hello();
	}
}
