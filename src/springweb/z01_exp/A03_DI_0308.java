package springweb.z01_exp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import springweb.z01_exp.z01_vo.Product;
import springweb.z01_exp.z01_vo.Sensor;
import springweb.z01_exp.z04_vo.Player;
import springweb.z01_exp.z04_vo.Team;

public class A03_DI_0308 {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext("springweb/z01_exp/container_0308.xml");
		// ex1)
		springweb.z01_exp.z01_vo.Team team = ctx.getBean("team", 
				springweb.z01_exp.z01_vo.Team.class);
		team.showInfo();
		
		// ex2)
		Sensor sensor = ctx.getBean("sensor", Sensor.class);
		System.out.println(sensor);
		
		// ex3)
		Team team02 = ctx.getBean("team02", Team.class);
		Player play01 = ctx.getBean("play01", Player.class);
		System.out.println("객체 생성 확인:"+team02);
		System.out.println("객체 생성 확인:"+play01);
		
		// ex4)		
		Product prod = ctx.getBean("product", Product.class);
		System.out.println(prod.getName());
		System.out.println(prod.getPrice());
		System.out.println(prod.getCnt());
	}
}
