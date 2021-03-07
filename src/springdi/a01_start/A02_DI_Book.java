package springdi.a01_start;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import springdi.a01_start.z01_vo.Book;
import springdi.a01_start.z01_vo.Mart;
import springdi.a01_start.z01_vo.Person;

public class A02_DI_Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*

 */
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext("springdi/a01_start/container4_book.xml");
		Book b01 = ctx.getBean("b01", Book.class);
		System.out.println(b01.getName());
		System.out.println(b01.getPrice());
		System.out.println(b01.getAuthor());
	}
}
