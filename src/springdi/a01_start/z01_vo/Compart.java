package springdi.a01_start.z01_vo;

public class Compart {
	private String name;
	private String spec;
	public Compart() {
		// TODO Auto-generated constructor stub
	}
	public Compart(String name, String spec) {
		super();
		this.name = name;
		this.spec = spec;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpec() {
		return spec;
	}
	public void setSpec(String spec) {
		this.spec = spec;
	}
	
}
