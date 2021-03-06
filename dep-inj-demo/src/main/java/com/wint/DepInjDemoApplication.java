package com.wint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.wint.controllers.ConstructorInjectedController;
import com.wint.controllers.MyController;
import com.wint.controllers.PropertyInjectedController;
import com.wint.controllers.SetterInjectedController;
import com.wint.examplebeans.FakeDataSource;
import com.wint.examplebeans.FakeJmsBroker;

@SpringBootApplication
public class DepInjDemoApplication {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DepInjDemoApplication.class, args);
		MyController controller = (MyController) context.getBean("myController");

		FakeDataSource fakeDataSource = (FakeDataSource) context.getBean(FakeDataSource.class);
		FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) context.getBean(FakeJmsBroker.class);
		
		System.out.println(fakeDataSource.getUser());
		System.out.println(fakeJmsBroker.getPassword());
	}
}
