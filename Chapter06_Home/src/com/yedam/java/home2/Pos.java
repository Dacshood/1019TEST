package com.yedam.java.home2;

import com.yedam.java.home.Subject;

public class Pos {

	private int posCount=0;
	private Product [] ProductList;
	
	public void addProduct(String productName, int productPrice) {
		this.ProductList = new Product[3];
		Product product = new Product();
		product.setProductName(productName);
		product.setProductPrice(productPrice);
		ProductList[posCount++] = product;
	}
	
	public void showPosInfo() {
		for(int i =0; i<posCount; i++) {
			System.out.printf("주문하신 옷은 : %s , 가격은 : %d 입니다.", ProductList[i].getProductName()
					, ProductList[i].getProductPrice());
		}
		int total = 0;
		for(int i=0; i<posCount; i++) {
			total+=ProductList[i].getProductPrice();
		}
		System.out.printf("총 가격은 %d 입니다.",total);
	}
		
		
		
}
