package ObjectPoolDesignPattern;

public class Connection {

	private int connectionId;

	public Connection(int connectionId) {
		this.connectionId = connectionId;
	}

	public void connect() {
		System.out.println(" established connection " + connectionId);
	}

	public void disConnect() {
		System.out.println(" closed connection " + connectionId);
	}

}
