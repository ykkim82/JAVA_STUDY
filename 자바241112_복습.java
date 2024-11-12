package java_study;

import java.util.Scanner;

public class 자바241112_복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "김영기";
		int AGe = 18;
		String 주소 = "세종시 다정동";
		String 취미 = "잠";
		String mbti = "ISTJ";
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + AGe);
		System.out.println("주소 : " + 주소);
		System.out.println("취미 : " + 취미);
		System.out.println("mbti : " + mbti);
		
		// 클래스나 변수명을 한글로 정하는 것은 불편함없이 실제 많이 사용하나?
		
		// 변수명을 만들때 소문자로 한다. (개발자 약속), 실제로는 되는 듯?
		
		// 입력받기
		Scanner scan = new Scanner(System.in);
		
		// 입력 후, ctrl + shift + o 를 누른다. 상기 함수를 import 하는데 사용한다. 클래스 선언 위쪽에 import 자동 생성
		
		System.out.print("이름을 입력해주세요 => ");
		String n = scan.next();
		System.out.println("입력하신 이름은 : " + n + " 입니다.");
	}

}
