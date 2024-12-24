package java_study_1224;

public class 테스트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String 계좌번호 = "12345";
		BasicAccount account1 = new BasicAccount(계좌번호);
		
		//private 필드변수를 호출하는 메소드를 'getter'라고 한다.
		double 잔액 = account1.getBalance();
		String 계좌번호출력 = account1.getAccountNumber();
		System.out.println("잔액 : " + 잔액);
		System.out.println("계좌번호출력 : " + 계좌번호출력);
		
		account1.withdraw(2000);
		잔액 = account1.getBalance();
		System.out.println("잔액 : " + 잔액);
		
		String 계좌번호2 = "123123";
		BasicAccount account2 = new BasicAccount(계좌번호2);
		//account2에 만원입금하고 3천원 출금해서 최종 잔액 출금
		
		account2.deposit(10000);
		account2.withdraw(3000);
		잔액 = account2.getBalance();
		System.out.println("잔액 : " + 잔액);
	}

}
