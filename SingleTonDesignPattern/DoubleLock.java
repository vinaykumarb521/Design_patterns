package SingleTonDesignPattern;

public class DoubleLock {

	private static DoubleLock doubleLock;

	private DoubleLock() {

	}

	public DoubleLock getInstance() {
		if (doubleLock == null) {
			synchronized (DoubleLock.class) {
				if (doubleLock == null) {
					doubleLock = new DoubleLock();
				}
			}
		}
		return doubleLock;
	}
}
