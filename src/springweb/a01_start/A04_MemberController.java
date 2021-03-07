package springweb.a01_start;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jspexp.a03_database.A04_MemberDao;
import jspexp.z01_vo.Member5;

@Controller
public class A04_MemberController {
	
	@RequestMapping("memList.do")
	public String memList(Member5 sch, Model d) {
		A04_MemberDao dao = new A04_MemberDao();
		if(sch.getName() == null) sch.setName("");
		if(sch.getId() == null) sch.setId("");
		d.addAttribute("memlist",
				dao.memberList(sch.getName(), sch.getId()));
		return "WEB-INF/views/a01_start/a10_memList.jsp";
	}
}
