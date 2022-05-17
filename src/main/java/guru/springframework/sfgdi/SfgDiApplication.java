package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		// .run will return an application context
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		// the getBean method should get the lower case of the controller's class name
		// through the context getBean method, spring constructs a controller object for us.
		MyController myController = (MyController)ctx.getBean("myController");
		// get the return value of the sayHello method in the controller and store it to the string "greeting"
		String greeting = myController.sayHello();
		// sayHello method is also evoked. so the print in sayHello is also present in the console.
		System.out.println(greeting);

		System.out.println("-----property");
		PropertyInjectedController propertyInjectedController =
				(PropertyInjectedController)ctx.getBean("propertyInjectedController");
		System.out.println(		propertyInjectedController.getGreeting());
	}

}
