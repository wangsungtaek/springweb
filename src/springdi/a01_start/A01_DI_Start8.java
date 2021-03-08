package springdi.a01_start;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import springdi.a01_start.z03_vo.Computer;
import springdi.a01_start.z02_vo.Person;
import springdi.a01_start.z02_vo.Product;

public class A01_DI_Start8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*

 */
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext("springdi/a01_start/container8.xml");
		
		Person p02 = ctx.getBean("p02", Person.class);
		Product prod03 = ctx.getBean("prod03", Product.class);
		
		System.out.println("객체생성여부(person):"+p02);
		System.out.println("객체생성여부(prod):"+prod03);
		
		Computer com = ctx.getBean("computer", Computer.class);
		com.showInfo();
		
	}
}
