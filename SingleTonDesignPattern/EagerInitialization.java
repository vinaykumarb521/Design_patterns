package SingleTonDesignPattern;

public class EagerInitialization {

	private static EagerInitialization eagerInitialization = new EagerInitialization();

	private EagerInitialization() {
	}

	public EagerInitialization getInstance() {
		return eagerInitialization;
	}

	
}
