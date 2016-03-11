package bank;

public class AccountBean {
	private int accountNo; //계좌번호
	private String name; // 계좌명
	private int password; // 비번
	private int money; // 잔액
	public static final String BANK_NAME = "한빛뱅크";
	
	public  AccountBean() {
	}
	
	public AccountBean(String name,int password) {
		this.accountNo =  (int) (Math.random() * 10) + 1;
		this.name = name;
		this.password = password;
		this.money = 0;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public String getName() {
		return name;
	}

	public int getPassword() {
		return password;
	}
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return BANK_NAME +" [계좌번호=" + accountNo 
				+ ", 계좌명=" + name 
				+ ", 비밀번호=" + password 
				+ ", 잔액=" + money
				+ "]";
	}
	
	
}
