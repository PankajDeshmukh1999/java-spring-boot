package com.codekul.java28SeptFullStack;

import com.codekul.java28SeptFullStack.di.Company;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Java28SeptFullStackApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Java28SeptFullStackApplication.class, args);

		Company e = context.getBean(Company.class);
		e.getData();
	}
//	@GetMapping("Hello Spring")
//	public void getMsg(){
//		System.out.println("Hello");
//	}
}
