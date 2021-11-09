package app.pawnShop;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import app.common.DAO;

public class PawnShopDAOImpl extends DAO implements PawnShopDAO {
	// 사용할 SQL 정리
	private final String SELECT_ALL = "select * from pawnshop order by product_id";
	private final String SELECT_ONE = "select * from pawnshop where product_id=?";
	private final String INSERT = "insert into pawnshop values(?,?,?,?)";
	private final String DELETE = "delete from pawnshop where product_id=?";
	private final String UPDATE = "update pawnshop set price = ? where product_id = ?";
	
	Scanner scanner = new Scanner(System.in);
	
	// 싱글톤
	private static PawnShopDAO instance = new PawnShopDAOImpl();

	public static PawnShopDAO getInstance() {
		return instance;
	}
	
	
	@Override
	public int insert(Pawn pawn) {
		// 등록
		int result = 0;
		try {
			connect();
			
			pstmt = conn.prepareStatement(INSERT);
			pstmt.setInt(1, pawn.getProductId());
			pstmt.setString(2, pawn.getProductName());
			pstmt.setDate(3, pawn.getReceiveDate());
			pstmt.setInt(4, pawn.getPrice());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("협상이 결렬되었습니다.");
		} finally {
			disconnect();
		}
		return result;
	}

	@Override
	public int delete(int productId) {
		// 삭제
		int result = 0;
		try {
			connect();

			pstmt = conn.prepareStatement(DELETE);
			pstmt.setInt(1, productId);

			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println("물건을 처리하지 못했습니다.");
		} finally {
			disconnect();
		}
		return result;
	}

	@Override
	public List<Pawn> selectAll() {
		// 전체제품조회
		List<Pawn> list = new ArrayList<>();
		try {
			connect();

			stmt = conn.createStatement();
			rs = stmt.executeQuery(SELECT_ALL);
			while (rs.next()) {
				Pawn pawn = new Pawn();
				pawn.setProductId(rs.getInt("product_id"));
				pawn.setProductName(rs.getString("product_name"));
				pawn.setReceiveDate(rs.getDate("receive_date"));
				pawn.setPrice(rs.getInt("price"));

				list.add(pawn);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	@Override
	public Pawn selectOne(int productId) {
		Pawn pawn = null;
		try {
			connect();
			pstmt = conn.prepareStatement(SELECT_ONE);
			pstmt.setInt(1, productId);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				pawn = new Pawn();
				pawn.setProductId(rs.getInt("product_id"));
				pawn.setProductName(rs.getString("product_name"));
				pawn.setReceiveDate(rs.getDate("receive_date"));
				pawn.setPrice(rs.getInt("price"));
			
			}
		} catch (SQLException e) {
			System.out.println("다시 입력해주세요");
		} finally {
			disconnect();
		}
		return pawn;
	}

	@Override
	public int update(Pawn pawn) {
		// 수정
		int result = 0;
		try {
			connect();

			pstmt = conn.prepareStatement(UPDATE);
			System.out.println("새로운 값 입력>>");
			pawn.setPrice(scanner.nextInt());
			pstmt.setInt(1, pawn.getPrice());
			pstmt.setInt(2, pawn.getProductId());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;

	}

}
