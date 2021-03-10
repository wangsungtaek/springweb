package springdi.a01_exp.z02_vo;

public class Emp {
	private String name;
	
	public Emp() {
		// TODO Auto-generated constructor stub
	}

	public Emp(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void showInfo() {
		System.out.println("사원이름 : "+name);
	}
}
