package java_study_1121;

import java.util.Scanner;

public class 문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 문제1 답: 4
		 */
		int a = 1;
		if (a == 1)
			System.out.println("1");
		else if(a == 2)
			System.out.println("2");
		else if(a == 3)
			System.out.println("2");
		
		
		/*
		 * 문제2 답 : 1
		 */
		
		/*	
		 * 문제3 : 아래 코드작성함
		 */
		System.out.println("문제 3");
		Scanner scan = new Scanner(System.in);
		System.out.print("첫 번째 정수를 입력하세요. :");
		int q3_a = scan.nextInt();
		System.out.print("첫 번째 정수를 입력하세요. :");
		int q3_b = scan.nextInt();
		if (q3_a > q3_b)
			System.out.println(q3_a);
		else if (q3_a < q3_b)
			System.out.println(q3_b);
		else
			System.out.println("두 수는 같음");		
		
		/*
		 * 문제4 : 아래 코드 작성함
		 */
		System.out.println("문제 4");
		System.out.print("나이를 입력하세요. :");
		int q4_age = scan.nextInt();
		if (q4_age > 19)
			System.out.println("성인");
		else
			System.out.println("미성년");
		
		/*
		 * 문제5 : 아래 코드 작성함
		 */
		System.out.println("문제 5");
		System.out.print("숫자를 입력하세요. :");
		int q5_a = scan.nextInt();
		if (q5_a % 5 == 0)
			System.out.println("5의 배수");
		else
			System.out.println("5의 배수가 아님");		
			
		/*
		 * 문제6 : 아래 코드 작성함
		 */
		System.out.println("문제 6");
		System.out.print("숫자를 입력하세요. :");
		int q6_a = scan.nextInt();
		if (q6_a % 2 == 0)
			System.out.println("짝수");
		else
			System.out.println("홀수");			
		
		/*
		 * 문제7 : 아래 코드 작성함
		 */
		System.out.println("문제 7");
		System.out.print("숫자를 입력하세요. :");
		int q7_a = scan.nextInt();
		if (q7_a % 3 == 0 && q7_a % 5 == 0)
			System.out.println("3과 5의 공배수");
		else if (q7_a % 3 == 0)
				System.out.println("3의 배수");
		else if (q7_a % 5 == 0)
			System.out.println("5의 배수");
		else
			System.out.println("3이나 5의 배수가 아님");
		
		
		/*
		 * 문제8 : 아래 코드 작성함
		 */

		System.out.println("문제 8");
		System.out.print("국어 점수 입력 :");
		double q8_a = scan.nextInt();
		System.out.print("수학 점수 입력 :");
		double q8_b = scan.nextInt();
		System.out.print("영어 점수 입력 :");
		double q8_c = scan.nextInt();
		double q8_avg = (q8_a + q8_b + q8_c)/3;
		
		if (q8_avg >= 90)
			System.out.println("A");
		else if (q8_avg >= 80)
			System.out.println("B");
		else if (q8_avg >= 70)
			System.out.println("C");
		else if (q8_avg >= 60)
			System.out.println("D");
		else
			System.out.println("F");
		
		/*
		 * 문제9 : 아래 코드 작성함
		 */
		System.out.println("문제 9");
		System.out.print("첫 번째 정수 입력 :");
		int q9_a = scan.nextInt();
		System.out.print("두 번째 정수 입력 :");
		int q9_b = scan.nextInt();
		if (q9_a < 0 || q9_b < 0)
			System.out.println("음수가 포함되어 있습니다.");
		else
			System.out.println("모두 양수입니다.");			
		
		/*
		 * 문제10 : 아래 코드 작성함
		 */
		System.out.println("문제 10");
		System.out.print("1부터 5까지의 숫자를 입력하세요 :");
		int q10_a = scan.nextInt();
		
		switch(q10_a) {
		case 1 :
			System.out.println("사과");
			break;
		case 2 :
			System.out.println("바나나");
			break;
		case 3 :
			System.out.println("오렌지");
			break;
		case 4 :
			System.out.println("포도");
			break;
		case 5 :
			System.out.println("복숭아");
			break;
		default :		
			System.out.println("1부터 5사이의 값이 아닙니다.");	
		}
		
		/*
		 * 문제11
		 */
		int q11_pcs = 7;
		System.out.print("피자 나누어 먹을 사람 수 :");		
		int q11_n = scan.nextInt();
		int q11_ans = q11_n / q11_pcs + 1;
		System.out.println("최소 피자의 수 : " + q11_ans);
		
		/*
		 * 문제12
		 */
		System.out.print("금액을 입력하세요 : ");
		double q12_price = scan.nextInt();
		double q12_rate = 0;
		double q12_ans = 0;

		if (q12_price >= 500000)
			q12_rate = 0.20;
		else if (q12_price >= 300000)
			q12_rate = 0.10;
		else if (q12_price >= 100000)
			q12_rate = 0.05;
		else
			q12_rate = 0;
		
		q12_ans = q12_price * (1 - q12_rate);
		System.out.println("할인율 적용된 금액 : " + q12_ans);
	}

}
