package calculation;

import java.util.HashMap;
import java.util.Map;

import FacrorialDesignPattern.TaxCalculation;

public class RegistryCalculation {
	private static Map<String, TaxCalculation> map = new HashMap<>();

	public static void putMap(String state, TaxCalculation t) {
		map.put(state, t);
	}

	public static TaxCalculation getInstance(String state) {

		return map.get(state);
	}
}
