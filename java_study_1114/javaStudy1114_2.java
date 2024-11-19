package java_study_1114;

public class javaStudy1114_2 {

	public static void main(String[] args) {
		int number = 10;
		
		System.out.println("안에 있는 숫자는 뭘까? " + number);
		
		/*
		 * 자바는 기본 데이터타입 8개와 레퍼런스타입 1개로 총 9개의 데이터형을 가진다.
		 * 레퍼런스는 다음시간에 배운다.
		 */
		
		int x = 10;
		System.out.println("정수형 데이터타입 : " + x);
		
		double y = 10.55555;
		System.out.println("실수형 데이터타입 : " + y);
		
		boolean z = true;
		System.out.println("논리형 데이터타입 : " + z);
		
		char a = 'a';
		System.out.println("문자 데이터타입 : " + a);
		
		String s = "Hello World";
		System.out.println("문자열 데이터타입 : " + s);
		
		final double PI = 3.14;
		// 상수는 데이터타입 앞에 'final' 입력
		// 상수에 식별자(변수명)은 대문자로 입력
		
		//자동 형변환
		int num = 10; // int는 4바이트
		double num2 = num; // double은 8바이트
		System.out.println("최종 값 : " + num2);
		
		//강제 형변환 : 큰 바이트크기에서 작은 바이트크기로 변환
		double num3 = 100.45;
		int num4 = (int)num3;
		System.out.println("최종 값 : " + num4);
		num3 = num4;
		System.out.println("최종 값 : " + num3);
		
		// 그 외 변환
		// 1. 문자형을 숫자로 변환
		String s1 = "123";
		int num5 = Integer.parseInt(s1);
		System.out.println("최종 값 : " + num5);
		
		// 2. 숫자를 문자로 변환
		int num6 = 6000;
		String s2 = Integer.toString(num6);
		System.out.println("최종 값 : " + s2);
				
	}

}
