package springweb.z01_exp.z04_vo;
// springweb.z01_exp.z01_vo.Team
import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component("team02")
public class Team {
	private String name;
	private ArrayList<Player> plist;
	public Team() {
		// TODO Auto-generated constructor stub
	}
	public Team(String name) {
		super();
		this.name = name;
		this.plist = new ArrayList<Player>();
	}
	public void showInfo() {
		System.out.println(name + "팀 구성원");
		if(plist.size()>0) {
			for(Player p : plist) {
				System.out.printf("이름 : %s, 나이 : %d\n", p.getName(), p.getAge());
			}
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPlist(ArrayList<Player> plist) {
		this.plist = plist;
	}
}
