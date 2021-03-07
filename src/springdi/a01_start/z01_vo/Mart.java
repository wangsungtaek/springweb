package springdi.a01_start.z01_vo;

public class Mart {
	private String name;
	private Product prod;
	public Mart() {
		// TODO Auto-generated constructor stub
	}
	public Mart(String name) {
		super();
		this.name = name;
	}
	public void buy() {
		System.out.println(name + "마트에 장보러 갑니다.");
		if(prod!=null) {
			System.out.println("# 물건을 구맴하였습니다. #");
			System.out.println(prod.getName());
			System.out.println(prod.getPrice());
			System.out.println(prod.getCnt());
		} else {
			System.out.println("# 살 물건이 별로 없네요. #");
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Product getProd() {
		return prod;
	}
	public void setProd(Product prod) {
		this.prod = prod;
	}
}
