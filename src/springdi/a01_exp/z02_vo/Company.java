package springdi.a01_exp.z02_vo;
// springdi.a01_exp.z02_vo.Company
import org.springframework.beans.factory.annotation.Autowired;

public class Company {
	private String name;
	@Autowired(required = false)
	private Emp emp;
	@Autowired(required = false)
	private Manager manager;
	@Autowired(required = false)
	private Ceo ceo;
	
	public Company() {
		// TODO Auto-generated constructor stub
	}

	public Company(String name) {
		super();
		this.name = name;
	}
	public void showInfo() {
		System.out.println(name + "회사 구성원");
		if(emp != null) emp.showInfo();
		if(manager != null) manager.showInfo();
		if(ceo != null) ceo.showInfo();
	}

	public Ceo getCeo() {
		return ceo;
	}

	public void setCeo(Ceo ceo) {
		this.ceo = ceo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}
	
}
