package java_study_1231;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class PhoneBook{
	Map<String, String> phoneBook = new HashMap<String, String>();
	
	//전화번호 추가
	public void addContact(String name, String phoneNumber)
	{
		phoneBook.put(name, phoneNumber);	// 이름 중복은 안되지만, 여기서는 무시		
		System.out.println("연락처가 추가됨");
	}
	
	//전화번호 검색
	public void searchContact(String name)
	{	
		String phoneNumber = phoneBook.get(name);
		
		if (phoneNumber != null)
		{
			System.out.println(name + "의 전화번호 : " + phoneNumber);
		}
		else
		{
			System.out.println("전화번호 찾을 수 없음");
		}
	}
	
}

public class 수업3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneBook phoneBook = new PhoneBook();
		Scanner scan = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("[연락처 프로그램]");
			System.out.println("[1] 연락처 추가, [2] 연락처 검색, [3] 종료");
			
			int choice = scan.nextInt();
			scan.nextLine();
			
			if (choice == 1) {
				System.out.print("이름 입력 : ");
				String name = scan.nextLine();
				System.out.print("연락처 입력 : ");
				String number = scan.nextLine();
				phoneBook.addContact(name, number);
			} else if (choice == 2) {
				System.out.print("검색할 이름 : ");
				String name = scan.nextLine();
				phoneBook.searchContact(name);
			} else if (choice == 3) {
				System.out.println("[프로그램 종료]");
				break;
			} else {
				System.out.println("잘못된 번호 입력");
			}
		}
	}

}
