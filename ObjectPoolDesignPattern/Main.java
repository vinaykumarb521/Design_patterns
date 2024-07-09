package ObjectPoolDesignPattern;

public class Main {

	public static void main(String[] args) {

		ConnectionPool connectionPool = new ConnectionPool(2);

		Connection con1 = connectionPool.getConnection();

		if (con1 != null) {
			con1.connect();
		}

		Connection con2 = connectionPool.getConnection();

		if (con2 != null) {
			con2.connect();
		}

		if (con1 != null) {
			con1.disConnect();
			connectionPool.releaseConnection(con1);
		}

		Connection conn3 = connectionPool.getConnection();
		if (conn3 != null) {
			conn3.connect();
		} else {
			System.out.println("No available connections in the pool.");
		}

	}
}
