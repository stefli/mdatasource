package com.stefli.db.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.stefli.db.service.IPersonService;

public class Main {

	public static void main(String args[]) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		IPersonService service = (IPersonService) ctx.getBean("personService");
		System.out.println(service.findAll());
		int len = 6;
		for(int i=0;i<len;i++) {
			String name = "stefli-" + i;
			service.createPerson(name);
		}
		System.out.println(service.findAll());
	}

}
