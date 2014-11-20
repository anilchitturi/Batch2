package variables;

public class Student {
	// this instance variable is visible for any child class.
	public String name;

	// marks variable is visible in Student class only.
	private int marks;

	// The name variable is assigned in the constructor.
	public Student(String StudName) {
		name = StudName;
	}

	// The marks variable is assigned a value.
	public void setMarks(int studMarks) {
		marks = studMarks;
	}

	// This method prints the student's details.
	public void printStud() {
		System.out.println("Student name  : " + name);
		System.out.println("Marks :" + marks);
	}

	
	public static void main(String args[]) {
		Student st = new Student("Divya");
		st.setMarks(80);
		st.printStud();
	}
}
