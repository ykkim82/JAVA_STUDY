package 연습;

public class Book {
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
