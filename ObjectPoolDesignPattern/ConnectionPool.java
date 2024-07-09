package ObjectPoolDesignPattern;

import java.util.LinkedList;
import java.util.Queue;

public class ConnectionPool {

	private Queue<Connection> availableConnections;
	private int maxSize;

	public ConnectionPool(int maxSize) {

		this.availableConnections = new LinkedList<>();
		this.maxSize = maxSize;
		for (int i = 0; i < maxSize; i += 1) {
			availableConnections.add(new Connection(i));

		}

	}

	public synchronized Connection getConnection() {
		System.out.println("called");

		if (availableConnections.isEmpty()) {
			return null;
		}
		return availableConnections.poll();
	}

	public synchronized void releaseConnection(Connection connection) {
		availableConnections.offer(connection);

	}

}
