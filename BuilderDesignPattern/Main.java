package BuilderDesignPattern;

public class Main {

	public static void main(String[] args) {
		Student student1 = new StudentBuilder().setFirstName("John").setLastName("Doe").setAge(20)
				.setStudentID("S123456").setMajor("Computer Science").setGPA(3.8).build();

		Student student2 = new StudentBuilder().setFirstName("Jane").setLastName("Smith").setAge(22)
				.setMajor("Electrical Engineering").setGPA(3.9).build();

		System.out.println(student1);
		System.out.println(student2);
	}
}
