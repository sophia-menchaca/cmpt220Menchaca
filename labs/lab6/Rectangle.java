	 class rectangleA {//use in RectanglePart2.java
		double width;	//set variables to use in the code
		double height;	
		rectangleA() {
				width = 0;
				height = 0;//set so you can change
		} 
		
		rectangleA(double newWidth, double newHeight) {//w and h will be set in pt2 code
				width = newWidth;
				height = newHeight;
		}
			double getArea() {
				return width * height; 
			}

			double getPerimeter() {
				return 2 * (width + height);
			}
	}
