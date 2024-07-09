package BuilderDesignPattern;

public class Student {
	private String firstName;
	private String lastName;
	private int age;
	private String studentID;
	private String major;
	private double GPA;

	Student(StudentBuilder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.studentID = builder.studentID;
		this.major = builder.major;
		this.GPA = builder.GPA;
	}

	@Override
	public String toString() {
		return "Student{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", age=" + age
				+ ", studentID='" + studentID + '\'' + ", major='" + major + '\'' + ", GPA=" + GPA + '}';
	}
}
