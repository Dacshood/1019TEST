package app.pawnShop;

import java.sql.Date;

public class Pawn {
	private int productId;
	private String productName;
	private Date receiveDate;
	private int price;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Date getReceiveDate() {
		return receiveDate;
	}
	public void setReceiveDate(Date receiveDate) {
		this.receiveDate = receiveDate;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "제품번호 : " + productId + ", 제품명 : " + productName + ", 맡긴 날짜 : "
				+ receiveDate + ", 가격 : " + price;
	}
	
}
