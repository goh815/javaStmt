package bank;

public class AccountBean {
	private int accountNo; //계좌번호
	private String name; // 계좌명
	private int password; // 비번
	private int money; // 잔액
	public static final String BANK_NAME = "한빛뱅크";
	
	
	/**
	 * 생성자를 만드시오
	 * 단, 통장을 만듦과 동시에 은행이름이 통장 바깥에 새겨지며(상수)
	 * 계좌번호는 랜덤숫자로 만들어지며(총 6자리로 합시다)
	 * 계좌 주인의 이름은 새겨지며 비번도 설정합니다
	 * 다만, 잔액은 통장이 만들어진 이후에 입금이 되겠지요.
	 * */

	
	@Override
	public String toString() {
		return "한빛통장 [계좌번호=" + accountNo 
				+ ", 계좌명=" + name 
				+ ", 비밀번호=" + password 
				+ ", 잔액=" + money
				+ "]";
	}
	
	public AccountBean() {
		this.accountNo = (int) (Math.random() * 10) + 1;
		this.name = name;
		this.password = password;
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
}
