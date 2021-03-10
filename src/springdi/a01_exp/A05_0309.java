package springdi.a01_exp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import springdi.a01_exp.z01_vo.Team;


public class A05_0309 {
	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext("springdi/a01_exp/container3.xml");
/*		
[하] 1. autowire란 무엇인가? 개념과 옵션을 기술하세요	
	1) 개념
		스프링이 빈의 요구사항과 매칭되는 애플리케이션 컨텍스상
		다른 빈을 찾아 빈 간의 의존성을 자동으로 만족시키도록 하는 처리를 말한다.
	2) 옵션
		- byType : 메서드를 통해서 해당 type이 정의될 때,
			자동으로 할당 된다.
		- byName : 메서드를 통해서 해당 type이 있고,
			참조변수가 메서드의 property와 동일할 때 자동으로 할당 된다.
		- constructor : 생성자가 정의에 해당 type있을 때.
		- autoedtect : 생성자나 메서드에 해당 type이 있을 때 자동으로 할당 된다.
*/
/*
[하] 2. Team과 Player를 동일한 패키지에 선언하고, 연관관계를 설정한 후, 
		autowire의 이용하여 Player pl1, pl2, pl3이 선언되었을 때,
		pl2를 객체로 Team에 할당할려고 사용되는 컨테이너 코드를 기술하세요.   
*/
		Team team = ctx.getBean("team",Team.class);
		team.showInfo();
	}
}