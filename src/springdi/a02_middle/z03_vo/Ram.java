package springdi.a02_middle.z03_vo;

public class Ram {
	private String company;
	private String spec;
	public Ram() {
		// TODO Auto-generated constructor stub
		company="삼성(기본옵션)";
		spec="8G(기본옵션)";
	}
	public Ram(String company, String spec) {
		super();
		this.company = company;
		this.spec = spec;
	}
	public void info() {
		System.out.println(company+"\t"+spec);
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getSpec() {
		return spec;
	}
	public void setSpec(String spec) {
		this.spec = spec;
	}
	
}
