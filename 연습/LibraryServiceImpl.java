package 연습;

public class LibraryServiceImpl implements LibraryService {

	private Book[] books;
	private int bookCount;
	
	public LibraryServiceImpl(int capacity)
	{
		books = new Book[capacity];
		bookCount = 0;
	}
	
	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		if (bookCount < books.length)
		{
			books[bookCount] = book;
			bookCount++;
			System.out.println(book.getTitle() + " 도서가 추가되었습니다.");
		}else
		{
			System.out.println("도서가 가득 찼습니다.");
		}
	}

	@Override
	public void searchBook(String keyword) {
		// TODO Auto-generated method stub
		
		Boolean isFlag = false;
		
		for(int i = 0 ; i < bookCount ; i++)
		{
			if (books[i].getTitle().contains(keyword) ||
				books[i].getAuthor().contains(keyword) ||
				books[i].getIsbn().contains(keyword))
			{
				System.out.println(books[i].toString());
				isFlag = true;
				//System.out.println("Title : " + books[i].getTitle());
				//System.out.println("Author : " + books[i].getAuthor());
				//System.out.println("ISBN : " + books[i].getIsbn());
			}
		}
		if(!isFlag)
		{
			System.out.println("검색 결과가 없습니다.");
		}
	}
	
}

