package java_study;

public class 자바241112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("자바 배워보자.");
		// System.out.println : 작성한 내용을 확인할 수 있는 기능.
		
		System.out.println("Hello World!");
		
		// syso 누르고 ctrl + space 이후 enter 하면 System.out.println 된다.
		System.out.println();
		System.out.print(true);
		
		System.out.println("연습 1");
		System.out.println("연습 2");
		System.out.println("연습 3");
		System.out.println("연습 4");
		System.out.println("연습 5");
		// syso ctrl + space는 하나만 확장되나? system.out.의 다양한 함수를 골라올수없나? 하나만 된다.
		
		// ctrl + s 로 저장한다. (습관)
		System.out.println("현재 년도는 : " + 2024 + "입니다.");
		// 출력문에서 +는 문자열 합을 의미한다.
		
		// 
		System.out.println("키 : " + 170 + "입니다.");
		System.out.println("나이 : " + "비밀" + " " + "입니다.");
		// ln은 개행을 의미. print 함수의 뒤에 \n를 붙이면 println과 동일한 듯.
		System.out.print("안녕하세요");
		System.out.print("안녕하세요");
		
		//변수
		int age = 20; 						// 나이
		String address = "대전 서구 둔산동"; 	// 주소
		String mbti = "ISTJ";
		
		System.out.println("나이는 : " + age);
		System.out.println("주소는 : " + address);
		System.out.println("MBTI : " + mbti);
		
		System.out.println("탭" + "\t" + "탭" + "\t" + "탭");
		System.out.println("뉴라인" + "\n" + "뉴라인" + "\n" + "뉴라인");
	}

}
