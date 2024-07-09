package AbstractDesignPattern;

public class LuxuaryCarFatory implements AbstractFactory {

	@Override
	public Car getInstance(int price) {
		// TODO Auto-generated method stub
		if (price <= 20000000)
			return new LuxuaryCarOne();
		return new LuxuaryCarTwo();
	}

}
