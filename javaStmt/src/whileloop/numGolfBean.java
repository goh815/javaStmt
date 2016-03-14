package whileloop;

public class numGolfBean {
	int player,com,count;
	boolean flag;  // 컴의 숫자와 일치하는지 체크하는 값
	
	
	public int getPlayer() {
		return player;
	}
	public void setPlayer(int player) {
		this.player = player;
	}
	public int getCom() {
		return com;
	}
	public void setCom() {
		// 1부터 10 까지 랜덤 수 발생
		this.com =  (int) (Math.random() * 10) + 1;
	}
	public int getCount() {
		return count;
	}
	public void setCount() {
		this.count++;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public String getResult(){
		
		return "";
	}
	@Override
	public String toString() {
		return "결과 [플레이어값=" + player 
				+ ", 컴퓨터값=" + com + ", 시도한 횟수=" 
				+ count + ", 일치여부=" + flag + "]";
	}
	
	
	
}