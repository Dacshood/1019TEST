package app.users;

import java.util.List;

public interface UserDAO {

	//회원정보를 등록합니다.
	public int insert(User user);
	//회원정보를 수정합니다. 
	public void update(String userId);
	//회원정보를 삭제합니다.
	public int delete(String name);
	//회원정보를 전체 조회합니다.
	public List<User> selectAll();
	//회원정보를 이름을 검색하여 조회합니다.
	public User selectOne(String name);
	//회원아이디 중복을 체크합니다.
	public User selectcheck(int userId);
	//로그인을 합니다.
	public int logIn(User user);
}
