
public class GeometricObject2 {
	private String color = "pink";
	private boolean filled;
	private java.util.Date dateCreated;

	//make default object
	public GeometricObject2() {
		dateCreated = new java.util.Date();
	}

	//give color and filled
	public GeometricObject2(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	//filled
	public boolean isFilled() {
		return filled;
	}

	//make new filled
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public String getColor() {
		return color;
	}
	//make new color
	public void setColor(String color) {
		this.color = color;
	}


	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + 
			" and filled: " + filled;
	}
}