
public class CoursePart2 {
	public static void main(String[] args) {
		Course class1 = new Course("class1");

		//put three students in course
		class1.addStudent("Sophia");
		class1.addStudent("Sasha");
		class1.addStudent("August");

		// remove student
		class1.dropStudent("Sophia");

		//display students
		System.out.println("The students in the class are:");
		String[] students = class1.getStudents();
		for (int i = 0; i < class1.getNumberOfStudents(); i++) {
			System.out.print(students[i] + " ");
		}
		System.out.println();
	}
}