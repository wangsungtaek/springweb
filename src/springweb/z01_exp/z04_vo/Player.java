package springweb.z01_exp.z04_vo;

import org.springframework.stereotype.Component;

@Component("play01")
public class Player {
	private String name;
	private int age;
	public Player() {
		// TODO Auto-generated constructor stub
	}
	public Player(String name, int age) {
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
}
