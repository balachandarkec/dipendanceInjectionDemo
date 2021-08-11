package diDemo.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import diDemo.ConstructorBased.ConstructorBased;
import diDemo.FieldBased.FieldBased;
import diDemo.config.AppConfig;
import diDemo.service.SmsService;
import diDemo.service.UserService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext appcontext=new AnnotationConfigApplicationContext(AppConfig.class);
		 // ConstructorBased Injection
		//ConstructorBased obj1= appcontext.getBean(ConstructorBased.class);
		
		// Setter Based Injection
		//UserService obj1= appcontext.getBean(UserService.class);
		
		//obj1.processMsg("Hello twitter");
		
		// Field Based Injection
		FieldBased obj1=appcontext.getBean(FieldBased.class);
				
				obj1.processMsg("FieldBased Injection");
     
	}

}
