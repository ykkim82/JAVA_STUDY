package java_study_1119;

public class 복습 {

	public static void main(String[] args) {
		// 자바는 8가지 기본 타입과 레퍼런스 타입 총 9가지의 데이터타입을 가진다.
		/*
		 * 가장 많이 사용하는 데이터 타입
		 * int : 정수
		 * double : 실수
		 * String : 문자열
		 * Boolean : 참거짓을 표현
		 */
		int x = 10;
		
		int y = 20;
		//int y = 20; // 오류발생 : 변수이름 중복
		int a = 20;
		a = 10;
		System.out.println("a의 최종 값은 : " + a);
		
		//문제 11
		int n1 = 100;
		int n2 = 90;
		int n3 = 70;
		int avg = 0;
		avg = (n1 + n2 + n3)/3;
		System.out.println("평균 : " + avg);
		
		//문제 12
		int money = 800;
		double percent = money * 0.1;
		
		System.out.println("800의 10%는 " + percent);
	}

}
