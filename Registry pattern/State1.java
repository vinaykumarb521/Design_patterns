package calculation;

public class State1 implements TaxCalculation {

	@Override
	public double calculateTax(Person person) {
		System.out.println("entered");
		return 0.1;
	}

}
