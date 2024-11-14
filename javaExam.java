package java_study_1114;

import java.util.Scanner;

public class javaExam {

	public static void main(String[] args) {
		// [문제1] 정수형 변수 age를 선언하고 25를 할당하는 코드를 작성 후 출력 하세요.
		int age = 25;
		System.out.println("[답1] age = " + age);
				
		/*
		 * [문제2] OO은 final 키워드를 사용합니다. 실행 중 값 변경이 불가능한 게 특징입니다. OO은 무엇일까요?
		 * 1. 변수
		 * 2. 실수
		 * 3. 상수
		 * 4. 정수
		 */
		System.out.println("[답2] " + "3. 상수");
		
		// [문제3] 문자열 "Hello, Java!"를 출력하는 코드를 작성하세요.
		System.out.println("[답3] Hello, Java!");
		
		// [문제4] 두 개의 정수 a와 b를 더한 결과를 출력하는 코드를 작성하세요.
		int a = 3;
		int b = 7;
		int n_ans_4 = a + b;
		System.out.println("두 정수 a와 b의 합은 " + n_ans_4 + "입니다.");
		
		// [문제5] 실수형 변수 height으로 선언하고 180.5를 할당하는 코드를 작성하세요.
		double height = 180.5;
		
		// [문제6] 사용자로부터 이름과 나이를 입력받아, "안녕하세요, [이름]님! 당신은 [나이]살입니다."라는 메시지를 출력하세요.
		Scanner scan = new Scanner(System.in);
		System.out.print("당신의 이름을 입력하세요 : ");
		String s_name = scan.next();
		System.out.print("당신의 나이를 입력하세요 : ");
		int n_age = scan.nextInt();
		System.out.println("안녕하세요, [" + s_name + "]님! 당신은 [" + n_age + "]살입니다.");
		
		/*
		 * [문제7] 다음 각 데이터 타입에 맞는 변수를 선언하고 적절한 값으로 초기화하세요.
		 * 1. 정수형 (int)
		 * 2. 실수형 (double)
		 * 3. 문자형 (char)
		 * 4. 논리형 (boolean)
		 */
		int n_v1 = 1;
		double d_v2 = 1.5;
		char c_v3 = 'c';
		boolean b_v4 = true;
					
		// [문제8] 사용자로부터 두 개의 정수를 입력받아, 그 합을 출력하세요.
		System.out.print("첫 번째 정수을 입력하세요 : ");
		int n_value_1 = scan.nextInt();
		System.out.print("두 번째 정수을 입력하세요 : ");
		int n_value_2 = scan.nextInt();
		int n_ans = n_value_1 + n_value_2;
		System.out.println("두 정수의 합은 " + n_ans + "입니다.");
		
		// [문제9] 문자형변수 x를 선언하고 “10”을 할당 후 정수형 변수 y를 선언하고 x의 값을 y에 할당하세요. HINT) Integer.parseInt
		String x = "10";
		int y = Integer.parseInt(x);
				
		/*
		 * [문제10] 다음 중 잘못된 식별자(변수이름)는?
		 * 1. monster3
		 * 2. apple_13_pro
		 * 3. 3apple
		 * 4. AaaAAA
		 */
		
		// [답10] 3. 3apple (숫자로 시작)
		
		/*
		 * [문제11] 아래와 같이 사용자로부터 3개의 정수를 입력받아, 평균을 출력하세요.(소수점 제외)
		 * 숫자를 입력하세요 : 100
		 * 숫자를 입력하세요 : 90
		 * 숫자를 입력하세요 : 70
		 * 입력받은 숫자의 평균은 86입니다. 
		 */
		System.out.print("숫자를 입력하세요 : ");
		int n_Q11_v1 = scan.nextInt();
		System.out.print("숫자를 입력하세요 : ");
		int n_Q11_v2 = scan.nextInt();
		System.out.print("숫자를 입력하세요 : ");
		int n_Q11_v3 = scan.nextInt();
		int n_Q11_avg = (n_Q11_v1 + n_Q11_v2 + n_Q11_v3) / 3;
		System.out.println("입력받은 숫자의 평균은 " + n_Q11_avg + "입니다.");
		
		/*
		 * [문제12] 아래와 같이 사용자로부터 정수를 입력받고, 해당 정수의 10%는 몇인지 출력하시오.
		 * 숫자를 입력하세요 : 800
		 * 해당 숫자의 10%는 : 80.0입니다.
		 */
		System.out.print("숫자를 입력하세요 : ");
		int n_Q12_v1 = scan.nextInt();
		double d_Q12_v1 = n_Q12_v1;
		double d_Q12_v2 = d_Q12_v1 / 10;		
		System.out.println("해당 숫자의 10%는 : " + d_Q12_v2 + "입니다.");		
	}

}
