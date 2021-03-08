package springdi.a01_start.z03_vo;

public class Computer {
	private String name;
	private Cpu cpu;
	private Ram ram;
	private Hdd hdd;
	
	public Computer() {
		// TODO Auto-generated constructor stub
	}
	
	public Computer(String name) {
		super();
		this.name = name;
	}

	public void showInfo() {
		System.out.println("# 컴퓨터명 "+name+"에 포함된");
		if(cpu != null)
			System.out.println("Cpu 이름은 "+cpu.getName()+", 사양은 "+cpu.getSpec());
		else
			System.out.println("Cpu는 장착되지 않았습니다.");
		if(ram != null)
			System.out.println("Ram 이름은 "+ram.getName()+", 사양은 "+ram.getSpec());
		else
			System.out.println("Ram는 장착되지 않았습니다.");
		if(hdd != null)
			System.out.println("Hdd 이름은 "+hdd.getName()+", 사양은 "+hdd.getSpec());
		else
			System.out.println("Hdd는 장착되지 않았습니다.");
		System.out.println("입니다.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		ram = ram;
	}

	public Hdd getHdd() {
		return hdd;
	}

	public void setHdd(Hdd hdd) {
		this.hdd = hdd;
	}

	
}
