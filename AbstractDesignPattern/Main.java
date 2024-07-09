package AbstractDesignPattern;

public class Main {

	public static void main(String[] args) {

		AbstractFactoryProducer afp = new AbstractFactoryProducer();
		AbstractFactory carFactory = afp.getfactoryInstance("economic");

		Car car = carFactory.getInstance(1000000000);
		System.out.println(car.getTopSpeed());

		
		 carFactory = afp.getfactoryInstance("luxcary");

		 car = carFactory.getInstance(1000000000);
		System.out.println(car.getTopSpeed());

	}
}
