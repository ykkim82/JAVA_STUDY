package java_study_1224;

public interface Account {
	void deposit(double amount); //입금
	boolean withdraw(double amount); //출금
	public double getBalance(); //잔액조회
	public String getAccountNumber(); //계좌번호 조회
}
