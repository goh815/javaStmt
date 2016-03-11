package bank;

import java.util.Scanner;

public class BankServiceImpl implements BankService {

	@Override
	public String openAccount(String name, int password) {
		// TODO Auto-generated method stub
		AccountBean bean = new AccountBean(name, password);
		return bean.toString();
	}

	@Override
	public String deposit(int money) {
		// 입금
		AccountBean bean = new AccountBean();
		bean.setMoney(money);
		System.out.println(bean.getMoney());
		return "입금완료";
	}

	@Override
	public String withdraw(int money) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findMoney() {
		// TODO Auto-generated method stub
		return null;
	}

}
