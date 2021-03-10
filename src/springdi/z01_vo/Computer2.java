package springdi.z01_vo;

public class Computer2 {
	private String company;
	private Compart part;
	
	public Computer2() {
		// TODO Auto-generated constructor stub
	}

	public Computer2(String company) {
		super();
		this.company = company;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	// 하나씩 추가하는 메서드 구현..
	// autowire="byName" 일때, id="part2"로 설정되어
	// 있을 때, type이 같을 때 해당 객체를 할당 처리한다.
	public void setPart2(Compart compart) {
		this.part = compart;
	}
	// 출력하는 메서드
	public void showInfo() {
		System.out.println(company+" 컴퓨터 #");
		if(part!=null) {
			System.out.println("장착된 부품들");
			System.out.printf("%s : %s\n",part.getName(), part.getSpec());
		}
	}
	public Compart getPart() {
		return part;
	}
}
