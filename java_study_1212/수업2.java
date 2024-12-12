package java_study_1212;

class Person{
	//필드변수
	public String name;
	int age;
	
	Person(String name, int age)
	{
		this.name = name;
		this.age = age;
		//this.x = 10; // 필드변수에 x라는 변수가 없으므로 해당 코드는 오류
		
		/*
		 * 생성자 특징
		 * 1. 생성자 이름과 클래스 이름은 동일해야한다.
		 * 2. 생성자는 리턴타입이 없는 '메소드' 이다.
		 * 3. 생성자는 파라미터 타입만 있고, 기본 생성자는 아무것도 받지 않는다.
		 */
	}
	
	public void celebrateBirthday(String name)
	{
		++age;		
	}
}

public class 수업2 {
	public static void main(String[] args) {
		
		Person p = new Person("김철수", 20);
		p.name = "김철수";
		p.age = 20;
		System.out.println("이름 : " + p.name);
		System.out.println("나이 : " + p.age);
		p.celebrateBirthday("dd");
		System.out.println("나이 : " + p.age);
		
		Person p2 = new Person("홍길동", 30);
		System.out.println("이름 : " + p2.name);
		System.out.println("나이 : " + p2.age);
		
	}
}
