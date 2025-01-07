package game;

import java.util.ArrayList;

class Emp{
	private String ename;
	private int sal;
	
	public Emp(String ename, int sal) {
		this.ename = ename;
		this.sal = sal;
	}

	public String getEname() {
		return ename;
	}

	public int getSal() {
		return sal;
	}
}

public class 복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Emp> empList = new ArrayList<>();
		
		empList.add(new Emp("홍길동", 4000));
		empList.add(new Emp("박길동", 1000));
		empList.add(new Emp("김길동", 2000));
		empList.add(new Emp("이길동", 6000));

		for (Emp emp : empList) {
			System.out.println("사원명 : " + emp.getEname() + "," + "급여 : " + emp.getSal());
		}
		
		int sum = 0;
		for (Emp emp : empList) {
			sum += emp.getSal();
		}
		System.out.println("총급여 : " + sum);
	}

}
