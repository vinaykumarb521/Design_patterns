package BuilderDesignPattern;

public class StudentBuilder {
	String firstName;
	String lastName;
	int age;
	String studentID;
	String major;
	double GPA;

	public StudentBuilder setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public StudentBuilder setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public StudentBuilder setAge(int age) {
		this.age = age;
		return this;
	}

	public StudentBuilder setStudentID(String studentID) {
		this.studentID = studentID;
		return this;
	}

	public StudentBuilder setMajor(String major) {
		this.major = major;
		return this;
	}

	public StudentBuilder setGPA(double GPA) {
		this.GPA = GPA;
		return this;
	}

	public Student build() {
		return new Student(this);
	}
}