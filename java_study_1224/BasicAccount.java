package java_study_1224;

public class BasicAccount implements Account {

	//필드변수에는 접근지정자(public, private)를 사용할 수 있음
	private String accountNumber;
	private double balance; 
	
	public BasicAccount(String accountNumber) {
		this.accountNumber = accountNumber;
		this.balance = 0;
	}
	
	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub

		if(amount > 0) {
			balance += amount;
			System.out.println("입금 완료 : " + amount);
		}else {
			System.out.println("유효하지 않은 금액입니다.");
		}
	}

	@Override
	public boolean withdraw(double amount) {
		// TODO Auto-generated method stub
		if(amount > 0 && balance >= amount) {
			balance -= amount;
			System.out.println("출금 완료 : " + amount);
			return true;
		}else {
			System.out.println("출금 실패 : 잔액 부족 또는 유효하지 않은 금액");
			return false;
		}
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return this.balance;
	}

	@Override
	public String getAccountNumber() {
		// TODO Auto-generated method stub
		return this.accountNumber;
	}
	

}
