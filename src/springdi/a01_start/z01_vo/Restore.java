package springdi.a01_start.z01_vo;

import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Restore {
	private ArrayList<String> arrayList;
	private Set<String> set;
	private Properties proper;
	private Map<String, String> map;
	
	public Restore() {
		// TODO Auto-generated constructor stub
	}

	public void setArrayList(ArrayList<String> arrayList) {
		this.arrayList = arrayList;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public void setProper(Properties proper) {
		this.proper = proper;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "arrayList=["+arrayList+"],"
				+ "set=["+set+"],proper=["+proper+"],"
				+ "map=["+map+"]";
	}
}
