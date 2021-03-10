package springdi.a01_exp.z02_vo;

public class Manager {
	private String name;
	
	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public Manager(String name) {
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
		System.out.println("매니져이름 : "+name);
	}
}
