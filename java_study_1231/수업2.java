package java_study_1231;

import java.util.ArrayList;

class Emp{
	String ename;	// 사원 이름
	int sal;		// 급여
	String dname;	// 부서
	String job;		// 담당업무
	
	public Emp(String ename, int sal, String dname, String job)
	{
		this.ename = ename;
		this.sal = sal;
		this.dname = dname;
		this.job = job;
	}
}
public class 수업2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ArrayList : 동적 크기 조절이 가능한 자료구조(배열)
		 * HashSet : 중복 허용하지 않는 고유한 값만 저장되는 자료구조
		 * HashMap : Key와 value의 쌍으로 데이터를 저장하는 자료구조 
		 */
		ArrayList<Emp> emp = new ArrayList<Emp>();
		
		emp.add(new Emp("KING", 5000, "PRESIDENT", "ACCOUNTING"));
		emp.add(new Emp("JONSE", 2975, "SALESMAN", "SALES"));
		emp.add(new Emp("ALLEN", 1250, "SALESMAN", "SALES"));
		emp.add(new Emp("TURNER", 1500, "SALESMAN", "SALES"));
		
		Emp e1 = emp.get(1);
		System.out.println("사원이름 : " + e1.ename);
		System.out.println("사원급여 : " + e1.sal);
		
		// 모든 사원의 급여 총합과 급여 평균을 조회
		int salSum = 0;
		int salAvg = 0;
		for (Emp e : emp)
		{
			salSum += e.sal;
		}
		System.out.println("사원 총급여 : " + salSum);
		salAvg = salSum/emp.size();
		System.out.println("사원 평균급여 : " + salAvg);
		
		// 퀴즈 : SALES 담당 사원 수 구하기
		int nums = 0;
		for (Emp e : emp)
		{
			if (e.job.equals("SALES"))
				nums++;
		}
		System.out.println("SALES 부 사원 수 : " + nums);
		
		
		//퀴즈 : 사원이름 ALLEN, TURNER의 급여와 부서 조회
		String[] sa_q = {"ALLEN", "TURNER"};
		
		for (String s : sa_q) {
			for (Emp e : emp) {
				if (e.ename.equals(s)) {
					System.out.println("사원 : " + e.ename);
					System.out.println("급여 : " + e.sal);
					System.out.println("부서 : " + e.dname);
				}
			}
		}
	}

}
