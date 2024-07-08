package calculation;

public class Person {

	private int age;
	private double income;
//	private TaxCalculation taxcalculation;

	private String state;

	public Person(int age, double income, String state) {
		super();
		this.age = age;
		this.income = income;
//		this.taxcalculation = taxcalculation;
		this.state = state;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

//	public TaxCalculation getTaxcalculation() {
//		return taxcalculation;
//	}
//
//	public void setTaxcalculation(TaxCalculation taxcalculation) {
//		this.taxcalculation = taxcalculation;
//	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", income=" + income + ", state=" + state + "]";
	}

}
