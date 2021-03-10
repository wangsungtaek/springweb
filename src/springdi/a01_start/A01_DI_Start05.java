package springdi.a01_start;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import springdi.a01_start.z01_vo.Book;
import springdi.a01_start.z01_vo.Mart;
import springdi.a01_start.z01_vo.MyMusic;
import springdi.a01_start.z01_vo.Person;
import springdi.a01_start.z01_vo.Sensor;

public class A01_DI_Start05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*

 */
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext("springdi/a01_start/container5.xml");
		Mart fMart = ctx.getBean("fMart", Mart.class);
		fMart.buyStrList();
		
		MyMusic myArtist = ctx.getBean("myArtist", MyMusic.class);
		myArtist.showMusicList();
		
		Sensor sensor1 = ctx.getBean("sensor1", Sensor.class);
		// sensor1 참조변수만 호출하면 기본적으로 toString()로 선언된 부분이 호출된다.
		System.out.println(sensor1);
		
	}
}
