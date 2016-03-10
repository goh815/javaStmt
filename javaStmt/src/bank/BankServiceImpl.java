package bank;

/**
 * @author USER
 * @date 2016. 3. 10.
 * @story 밴크 서비스 비즈니스 로직
 */
class BankServiceImpl implements BankService {
	/**
	 * 계좌 개설
	 */
	public String openAccount(String name int password) {
		AccountBean bean = new AccountBean(name, password);
		
		return ;
	}
	/**
	 * 계좌번호로 계좌 조회(반드시 하나만 검색됨)
	 * */
	public AccountBean findAccountByAccountNo(int accountNo) {
		return null;
	}
	
	 //이름으로 계좌 조회(복수개의 결과가능)
	 
	public AccountBean[] findAccountsByName(String name) {
		return null;
	}
	
	 //계좌 해지
	 
	public String closeAccount(int accountNo) {
		return null;
	}
	/**
	 * 전체 계좌수 조회
	 * */
	public int countAll() {
		return 0;
	}
	/**
	 * 해당 이름에 맞는 계좌 수 조회
	 * */
	public int countByName() {
		return 0;
	}
}
