package springweb.z01_exp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class A01_ExpController {
	
	@RequestMapping("/start3.do")
	public String start3() {
		return "WEB-INF/views/z01_exp/a01_0304/a03_exp.jsp";
	}
}
