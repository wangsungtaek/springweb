package springdi.a01_start;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import springdi.a01_start.z01_vo.Person;
import springdi.a01_start.z01_vo.Restore;

public class A01_DI_Start06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*

 */
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext("springdi/a01_start/container6.xml");
		
		Restore restore = ctx.getBean("restore", Restore.class);
		System.out.println(restore);
	}
}
