package springdi.a01_start.z01_vo;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class Mart {
	private String name;
	private Product prod;
	private ArrayList<String> blist;
	public Mart() {
		// TODO Auto-generated constructor stub
	}
	public Mart(String name) {
		super();
		this.name = name;
		blist = new ArrayList<String>();
	}
	public void buyStrList() {
		System.out.println(name + "마트에 장보러 갑니다.");
		if(blist.size()>0) {
			System.out.println("# 물건을 구매하였습니다. #");
			for(String fruit : blist) {
				System.out.println(fruit);
			}
		} else {
			System.out.println("# 살 물건이 별로 없네요. #");
		}		
	}
	public void buy() {
		System.out.println(name + "마트에 장보러 갑니다.");
		if(prod!=null) {
			System.out.println("# 물건을 구맴하였습니다. #");
			System.out.println(prod.getName());
			System.out.println(prod.getPrice());
			System.out.println(prod.getCnt());
		} else {
			System.out.println("# 살 물건이 별로 없네요. #");
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Product getProd() {
		return prod;
	}
	public void setProd(Product prod) {
		this.prod = prod;
	}
	public void setBlist(ArrayList<String> blist) {
		this.blist = blist;
	}
}
