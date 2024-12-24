package java_study_1224;

//********************* 중요 : 객체배열

class Book{
	private String title;
	private int price;
	
	public Book(String title, int price)
	{
		this.title = title;
		this.price = price;
	}
	
	public void showBook()
	{
		System.out.println(this.title + "의 가격은 " + this.price + "원입니다.");
	}
	
	public int getPrice()
	{
		return this.price;
	}
	
	public String getTitle()
	{
		return this.title;
	}
}

public class 테스트2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체 배열
		// 자바는 객체도 데이터타입이다.
		int [] array = new int[10];
		String[] array2 = new String[10];
		Book[] bookArray = new Book[10]; // 저장 공간이 10개인 Book 형의 배열
		// bookArray에 올 수 있는 데이터가 2개이다. 2개가 뭔가?
		
		Book book1 = new Book("자바의 정석", 30000);
		Book book2 = new Book("파이썬 기초", 25000);
		Book book3 = new Book("알고리즘 입문", 40000);
		
		bookArray[0] = book1;
		bookArray[1] = book2;
		bookArray[2] = book3;
		
		bookArray[0].showBook();
		bookArray[1].showBook();
		bookArray[2].showBook();
		
		for (int i=0; i<3 ; i++)
		{
			bookArray[i].showBook();			
		}
		
		for (int i=0; i<3 ; i++)
		{
			if (bookArray[i].getPrice() >= 30000)
				bookArray[i].showBook();
		}

		for (int i=0; i<3 ; i++)
		{
			if (bookArray[i].getTitle().equals("파이썬 기초"))
				bookArray[i].showBook();
		}
	}

}
