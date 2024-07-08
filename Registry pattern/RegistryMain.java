package calculation;

import FacrorialDesignPattern.Person;
import FacrorialDesignPattern.State1;
import FacrorialDesignPattern.State2;
import FacrorialDesignPattern.TaxCalculation;

public class RegistryMain {

	public static void main(String[] args) {
		RegistryCalculation.putMap("state1", new State1());
		RegistryCalculation.putMap("state2", new State2());
		Person per = new Person(14, 200000.0, "state1");

		TaxCalculation tx = RegistryCalculation.getInstance(per.getState());
		System.out.println(tx.calculateTax(per));

	}

}



// The objective of this coding round is to demonstrate the understanding of OO based design patterns and OO design principles. 
 
// * PROBLEM STATEMENT: 
 
// * Utopia is an imaginary country, which is newly formed. Utopia has different immigrants coming in and creating their own states. At this point there are 4 states in the country 
 
// * As a start-up you have received the work order from Utopia to create a tax calculation software for each individual in Utopia. 
 
// * Each of the States have a different tax law.
 
// * State-1 -> Tax calculation based on age. For instance, above 70 years no tax, 50-60 years 10%, 18-50 years 30%, 
 
// * State-2 -> Flat 30% tax
 
// * State-3 -> Tax calculation based on income 1-2 lakhs no tax, 2-5 lakhs 10%, 5-10 lakhs 20%, 10 Lakhs and above 30%
 
// * State-4 -> No Tax - There is no tax in this state. ZArtulugu@outcomes.comrtulugu@outcomes.com
 
// * Your job is to build a program that will do the tax computation for a Person who is part of a particular state. 
 
// * 
 
// * KPIs: 
 
// * 1. Please note that this is a start-up, we need to build an extensive design that will allow you to add more states and add more tax variations. 
 
// * 2. Demonstrate extensive usage of design patterns, OO principles and so on.
 
// *Please note this is not a system design question, it should be solved PURELY using core tech. No need to create tables and services here. Good luck!
 
 
 
// * /
 
// */ 