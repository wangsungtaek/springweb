package springdi.a01_start;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import springdi.a01_start.z01_vo.Mart;
import springdi.a01_start.z01_vo.Person;

public class A01_DI_Start3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*

 */
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext("springdi/a01_start/container3.xml");
		Mart m01 = ctx.getBean("m01", Mart.class);
		m01.buy();
		
	}
}
