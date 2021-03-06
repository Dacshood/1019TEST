package app.product;

import java.util.List;

public interface ProductViewDAO {
	//새로운 물건을 등록합니다.
	public void insert(Product product);
	//가격(market_price)을 갱신합니다.
	public void update(String productName);
	//물건을 삭제합니다.
	public void delete(String productName);
	//물건 시세를 조회합니다.
	public List<Product> selectAll();
	//물건 이름을 입력하여 가격을 조회합니다
	public Product selectOne(String productName);
	// 시세를 전당포에 넘기는 친구
	public int select(Product product);
	
}
