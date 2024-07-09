package SingleTonDesignPattern;

public class SynchronizedInitilization {

	private static SynchronizedInitilization synchronizedInitilization;

	private SynchronizedInitilization() {

	}

	public synchronized SynchronizedInitilization getInstance() {

		if (synchronizedInitilization == null) {
			new SynchronizedInitilization();
		}
		return synchronizedInitilization;

	}
}
