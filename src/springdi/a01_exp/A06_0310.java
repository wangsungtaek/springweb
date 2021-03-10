package springdi.a01_exp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import springdi.a01_exp.z01_vo.Team;
import springdi.a01_exp.z02_vo.Company;


public class A06_0310 {
	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext("springdi/a01_exp/container4.xml");
		/*
		[하] 1. 소스에 @Autowired 설정처리시,
			사용되는 객체와 객체간의 연계부분을 기술하세요.
		*/
		
		/*
		[하] 2. 특정패키지에 Emp(이름), Manager(이름), Ceo(이름) 클래스를 Company클래스(회사명,Emp, Manager, Ceo)로
		        설정하여, 소스상 Autowired로 설정하여 호출처리하게 하세요.
		*/
		Company company = ctx.getBean("company",Company.class);
		company.showInfo();
		/*
		[하] 3. ModelAttribute란 무엇인가? 개념을 기술하고,
			기본 예제를 만들어 보세요.
			@ModelAttribute("prodInfo")
			public Product getProdubt(){
				return new Product("사과",3000,2);
			}
		*/
		
		
		 
	}
}