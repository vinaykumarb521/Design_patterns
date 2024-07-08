package FacrorialDesignPattern;

public class TaxCalculatorFactory {

	public static TaxCalculation getTaxCalculator(String state) {
        switch (state) {
            case "state1":
                return new State1();
            case "state2":
            	return new State2();
            default:
//                throw new IllegalArgumentException("Invalid state: " + state);
            	throw new IllegalArgumentException(state);
        }
    }
}
