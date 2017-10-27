
public class Circle2DPart2 {
	public static void main(String[] args) {
		Circle2D c1 = new Circle2D(2, 2, 5.5);//make circle with (x,y)point and radius

		System.out.println("Area of circle1 is " + c1.getArea()); 
		System.out.println("perimeter of Circle1 is " + c1.getPerimeter()); 
		//contain (3,3)
		System.out.println("Does circle1 contain the point (3, 3)? ");
		System.out.println(c1.contains(3, 3)); 
		//contain (4,5) and 10.5
		System.out.println("Does circle1 contain the circle with center at "
			+ "the point (4, 5) and radius 10.5? " );
		System.out.println( c1.contains(new Circle2D(4, 5, 10.5)));
		//contain (3,5) and 2.3
		System.out.println("Does circle1 overlap the circle with center at "
				+ "the point (3, 5) and radius 2.3? "); 
		System.out.println(c1.overlaps(new Circle2D(3, 5, 2.3)));
	}
}
/*
*                     Circle2D                    
* -x: double                                      
* -y: double                                      
* -radius: double   
*                               
* +Circle2D()                                     
* +Circle2D(x: double, y: double, radius: double) 
* +getX(): double                                 
* +getY(): double                                 
* +getRadius(): double                            
* +getArea(): double                              
* +getPerimeter(): double                         
* +contains(x: double, y: double): boolean        
* +contains(Circle2D: circle): boolean            
* +overlaps(Circle2D: circle): boolean            
*/