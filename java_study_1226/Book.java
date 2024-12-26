package java_study_1226;

public class Book {
	// Book에 관련된 정보들만 작성합니다.
	private String title;
	private String author;
	private String isbn;
	
	public Book(String title, String author, String isbn)
	{
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getIsbn() {
		return isbn;
	}
	
	public String toString() {
		return "제목 : " + title + ", 저자 : " + author + ", ISBN : " + isbn;
	}
}
