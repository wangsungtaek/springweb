package springweb.z01_exp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jspexp.a03_database.A04_MemberDao;

@Controller
public class A02_MemberController {
	// @RequestParam(value="id", defaultValue="") : 요청값이 null일때, default값 설정
	// http://localhost:7080/springweb/mlist.do
	@RequestMapping("/mlist.do")
	public String memberList(@RequestParam(value="id", defaultValue="")
							 String id,
							 @RequestParam(value="name", defaultValue="")
							 String name, Model d
							) {
		
		A04_MemberDao dao = new A04_MemberDao();
		d.addAttribute("mlist", dao.memberList(id, name));
		
		return "WEB-INF/views/z01_exp/a04_memberList.jsp";
	}
}
