package AbstractDesignPattern;

public class EconomicCarFactory implements AbstractFactory {

	@Override
	public Car getInstance(int price) {
		// TODO Auto-generated method stub
		if (price <=10000000)
			return new EconomicCarOne();
		return new EconomicCarTwo();
	}

}
