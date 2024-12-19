package java_study_1219;

class Animal {
	public void makeSound() {
		System.out.println("The animal makes a sound");
	}
}

class Dog extends Animal {
	@Override
	public void makeSound() {
		System.out.println("The dog barks");
	}

}

// Vehicle 기본(default) 상속클래스는 Object
class Vehicle extends Object {
	//protected : 동일 패키지 혹은 상속받은 클래스에서 접근 가능
	//public : 동일 프로젝트 안에서 모든 클래스가 접근 가능
	//private : 클래스 안에서만 접근 가능, 최부 호출 불가능(데이터 보호)
	protected String brand = "Ford";
	
	public Vehicle()
	{
		System.out.println("Vehicle constructor called");
	}

	public void honk() {
		System.out.println("Tuut, tuut!");
	}
}

class Car extends Vehicle {
	//private : car class 안쪽에서만 사용가능함
	private String modelName = "Mustang";

	public Car() {
		super();
		System.out.println("Car constructor called");
	}

	@Override
	public void honk() {
		System.out.println("Beep, beep!");
	}

	public void printInfo() {
		System.out.println(brand + " " + modelName);
	}
}

public class 문제 {
	public static void main(String[] args) {
		System.out.println("문제 1 답 : " + "a) extends");
		System.out.println("문제 2 답 : " + "c) Object");
		System.out.println("문제 3 답 : " + "c) 다중 상속 지원");
		System.out.println("문제 4 답 : " + "b) 오버라이딩");
		System.out.println("문제 5 답 : " + "b) 허용하지 않는다");
		System.out.println("문제 6 답 : " + "d) 구조적 설계의 용이성");
		// System.out.println("문제 7 답 : " + "a) 자식 클래스의 생성자"); 틀림. 아래가 옳다함.
		System.out.println("문제 7 답 : " + "b) 부모 클래스의 생성자");
		Dog doga = new Dog();
		System.out.println("문제 8 답 : ");
		doga.makeSound();
		System.out.println("문제 9 답 : " + "");

		// 순서 : 부모생성자 -> 자식생성자 -> 메서드 호출
		Car myCar = new Car();
		
		myCar.honk();
		myCar.printInfo();
		// myCar.modelName : 필드변수 접근 불가
		
		Vehicle myVehicle = new Car();
		/*
		 * 부모클래스는 자식글래스를 대입받을 수 있다.
		 * 하지만, 자식클래스에서 정의된 메서드와 변수는 사용할 수 없습니다.
		 */
		myVehicle.honk();
		
		// ctrl + A
		// ctrl + shift + f
	}
}
