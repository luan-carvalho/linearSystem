package application;

import model.LinearSystem;

public class App {

	public static void main(String[] args) throws Exception {
		
		double[] l1 = {1, 1, 1, 8};
		double[] l2 = {1, -2, 1, 4};
		double[] l3 = {1, 1, -1, -4};
		
		LinearSystem sys = new LinearSystem();
		
		sys.fillValues(1, l1);
		sys.fillValues(2, l2);
		sys.fillValues(3, l3);
		
		double[] results = sys.calculateResult();
		
		System.out.println("x = " + results[0]);
		System.out.println("y = " + results[1]);
		System.out.println("z = " + results[2]);


	}

}
