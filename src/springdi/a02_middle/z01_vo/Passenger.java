package springdi.a02_middle.z01_vo;
// springdi.a02_middle.z01_vo.Passenger
public class Passenger {
	private String name;
	private int age;
	public Passenger() {
		// TODO Auto-generated constructor stub
	}
	public Passenger(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void info() {
		System.out.println(name + "\t" + age);
	}
}
