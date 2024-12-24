package java_study_1224;

public class 테스트3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank();
		
		String 계좌번호1 = "123456";
		bank.createAccount(계좌번호1);

		String 계좌번호2 = "777777";
		bank.createAccount(계좌번호2);
		
		BasicAccount basicAccount = bank.findAccount(계좌번호2);
		System.out.println("계좌번호 : " + basicAccount.getAccountNumber());
		System.out.println("잔액 : " + basicAccount.getBalance());
		
		basicAccount.deposit(50000);
		
		String 계좌번호3 = "9999";
		bank.createAccount(계좌번호3);
		BasicAccount basicAccount2 = bank.findAccount(계좌번호3);
		basicAccount2.deposit(100000);
		basicAccount2.withdraw(50000);
		System.out.println("계좌번호 : " + basicAccount2.getAccountNumber());
		System.out.println("잔액 : " + basicAccount2.getBalance());
	
		/*
		 * Account -> BasicAccont(입금, 출금, 잔액확인, 계좌확인)->Bank(계좌 착기, 생성) -> Main 함수로 출력해보기
		 */
	}

}
