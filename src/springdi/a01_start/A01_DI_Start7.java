package springdi.a01_start;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import springdi.a01_start.z01_vo.Book;
import springdi.a01_start.z01_vo.Computer;
import springdi.a01_start.z01_vo.Mart;
import springdi.a01_start.z01_vo.Person;
import springdi.a01_start.z01_vo.Product;

public class A01_DI_Start7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*

 */
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext("springdi/a01_start/container7.xml");
		Person p01 = ctx.getBean("person", Person.class);
		Book book = ctx.getBean("book", Book.class);
		Mart mart = ctx.getBean("mart", Mart.class);
		Product prod = ctx.getBean("prod", Product.class);
		
		System.out.println("객체생성여부(person):"+p01);
		System.out.println("객체생성여부(book):"+book);
		System.out.println("객체생성여부(mart):"+mart);
		System.out.println("객체생성여부(prod):"+prod);

	}
}
