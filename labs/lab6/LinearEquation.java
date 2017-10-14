public class LinearEquation {
	private double a;//set math variables to use
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;

	LinearEquation(double a, double b, double c, double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}
	public double getD() {
		return d;
	}
	public double getE() {
		return e;
	}
	public double getf() {
		return f;
	}
	//checks if solvable
	public boolean isSolvable() {
		return a * d - b * c != 0;
	}
	public double getX() {// x = (ed - bf) / (ad - bc)
		return (e * d - b * f) / (a * d - b * c);
	}
	public double getY() {//y = (af - ec) / (ad - bc)
		return (a * f - e * c) / (a * d - b * c);
	}
}