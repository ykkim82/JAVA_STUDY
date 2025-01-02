package java_study_0102;

import java.util.ArrayList;

class Book{
	private String title;
	private String author;
	
	public Book(String title, String author)
	{
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}
}

public class 복습2 {
	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<>();
		
		Book b = new Book("자바의 정석", "남궁성");
		library.add(b);
		library.add(new Book("데이터 구조와 알고리즘", "홍길동")); //방법 2
		library.add(new Book("AI", "박길동"));
		
		System.out.println(library.get(0));
		
		for(Book tp_b : library)
		{
			System.out.println("제목 : " + tp_b.getTitle());
			System.out.println("저자 : " + tp_b.getAuthor());
			System.out.println(tp_b);
		}
		
		System.out.println("도서관에 있는 책의 수 : " + library.size());
		
		Book book2 = library.get(1);
		System.out.println("책 이름 : " + book2.getTitle());
		
		// 퀴즈 ) 0번째 요소 삭제 후 사이즈 출력
		
		library.remove(0);
		System.out.println("도서관에 있는 책의 수 : " + library.size());
	}
}
