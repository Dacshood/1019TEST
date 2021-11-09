package app.pawnShop;

import java.util.List;

public interface PawnShopDAO {
	//물건을 맡깁니다.
	public int insert(Pawn pawn);
	//물건을 가져갑니다. (경매에서 물건이 팔립니다.)
	public int delete(Pawn pawn);
	//맡긴 내용을 수정합니다.
	public int update(Pawn pawn);
	//전체 조회
	public List<Pawn> selectAll();
	//단건 조회
	public Pawn selectOne(int productId);
	
	

}
