package java_study_1226;

class Book_
{
	String title;
	int price = 1000;
	
	public Book_(String title, int price)
	{
		this.title = title;
		this.price = price;
	}
	
	public void showAuthor()
	{
		String author = "작자미상";
		int price = 100;
		System.out.println("author : " + author);
		System.out.println("title : " + title);
		System.out.println("price : " + price);
		System.out.println("price : " + this.price);
	}
}

public class 복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book_[] bookList = new Book_[2];
		Book_ book1 = new Book_("자바의 정석", 2000);
		bookList[0] = book1;
		bookList[1] = new Book_("파이썬의 정석", 1000);
		
		for(Book_ b : bookList)
		{
			b.showAuthor();
		}
		
		for(int i=0;i<2;i++)
		{
			bookList[i].showAuthor();
		}
	}

}
