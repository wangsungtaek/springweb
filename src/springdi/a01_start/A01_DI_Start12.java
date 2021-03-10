package springdi.a01_start;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import springdi.a01_start.z01_vo.Person;
import springdi.z01_vo.Computer2;
import springdi.z01_vo.Mart;
import springdi.z05_vo.Buyer;

public class A01_DI_Start12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext("springdi/a01_start/container12.xml");
		
		Buyer buyer = ctx.getBean("buyer", Buyer.class);
		buyer.buy();
		
	}
}
