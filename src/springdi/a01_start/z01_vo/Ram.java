package springdi.a01_start.z01_vo;

public class Ram {
	private String name;
	private String spec;
	
	public Ram() {
		// TODO Auto-generated constructor stub
	}

	public Ram(String name, String spec) {
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
