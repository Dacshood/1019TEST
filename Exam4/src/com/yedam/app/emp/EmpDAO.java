package com.yedam.app.emp;


public interface EmpDAO {
	// (1) 급여정보가 5000에서 10000사이인 사원의 리스트를 출력하세요.
	public Employees select1();
	// (2) 사원 직책이 ST_CLERK 인 사람들 중에서 급여가 가장 높은 사원의 급여를 출력하세요.
	// 없을 경우 에러없이 출력될수있도록 구현
	public Employees select2();
	// (3) 입사일이 5월달인 사람들의 평균급여를 출력하세요. 
	// 없을 경우 에러없이 출력될수있도록 구현
	public Employees select3();
	// (4) 직책이 SA_REP인 사원 중 급여가 10000 이상인 사람들의
	// 사원번호, 이름, 이메일, 급여정보를 출력하세요.
	// 없을 경우 에러없이 출력될수있도록 구현
	public Employees select4();
	
}
