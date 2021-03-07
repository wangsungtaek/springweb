package springweb.a01_start;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;

import springweb.z01_vo.Player;
import springweb.z01_vo.Product;

// dispatcher-servlet.xml에서 등록하여야 한다.
// springweb.a01_start.A01_StartController

@Controller
public class A01_StartController {

	// http://localhost:7080/springweb/start.do
	@RequestMapping("/start.do")
	public String start() {
		// view 호출
		return "WEB-INF/views/a01_start/a01_springStart.jsp";
	}
	
	@RequestMapping("/start2.do")
	public String start2() {
		return "WEB-INF/views/z01_exp/a01_0304/a01_exp.jsp";
	}
	
	// http://localhost:7080/springweb/param1.do?name=홍길동
	@RequestMapping("/param1.do")
	public String param1(@RequestParam("name") String name) {
		System.out.println("요청값 name"+name);
		return ""; // 초기 index화면 호출..
	}
	// http://localhost:7080/springweb/param2.do?name=홍길동&age=25&loc=신림동
	@RequestMapping("/param2.do")
	public String param2(@RequestParam("name") String name,
						 @RequestParam("age") int age,
						 @RequestParam("loc") String loc) {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("지역 : "+loc);
		return ""; // 초기 index화면 호출..
	}
	// http://localhost:7080/springweb/param3.do?name=사과&price=2000&cnt=3
	// ?name=사과&price=3000&cnt=2 이런 요청값을 객체로 받아서 처리
	// setName(), setPrice(), setCnt()가 있으면 property 개념으로 요청값을
	// 받을 수 있다.
	@RequestMapping("/param3.do")
	public String param3(Product d) {
		System.out.println("물건명:"+d.getName());
		System.out.println("가격:"+d.getPrice());
		System.out.println("갯수:"+d.getCnt());
		return "";
	}
	
	// http://localhost:7080/springweb/param4.do?tname=LG트윈스&player=홍길동&hitRatio=0.32
	@RequestMapping("/param4.do")
	public String param4(Player p) {
		System.out.println("tname:"+p.getTname());
		System.out.println("player:"+p.getPlayer());
		System.out.println("hitRatio:"+p.getHitRatio());
		return "";
	}	
	// Model 데이터 처리
	// http://localhost:7080/springweb/model01.do
	@RequestMapping("/model01.do")
	public String model01(Model d) {
		d.addAttribute("greet", "스프링의 모델입니다.");
		return "WEB-INF/views/a01_start/a02_modelShow.jsp";
	}
	
	// ex) http://localhost:7080/springweb/model02.do
	//		prod 모델값을 객체로 Product로 생성자로 할당해서
	//		a03_modelShow.jsp 출력하세요..
	@RequestMapping("/model02.do")
	public String model02(Model d) {
		d.addAttribute("prod", new Product("사과",1000,2));
		return "WEB-INF/views/a01_start/a03_modelShow.jsp";
	}
	
	// 요청값과 모델 데이터 처리..
	// http://localhost:7080/springweb/calcu.do?num01=25&num02=30
	@RequestMapping("/calcu.do")
	public String calcu(@RequestParam("num01") int num01,
						@RequestParam("num02") int num02,
						Model d
						) {
		d.addAttribute("tot", num01+num02);
		return "WEB-INF/views/a01_start/a04_calcu.jsp";
	}
	
	// ex)
	// http://localhost:7080/springweb/login.do?id=himan&pass=7777
	// 모델 데이터 요청값이 himan/7777일때, 로그인 성공/그외는 로그인실패
	@RequestMapping("/login.do")
	public String login(@RequestParam("id") String id,
						@RequestParam("pass") String pass,
						Model d
						) {
		String result = "";
		if(id.equals("himan") && pass.equals("7777"))
			result = "로그인 성공";
		else
			result = "로그인 실패";
		d.addAttribute("login", result);
		return "WEB-INF/views/a01_start/a05_login.jsp";
	}
	// http://localhost:7080/springweb/loginForm.do
	// 위에 요청값을 던지는 화면 처리.
	@RequestMapping("/loginForm.do")
	public String loginoFrm() {
		return "WEB-INF/views/a01_start/a06_loginForm.jsp";
	}
	
	// ex) http://localhost:7080/springweb/calcuForm.do
	// 로 숫자1, 숫자2를 입력하여 위에 선언한 calcu.do를 호출하여 결과값을 처리하게 하세요.
	@RequestMapping("/calcuForm.do")
	public String clacuForm() {
		return "WEB-INF/views/a01_start/a07_calcuForm.jsp";
	}
}
