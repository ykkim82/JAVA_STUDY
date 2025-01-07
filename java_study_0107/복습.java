package java_study_0107;

import java.util.ArrayList;

class Book{
	private String title;
	private String auther;
	
	public Book(String title, String auther)
	{
		this.title = title;
		this.auther = auther;		
	}

	public String getTitle() {
		return title;
	}

	public String getAuther() {
		return auther;
	}
}

public class 복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> bookList = new ArrayList<>();
		
		bookList.add(new Book("A도서", "홍길동"));
		
		Book book = new Book("B도서", "김길동");
		bookList.add(book);
		
		for (Book b : bookList)
		{
			System.out.println("제목 : " + b.getTitle() + ", " + "저자 : " + b.getAuther());
		}
		Book book1 = bookList.get(1);
		System.out.println("제목 : " + book1.getTitle() + ", " + "저자 : " + book1.getAuther());
				
		System.out.println("길이 : " + bookList.size());
	}
}
