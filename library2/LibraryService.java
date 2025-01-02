package library2;

import java.util.ArrayList;

public interface LibraryService {
	void addBook(Book book);
	void searchBook(String keyword);
	void removeBook(String isbn);
	ArrayList<Book> getAllbooks();
	
}
