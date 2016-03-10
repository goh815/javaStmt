package whileloop;

public class numGolfBean {
 int player , com, count;
 boolean flag;
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
	this.com = (int) (Math.random() * 10) + 1;
}
public int getCount() {
	return count;
}
public void setCount(int count) {
	this.count = count;
}
public boolean isFlag() {
	return flag;
}
public void setFlag(boolean flag) {
	this.flag = flag;
}
 
}