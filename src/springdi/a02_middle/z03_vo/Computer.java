package springdi.a02_middle.z03_vo;
// springdi.a02_middle.z03_vo
import org.springframework.beans.factory.annotation.Autowired;

public class Computer {
	private String company;
	@Autowired(required = false)
	private Cpu cpu;
	@Autowired(required = false)
	private Ram ram;
	@Autowired(required = false)
	private Ssd ssd;
	
	public Computer() {
		// TODO Auto-generated constructor stub
		company = "조립컴퓨터(기본옵션)";
	}

	public Computer(String company) {
		super();
		this.company = company;
	}
	public void info() {
		System.out.println("컴퓨터 제조사:"+company);
		if(cpu!=null) cpu.info();
		if(ram!=null) ram.info();
		if(ssd!=null) ssd.info();
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Cpu getCpu() {
		return cpu;
	}

	public void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}

	public Ram getRam() {
		return ram;
	}

	public void setRam(Ram ram) {
		this.ram = ram;
	}

	public Ssd getSsd() {
		return ssd;
	}

	public void setSsd(Ssd ssd) {
		this.ssd = ssd;
	}
	
}
