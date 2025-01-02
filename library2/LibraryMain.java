package library2;

import java.util.Scanner;

public class LibraryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		LibraryServiceImpl library = new LibraryServiceImpl();
		
		while(true)
		{
			System.out.println("★★★★★ 도서관리 프로그램 ★★★★★");
			System.out.println("[1] 도서 추가 [2] 도서 검색 [3] 도서 삭제 [4] 모든 도서 조회 [5] 종료");
			System.out.print("메뉴를 선택하세요. : ");
			
			int choice = scan.nextInt();
			scan.nextLine();
			
			if(choice == 1) {
				System.out.println("제목 : ");
				String title = scan.nextLine();
				System.out.println("저자 : ");
				String author = scan.nextLine();
				System.out.println("ISBN : ");
				String isbn = scan.nextLine();
				library.addBook(new Book(title, author, isbn));
			}else if(choice == 2) {
				System.out.print("키워드 : ");
				String keyword = scan.nextLine();
				library.searchBook(keyword);
			}else if(choice == 3) {
				System.out.print("삭제 도서 ISBN");
				String isbn = scan.nextLine();
				library.removeBook(isbn);				
			}else if(choice == 4) {
				System.out.println("모든 도서 목록 : ");
				for (Book tp_book : library.getAllbooks())
				{
					System.out.println("제목 : " + tp_book.getTitle());
				}
			}else if(choice == 5) {
				System.out.println("프로그램 종료합니다.");
				System.exit(0);
			}else
			{
				System.out.println("잘못된 입력, 다시 입력.");
			}
		}
	}
}
