package springdi.z01_vo;

import org.springframework.stereotype.Component;

@Component
public class Book {
	
	private String name;
	private int price;
	private String author;
	
	public Book() {
		
	}

	public Book(String name, int price, String author) {
		super();
		this.name = name;
		this.price = price;
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
}
