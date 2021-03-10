package springweb.a01_start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jspexp.a03_database.A01_Dao;
import jspexp.z01_vo.Emp;

@Controller
public class A02_EmpController {
	
	@Autowired(required = false)
	private B01_EmpService service;
	@Autowired(required = false)
	private A01_Dao dao;
	
	@Value("${user}")
	private String user; // 공통으로 설정된 변수가 할당된다.
	@Value("${pass}")
	private String pass;
	@Value("${test}")
	private String test;
	
	// emp 검색 처리.
	// http://localhost:7080/springweb/empList.do
	@RequestMapping("empList.do")
	public String empList(Emp sch, Model d) {
		service.call();
		System.out.println("사용자 계정");
		System.out.println("계정명:" + user);
		System.out.println("패스워드:" + pass);
		System.out.println("test:" + test);
		
		if(sch.getEname() == null) sch.setEname("");
		if(sch.getJob() == null) sch.setJob("");
		d.addAttribute("emplist", 
					dao.empList(sch.getEname(), sch.getJob()));
		return "WEB-INF/views/a01_start/a08_empList.jsp";
	}
}
