package springdi.a01_exp.z02_vo;

public class Ceo {
	private String name;
	
	public Ceo() {
		// TODO Auto-generated constructor stub
	}

	public Ceo(String name) {
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
		System.out.println("대표이름 : "+name);
	}
}
