package java_study_1114;

import java.util.Scanner;	// Scanner의 기능을 사용할 때 import 키워드를 이용해서 불러옴

public class javaStudy1114_3 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// ctrl + shift + o : import
		
		// 문제1. 두 개의 정수를 입력받아, 그 합을 출력하기
		System.out.print("첫 번째 정수를 입력하세요. : ");
		int x = scan.nextInt(); // 정수형 입력받기
		System.out.print("두 번째 정수를 입력하세요. : ");
		int y = scan.nextInt(); // 정수형 입력받기
		
		int sum = x + y;
		System.out.println("두 정수의 합은 : " + sum);		
		int mul = x * y;
		System.out.println("두 정수의 곱은 : " + mul);
		int div = x / y;
		System.out.println("나눈 값은 : " + div);
	    double div2 = (double)x / (double)y;
		System.out.println("나눈 값은 : " + div2);
	    int div3 = (int)((double)x / (double)y);
		
		// 문제2. 실수형 변수 Height를 선언하고 180.7을 할당하는 코드를 작성하기
		double height = 180.7;
		
		// 문제3. 입력받은 두 정수형 평균값 구하기
		System.out.print("a 값 입력 :");
		int a = scan.nextInt();
		System.out.print("b 값 입력 :");
		int b = scan.nextInt();
		int avg = (a + b) / 2;
		System.out.println("입력받은 두 정수의 평균은 : " + avg);
		
		// 문제4.
		/*
		 * 사용자로부터 이름(문자열)과 나이(정수형)을 입력받아,
		 * "안녕하세요, [이름]님! 당신은 [나이]살입니다."라는 메시지를 출력하세요.
		 */
		System.out.print("당신의 이름을 입력하세요 : ");
		String s_name = scan.next();
		System.out.print("당신의 나이를 입력하세요 : ");
		int n_age = scan.nextInt();
		System.out.print("안녕하세요, [" + s_name + "]님!");
		System.out.println(" 당신은 [" + n_age + "]살입니다.");
		
	}

}
