import java.util.Scanner;
public class TrianglePart2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// geet 3 sides from userr
		System.out.print("Enter three side lengths of the triangle: ");
		double side1 = input.nextDouble();		
		double side2 = input.nextDouble();		
		double side3 = input.nextDouble();
		//user filled
		System.out.print("Is the triangle filled (true / false)? ");
		boolean filled = input.nextBoolean();
		//user color
		System.out.print("Enter a color: ");
		String color = input.next();
		//make user trieangle
		Triangle triangle = new Triangle(side1, side2, side3);
		triangle.setColor(color);
		triangle.setFilled(filled);
		//print triangle info
		System.out.println(triangle.toString());
		System.out.println("Do the three sides form a triangle?: " + isTriangleValid(side1, side2, side3));
		System.out.println("Area: " + triangle.getArea());
		System.out.println("Perimeter: " + triangle.getPerimeter());
		System.out.println("Triangle is " + (triangle.isFilled() ? "" : " not ") 
			+ "filled");
		System.out.println("Color: " + triangle.getColor());
	}

	public static boolean isTriangleValid(double side1, double side2, double side3) {
		 if((side1+side2)>side3 && (side1+side3)>side2 && (side2+side3)>side1) {
			 return true;
		}else {
			return false;
	    }
    }
}
//UML DIAGRAMS
/*
*                       Triangle                         
* -side1: double                                         
* -side2: double                                         
* -side3: double                                         
* +Triangle()                                            
* +Triangle(side1: double, side2: double, side3: double) 
* +getSide1(): double                                    
* +getSide2(): double                                    
* +getSide3(): double                                    
* +getArea(): double                                     
* +getPerimeter(): double                                
* +toString(): String                                    
*/

/*
* GeometricObject                   
* -color: String                    
* -filled: boolean                  
* -dateCreated: java.util.Date  
*     
* +GeometricObject()                
* +GeometricObject(color: String,   
*	filled: boolean)                
* +getColor(): String               
* +setColor(color: Stirng): void    
* +isFilled(): boolean              
* +setFilled(filled: boolean): void 
* +getDateCreated(): java.util.Date 
* +toString(): String               
*/