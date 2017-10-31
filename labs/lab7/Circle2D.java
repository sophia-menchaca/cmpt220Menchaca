
public class Circle2D {
	private double x; 
	private double y; 
	private double radius;

	Circle2D() {//(0,0) aka the origin on xy plane is the center and radius is 1
		this(0, 0, 1);
	}
	Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;//point at "this" circle
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	public boolean contains(double x, double y) {//true if point is in circle
		return Math.sqrt(Math.pow(x - this.x, 2) + 
				 Math.pow(y - this.y, 2)) 
				 < radius;
	}
	public boolean contains(Circle2D circle) {//true if circle is inside other circle
		return Math.sqrt(Math.pow(circle.getX() - x, 2) + 
				 Math.pow(circle.getY() - y, 2))+circle.getRadius()
				 <= radius;
	}
	public boolean overlaps(Circle2D circle) {//true if circles overlap
		return Math.sqrt(Math.pow(circle.getX() - x, 2) + 
				 Math.pow(circle.getY() - y, 2)) 
				 <= radius + circle.getRadius();
	}
}
