
public class CoursePart2 {
	public static void main(String[] args) {
		Course course1 = new Course("Math 101");
		Course course2 = new Course("Science 101");

		course1.addStudent("Sophia Menchaca");
		course1.addStudent("Sasha Smith");
		course1.addStudent("August White");

		course2.addStudent("Sophia Menchaca");
		course2.addStudent("August White");

		System.out.println("Number of students in Math 101: "
			+ course1.getNumberOfStudents());
		String[] students = course1.getStudents();
		for (int i = 0; i < course1.getNumberOfStudents(); i++)
			System.out.print(students[i] + ", ");

		System.out.println();
		System.out.print("Number of students in Science 101: "
			+ course2.getNumberOfStudents());
	}
}
/*
*               Course                
* -courseName: String                 
* -students: ArrayList<String>        
* -numberOfStudents: int              
* +Course(courseName: String)         
* +getCourseName(): String            
* +addStudent(student: String): void  
* +dropStudent(student: String): void 
* +getStudents(): String[]            
* +getNumberOfStudents(): int      
* */