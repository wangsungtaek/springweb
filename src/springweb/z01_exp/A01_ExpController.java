package springweb.z01_exp;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import springweb.z02_vo.Product;

@Controller
public class A01_ExpController {
	// http://localhost:7080/springweb/start3.do
	@RequestMapping("/start3.do")
	public String start3() {
		return "WEB-INF/views/z01_exp/a01_0304/a03_exp.jsp";
	}
	
	@ModelAttribute("fruits")
	public ArrayList<Product> flist() {
		ArrayList<Product> plist = new ArrayList<Product>();
		plist.add(new Product("사과", 2000, 0));
		plist.add(new Product("바나나", 3000, 0));
		plist.add(new Product("딸기", 12000, 0));
		
		return plist;
	}
}
