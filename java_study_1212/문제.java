package java_study_1212;

class Calculator
{
	int add(int p1, int p2)
	{
		return p1+p2;
	}
	
	int calculateAverage(int[] na_tp)
	{
		int temp = 0;
		for(int ntp : na_tp)
		{
			temp += ntp;
		}
		return temp;
	}
}

class Book
{
	String title;
	String author;
	Book(String title, String author)
	{
		this.title = title;
		this.author = author;
	}
	
}

public class 문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1번 문제 답 : b) 오버로딩");
		System.out.println("3번 문제 답 : b) void");
		System.out.println("4번 문제 답 : b) public void myMethod() { }");
		System.out.println("6번 문제 답 : b) 메소드가 반환하는 값의 데이터 타입을 나타낸다.");
		System.out.println("8번 문제 답 :");
		
		Calculator c1 = new Calculator();
		System.out.println(c1.add(1,20));

		System.out.println("9번 문제 답 :");
		int[] na_tp = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(c1.calculateAverage(na_tp));
		
		System.out.println("10번 문제 답 : b) new");
		System.out.println("11번 문제 답 : d) 루프");
		System.out.println("12번 문제 답 : c) 필드");
		System.out.println("13번 문제 답 : b) 생성자");
		System.out.println("14번 문제 답 :");		
		Book b1 = new Book("책책","김아무개");
		System.out.println(b1.title + " by " + b1.author);
	}

}
