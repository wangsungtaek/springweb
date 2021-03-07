package springdi.a01_start;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import springdi.a01_start.z01_vo.Product;

public class A01_DI_Start2 {

	public static void main(String[] args) {
/*
ex) Product.java 물건명 가격 갯수.
	container2.xml에 선언하고 해당 객체를 호출하여 처리하세요.
 */
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext("springdi/a01_start/container2.xml");
		
		Product prod = ctx.getBean("prod", Product.class);
		System.out.println(prod.getName());
		System.out.println(prod.getPrice());
		System.out.println(prod.getCnt());
	}
}
