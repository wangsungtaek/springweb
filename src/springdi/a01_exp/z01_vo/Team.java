package springdi.a01_exp.z01_vo;

import java.util.ArrayList;

public class Team {
	private String name;
	private Player player;
	public Team() {
		// TODO Auto-generated constructor stub
	}
	public Team(String name) {
		super();
		this.name = name;
	}
	public void showInfo() {
		System.out.println(name + "팀 구성원");
		if(player != null)
			System.out.printf("이름 : %s, 나이 : %d\n", player.getName(), player.getAge());
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPl2(Player player) {
		this.player = player;
	}
}
