
public class GameMethods {
	private double good;
	private double bad;
	
	GameMethods(){
		good = 0;
		bad = 0;
		
	}
	
	GameMethods(double newGood, double newBad) {
		good = newGood;
		bad = newBad;
	}
	public void plusGood(double amount) {
		good += amount;
	}
	public void plusBad(double amount) {
		bad += amount;
	}
	
	public double getGood() {
		return good;
	}
	public void setGood(double good) {
		this.good = good;
	}
	public double getBad() {
		return bad;
	}
	public void setBad(double bad) {
		this.bad = bad;
	}
	
}
