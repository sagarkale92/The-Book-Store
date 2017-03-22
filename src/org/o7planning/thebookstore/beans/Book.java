package org.o7planning.thebookstore.beans;

public class Book {
	private String name;
	private String code;
	private String price;
	public Book(String nameIn, String codeIn, String priceIn){
		setName(nameIn);
		setCode(codeIn);
		setPrice(priceIn);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
}
