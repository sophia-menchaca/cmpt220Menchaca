import java.util.ArrayList;
public class Course {
	// Data fields
	private String courseName;
	private ArrayList<String> students;
	// Constructor
	/** Create a Course object */
	public Course(String courseName) {
		this.courseName = courseName;
		students = new ArrayList<String>();
	}
	//add studetn to list
	public void addStudent(String student) {
		students.add(student);
	}
	//return students in array
	public String[] getStudents() {
		String[] a = new String[students.size()];
		return students.toArray(a);
	}
	//return number of students
	public int getNumberOfStudents() {
		return students.size();
	}
	//return name of course
	public String getCourseName() {
		return courseName;
	}
	//drop a student from the list
	public void dropStudent(String student) {
		students.remove(student);
	}
}