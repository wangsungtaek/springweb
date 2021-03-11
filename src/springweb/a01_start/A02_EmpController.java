package springweb.a01_start;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jspexp.a03_database.A01_Dao;
import jspexp.z01_vo.Dept;
import jspexp.z01_vo.Emp;

@Controller
public class A02_EmpController {
	
	@Autowired(required = false)
	private B01_EmpService service;
	
	// spring에서는 가능한한 contariner에서 객체가 생성되어 메모리가 로딩된
	// 상태에서 객체를 활용하기 때문에,
	// autowiring에 의해서 메모리 할당으로 객체를 활용할 수 있다.
	// 컨테이너 메모리에 할당된 객체는 new XXX()을 사용할 수 없다.
	@Autowired(required = false)
	private A01_Dao dao;
	
	@Value("${user}")
	private String user; // 공통으로 설정된 변수가 할당된다.
	@Value("${pass}")
	private String pass;
	// 공통 모델 어트리뷰터 선언.
	@ModelAttribute("deptList")
	public ArrayList<Dept> getDlist(){
		return dao.deptList();
	}
	@ModelAttribute("mgrList")
	   public ArrayList<Emp> mgrList(){
	      return dao.mgrList();
	   }
	
	// emp 검색 처리.
	// http://localhost:7080/springweb/empList.do
	@RequestMapping("empList.do")
	public String empList(@ModelAttribute("sch") Emp sch, Model d) {
		service.call();
		
		if(sch.getEname() == null) sch.setEname("");
		if(sch.getJob() == null) sch.setJob("");
		d.addAttribute("emplist", dao.empList(sch));
		return "WEB-INF/views/a01_start/a08_empList.jsp";
	}
	
}
