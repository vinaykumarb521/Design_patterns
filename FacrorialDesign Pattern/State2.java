package FacrorialDesignPattern;

public class State2 implements TaxCalculation{

	@Override
	public double calculateTax(Person person) {
		
		return 0.8;
	}

	
}
