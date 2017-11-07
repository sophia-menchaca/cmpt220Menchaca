import java.util.Scanner;
public class TrianglePart2 {
	public static void main(String[] args) {
		Triangle triangle = new Triangle(1, 1.5, 1);
		triangle.setColor("yellow");
		triangle.setFilled(true);
		//print triangle info
		System.out.println(triangle.toString());
		System.out.println("Do the three sides form a triangle?: " + isTriangleValid(1,1.5,1));
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
