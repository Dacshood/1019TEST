package app.product;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import app.common.DAO;
import app.pawnShop.Pawn;

public class ProductViewDAOImpl extends DAO implements ProductViewDAO {
	// 사용할 SQL 정리
	private final String SELECT_ALL = "select * from product";
	private final String SELECT_ONE = "select * from product where product_name=?";
	private final String INSERT = "insert into product values(?,?)";
	private final String DELETE = "delete from product where product_name=?";
	private final String UPDATE = "update product set market_price = ? where product_name = ?";

	Scanner scanner = new Scanner(System.in);

	// 싱글톤
	private static ProductViewDAO instance = new ProductViewDAOImpl();

	public static ProductViewDAO getInstance() {
		return instance;
	}

	@Override
	public void insert(Product product) {
		// 등록
		try {
			connect();
			pstmt = conn.prepareStatement(INSERT);
			pstmt.setInt(1, product.getMarketPrice());
			pstmt.setString(2, product.getProductName());
			System.out.println("정상적으로 등록되었습니다.");
		} catch (SQLException e) {
			System.out.println("잘못 입력하셨습니다.");
		} finally {
			disconnect();
		}

	}

	@Override
	public void update(String productName) {
		// 수정
		Product product = new Product();
		try {
			connect();

			pstmt = conn.prepareStatement(UPDATE);
			
			System.out.println("새로운 값을 입력");
			int newPrice=scanner.nextInt();
			pstmt.setInt(1, newPrice);
			pstmt.setString(2, productName);
			pstmt.executeUpdate();
			System.out.println("정상적으로 갱신되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}
	//삭제
	@Override
	public void delete(String productName) {
		
		try {
			connect();

			pstmt = conn.prepareStatement(DELETE);
			pstmt.setString(1, productName);
			pstmt.executeUpdate();
			System.out.println("정상적으로 삭제되었습니다.");
		} catch (SQLException e) {
			System.out.println("물건을 처리하지 못했습니다.");
		} finally {
			disconnect();
		}
	}
	
	//전체조회
	@Override
	public List<Product> selectAll() {
		List<Product> list = new ArrayList<>();
		try {
			connect();

			stmt = conn.createStatement();
			rs = stmt.executeQuery(SELECT_ALL);
			while (rs.next()) {
				Product product = new Product();
				product.setProductName(rs.getString("product_name"));
				product.setMarketPrice(rs.getInt("market_price"));
				
				list.add(product);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}
	//이름을 통하여 검색해주는 친구
	@Override
	public Product selectOne(String productName) {
		Product product = null;
		try {
			connect();

			stmt = conn.createStatement();
			String sql = "select * from product where product_name = '"+ productName +"'";
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				product = new Product();
				product.setProductName(rs.getString("product_name"));
				product.setMarketPrice(rs.getInt("market_price"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return product;
	}
	
	//시세를 가져와주는 친구
	@Override
	public int select(Product product) {
		int marketPrice = 0;
		try {
			connect();
			pstmt = conn.prepareStatement(SELECT_ALL);
			pstmt.setInt(1, product.getMarketPrice());
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				product.setMarketPrice(rs.getInt("market_price"));
				marketPrice = product.getMarketPrice();
			}
		} catch(SQLException e) {
			System.out.println("잘못입력하셨습니다.");
		} finally {
			disconnect();
		}
		return marketPrice;
		
	}

}
