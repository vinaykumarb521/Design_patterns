package protoTypeDesignPattern;

public class Main {

	public static void main(String[] args) {
		StudentOne original = new StudentOne(1, "John Doe");

		try {
			StudentOne cloned = (StudentOne) original.clone();
			System.out.println("Original: " + original);
			System.out.println("Cloned: " + cloned);
		} catch (CloneNotSupportedException e) {
			System.out.println("Cloning not supported: " + e.getMessage());
		}
	}
}
