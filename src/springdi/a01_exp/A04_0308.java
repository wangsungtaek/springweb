package springdi.a01_exp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import springdi.a01_start.z01_vo.Product;
import springdi.z04_vo.Game;
import springdi.z05_vo.Player;

public class A04_0308 {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext("springdi/a01_exp/container2.xml");
		// Component 기본 형식으로 호출..
		Game g01 = ctx.getBean("g01", Game.class);
		System.out.println("game"+g01);
		
		Player player = ctx.getBean("player", Player.class);
		System.out.println("player"+player);

		Product prod = ctx.getBean("prod", Product.class);
		System.out.println("# 파일에 객체 호출 #");
		System.out.println(prod.getName());
		System.out.println(prod.getPrice());
		System.out.println(prod.getCnt());
		
	}
}
