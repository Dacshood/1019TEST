package subject;

public class Subject {
	/* 전당포 (한사람당 1개)
	   기능
	   
	   => 물건을 맡깁니다. : insert
	   	  
	   => 물건 가격변동. : update
	   	  
	   => 사장님이 물건을 되팔기위해 물건을 가져갑니다. : delete
	   
	   => 전체 제품 조회 : selectAll
	   
	   => 제품 조회 : selectOne 
	   
	   -> 물건을 맡길때 흥정을 할 수 있습니다.
	   -> 정가보다 가격이 낮으면 거래가 완료됩니다.
	   -> 흥정가격이 정가보다 2배이상 높을시 쫓겨납니다.
	   
	   -> 맡긴 물건을 게시하여 경매를 통해 물건을 팝니다.
	   	  관리자가 정해놓은 최고가에 도달하면 물건이 팔립니다. 
	   	  
	    
	   -> (보류) * 전당포가 가진 돈보다 맡긴 물건의 금액이 넘으면 파산합니다.*
	   

- 회원가입	   
- 로그인 
	   
	   	1)  =====1. 전당포물건맡기기 2. 시세조회 3. 경매장 4. 경매장 회원관리=====

	   
- DB 테이블 insert, delete, select, update
	=> 제품번호, 제품명, 현재 수량, 입고일, 맡길때 가격 (흥정값) 

- 회원 테이블 insert, delete, select, update
	=> 경매에 참가할 회원
	
- 시세 테이블
	
	
	
	
	*/
}
