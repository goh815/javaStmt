package bank;

public interface AdminService {
	/**
	 * 계좌 개설
	 */
	public String openAccount(String name,int password);
	/**
	 * 계좌번호로 계좌 조회(반드시 하나만 검색됨)
	 * */
	public AccountBean findAccountByAccountNo(int accountNo);
	/**
	 * 이름으로 계좌 조회(복수개의 결과가능)
	 * */
	public AccountBean[] findAccountsByName(String name);
	/**
	 * 계좌 해지
	 * */
	public String closeAccount(int accountNo);
	/**
	 * 전체 계좌수 조회
	 * */
	public int countAll();
	/**
	 * 해당 이름에 맞는 계좌 수 조회
	 * */
	public int countByName(String name);
}
