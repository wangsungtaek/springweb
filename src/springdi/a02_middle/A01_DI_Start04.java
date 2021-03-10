package springdi.a02_middle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import springdi.a01_start.z01_vo.Person;
import springdi.a02_middle.z01_vo.Bus;
import springdi.a02_middle.z01_vo.Buyer;
import springdi.a02_middle.z01_vo.Passenger;

public class A01_DI_Start04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 가상
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext("springdi/a02_middle/container04.xml");
		Passenger p01 = ctx.getBean("passenger", Passenger.class);
		Bus bus = ctx.getBean("bus", Bus.class);
		
		bus.goBus();
	}
}
