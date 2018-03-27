package pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testsprings {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("beans.xml");
		/*Identifier id = (Identifier)ctx.getBean("b1");
		id.display();
		Identifier id1 = (Identifier)ctx.getBean("b2");
		id1.display
		();*/
		customer c = (customer)ctx.getBean("b2");
		c.getInformation();
		/*bank bank1 = (bank)ctx.getBean("bank");
		System.out.println(bank1.getLocations());*/
		
		
		// TODO Auto-generated method stub

	}

}
