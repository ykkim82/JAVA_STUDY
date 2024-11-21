package java_study_1121;

import java.util.Scanner;

public class 조건문문제풀이 {

	public static void main(String[] args) {
		// 1번. 3의 배수 판단
		Scanner scan = new Scanner(System.in);
		int x = 15;
		if (x % 3 == 0)
			System.out.println("3의 배수이다.");
		else System.out.println("3의 배수가 아니다.");
		
		// 문제2. 변수 y가 5의 배수인지 판단하는 프로그램
		int y = 5;
		if (y % 5 == 0)
		{
			System.out.println("5의 배수이다.");
		}
		else 
		{
			System.out.println("5의 배수가 아니다.");
		}
		
		// 문제3. 두 정수를 입력받아 큰 수 출력하기
		System.out.print("첫 번째 정수를 입력하세요.");
		int a = scan.nextInt();
		System.out.print("두 번째 정수를 입력하세요.");
		int b = scan.nextInt();
		
		if ( a > b )
		{
			System.out.println("큰 값은 : " + a);
		}
		else if ( a < b)
		{
			System.out.println("큰 값은 : " + b);
		}
		else
		{
			System.out.println("두 값은 동일합니다.");
		}
		
		// 문제 4. 짝수 구하기
		int 짝수 = 4;
		if (짝수 % 2 == 0)
			System.out.println("짝수");
		else
			System.out.println("홀수");
		
		// 문제 5. 홀수 구하기
		int 홀수 = 9;
		if (홀수 % 2 == 1)
			System.out.println("홀수");
		else
			System.out.println("짝수");
		
		// 문제 6. 3과 5의 공배수 판단
		int number = 15;
		if (number % 3 == 0 && number % 5 == 0)
			System.out.println("3과 5의 공배수이다.");
		else
			System.out.println("3과 5의 공배수가 아니다.");
		
	}

}
