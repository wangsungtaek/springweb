package springdi.a01_start;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import springdi.a01_start.z01_vo.Book;
import springdi.a01_start.z01_vo.Computer;
import springdi.a01_start.z01_vo.Mart;
import springdi.a01_start.z01_vo.Person;

public class A02_DI_Computer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext("springdi/a01_start/container5_Computer.xml");
		Computer com = ctx.getBean("com", Computer.class);
		com.showInfo();
	}
}
