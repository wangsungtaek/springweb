package springweb.z01_exp.z01_vo;
// springweb.z01_exp.z01_vo.Sensor
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Sensor {
	private List<String> list;
	private Set<String> set;
	private Properties prop;
	private Map<String, String> map;
	public Sensor() {
		// TODO Auto-generated constructor stub
	}
	
	public void setList(List<String> list) {
		this.list = list;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "list=["+list+"],"
				+ "set=["+set+"],"
				+ "prop=["+prop+"],"
				+ "map=["+map+"]";
	}
}
