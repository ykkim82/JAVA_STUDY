package java_study_1224;

public class Bank {
	private BasicAccount[] accounts;
	private int accountCount;
	
	public Bank()
	{
		accounts = new BasicAccount[10];
		accountCount = 0;
	}
	
	public void createAccount(String accountNumber)
	{
		if(accountCount < accounts.length)
		{
			accounts[accountCount] = new BasicAccount(accountNumber);
			accountCount++;
			System.out.println("계좌 생성 완료");
		}else
		{
			System.out.println("더 이상 계좌를 생성할 수 없음");
		}
	}
	
	public BasicAccount findAccount(String accountNumber)
	{
		for(int i=0 ; i < accountCount;i++)
		{
			if(accounts[i].getAccountNumber().equals(accountNumber))
			{
				return accounts[i];
			}
		}
		return null;
	}
}
