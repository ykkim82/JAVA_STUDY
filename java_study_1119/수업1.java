package java_study_1119;

public class 수업1 {

	public static void main(String[] args) {
		// 비교연산자 : 비교연산자 결과는 true or false
		boolean 비교 = 3 < 5;
		System.out.println(비교);		
		boolean 비교2 = 4 > 10;
		System.out.println(비교2);
		boolean 비교3 = 5 == 5;
		System.out.println(비교3);
		boolean 비교4 = 5 != 7;
		System.out.println(비교4);
		
		// 논리연산자
		// AND
		boolean 배가고프다 = true;
		boolean 돈이있다 = false;
		boolean 식당에갈수있다 = 배가고프다 && 돈이있다;
		System.out.println("식당에갈수있다 : " + 식당에갈수있다);
		
		// OR
		boolean 비가온다 = true;
		boolean 우산이있다 = false;
		boolean 외출가능 = 비가온다 || 우산이있다;
		System.out.println("외출가능 : " + 외출가능);
		
		// NOT
		boolean 햇빛이쨍쨍 = true;
		boolean 흐린날씨 = !햇빛이쨍쨍;
		System.out.println("흐린날씨 : " + 흐린날씨);
		
		// 복합대입연산자
		int a = 10;
		int b = 20;
		
		//a = a + b;
		a += b;
		System.out.println("a의 값은 : " + a);

		int c = 5;
		int d = 6;
		
		//c = c * d;
		// 퀴즈) 복합연산자로 위 코드 수정
		c *= d;
		System.out.println("c의 값은 : " + c);
		
		// 증감연산자
		int 증감 = 0;
		증감++;
		System.out.println("증감 : " + 증감);
		증감++;
		System.out.println("증감 : " + 증감);
		증감--;
		System.out.println("증감 : " + 증감);
		
		// 증감연산자는 전위연산자와 후위 연산자로 나뉨
		// 전위 연산자
		int 사과 = 100;
		System.out.println(++사과);
		System.out.println(사과);
		
		// 후위 연산자
		int 바나나 = 100;
		System.out.println(바나나++);
		System.out.println(바나나);
		
		// 삼항연산자
		int num = 3;
		int num2 = 5;
		int 결과 = num > num2 ? num - num2 : num2 + num;
		System.out.println("결과 : " + 결과);
		
		// 문제 1. (복합연산자 복습)
		int 용돈 = 5000;
		용돈 -= 3000;
		System.out.println("용돈 : " + 용돈);
		용돈 += 3000;
		System.out.println("용돈 : " + 용돈);
		
		/*
		 * 문제 2.
		 * 실수형 변수 weight과 height를 선언하고
		 * weight에 70.5를 할당, height에는 1.77을 할당 후
		 * 체질량 지수를 게산하는 프로그램을 작성하세요.
		 * 
		 * BMI(체질량 지수)공식은 체중(kg) / (신장(m) * 신장(m)) 입니다.
		 */
		
		double weight = 70.5;
		double height = 1.77;
		
		double BMI = weight / (height * height);
		
		System.out.println("BMI : " + BMI);
	}

}
