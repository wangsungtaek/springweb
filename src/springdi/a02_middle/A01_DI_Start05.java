package springdi.a02_middle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import springdi.a01_start.z01_vo.Person;
import springdi.a02_middle.z01_vo.Bus;
import springdi.a02_middle.z01_vo.Buyer;
import springdi.a02_middle.z01_vo.Passenger;
import springdi.a02_middle.z03_vo.Computer;
import springdi.a02_middle.z03_vo.Ram;

public class A01_DI_Start05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 가상
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext("springdi/a02_middle/container05.xml");
		Computer computer = ctx.getBean("computer", Computer.class);
		Ram ram = ctx.getBean("ram", Ram.class);
		ram.setCompany("하이닉스");
		ram.setSpec("16GB");
		
		computer.info();
	}
}
