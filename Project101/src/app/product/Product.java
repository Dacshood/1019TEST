package app.product;

public class Product {
	private String productName;
	private int marketPrice;
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getMarketPrice() {
		return marketPrice;
	}
	public void setMarketPrice(int marketPrice) {
		this.marketPrice = marketPrice;
	}
	@Override
	public String toString() {
		return "제품명 : " + productName + ", 현재시세 : " + marketPrice;
	}
	
	
}
