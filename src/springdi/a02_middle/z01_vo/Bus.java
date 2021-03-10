package springdi.a02_middle.z01_vo;

import org.springframework.beans.factory.annotation.Autowired;
// springdi.a02_middle.z01_vo.Bus
public class Bus {
	private int num;
	// 컨테이너에 해당 객체가 메모리에 없더라도 에러가 발생하지
	// 않게 autowired 옵션 설정..
	@Autowired(required = false)
	private Passenger passenger;
	public Bus() {
		// TODO Auto-generated constructor stub
	}
	public Bus(int num) {
		super();
		this.num = num;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public void goBus() {
		System.out.println("버스 번호:"+ num);
		if(passenger != null)
			passenger.info();
	}
}
