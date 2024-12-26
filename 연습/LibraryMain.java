package 연습;

import java.util.Scanner;

public class LibraryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		LibraryService library = new LibraryServiceImpl(10);
		
		while(true)
		{
			System.out.println("★★★★★ 도서관리 프로그램 ★★★★★");
			System.out.println("메뉴를 선택하세요.");
			System.out.println("[1] 도서추가 [2] 도서 검색 [3] 시스템 종료");
			System.out.print("번호입력 : ");
			int choice = scan.nextInt();
			scan.nextLine();
			
			if(choice == 1) // 도서 추가
			{
				System.out.print("제목 입력: ");
				String title = scan.nextLine();
				System.out.print("저자 입력: ");
				String author = scan.nextLine();
				System.out.print("ISBN 입력: ");
				String isbn = scan.nextLine();
				
				library.addBook(new Book(title, author, isbn));
				
			}else if(choice == 2) // 도서 검색
			{
				System.out.print("검색어 : ");
				String keyword = scan.next();
				library.searchBook(keyword);
			}else if(choice == 3) // 시스템 종료
			{
				System.out.println("시스템을 종료합니다.");
				scan.close();
				System.exit(0);	
			}else
			{
				System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
			}
		}
	}
}
