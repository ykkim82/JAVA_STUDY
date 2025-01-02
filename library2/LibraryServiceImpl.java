package library2;

import java.util.ArrayList;

public class LibraryServiceImpl implements LibraryService {

	private ArrayList<Book> books;
	
	public LibraryServiceImpl() {
		books = new ArrayList<>();				
	}
	
	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		books.add(book);
		System.out.println("도서가 추가되었습니다.");
	}

	@Override
	public void searchBook(String keyword) {
		// TODO Auto-generated method stub
		boolean isSearch = false;
		for(Book book : books)
		{
			if (book.getAuthor().contains(keyword) || book.getTitle().contains(keyword) || book.getIsbn().contains(keyword))
			{
				System.out.println(book.getTitle()+", " + book.getAuthor());
				isSearch = true;
			}
			
			if (!isSearch) {
				System.out.println("검색 결과가 없습니다.");
			}
		}
	}

	@Override
	public void removeBook(String isbn) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i<books.size();i++)
		{
			if(books.get(i).getIsbn().equals(isbn))
				books.remove(i);
			else
				System.out.println("해당 ISBN이 없습니다.");
		}
	}
	public ArrayList<Book> getAllbooks()
	{
		return new ArrayList<>(books);
	}	
}
