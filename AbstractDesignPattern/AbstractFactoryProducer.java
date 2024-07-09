package AbstractDesignPattern;

public class AbstractFactoryProducer {

	public AbstractFactory getfactoryInstance(String carType) {

		if (carType.equalsIgnoreCase("economic")) {
			return new EconomicCarFactory();
		} else if (carType.equalsIgnoreCase("luxcary")) {
			return new LuxuaryCarFatory();
		}
		return null;

	}
}
