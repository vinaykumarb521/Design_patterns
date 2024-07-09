package SingleTonDesignPattern;

public class LazyInitialization {

	private static LazyInitialization lazyInitialization;

	private LazyInitialization() {

	}

	public LazyInitialization getInstance() {
		if (lazyInitialization == null) {
			new LazyInitialization();
		}
		return lazyInitialization;
	}
}
