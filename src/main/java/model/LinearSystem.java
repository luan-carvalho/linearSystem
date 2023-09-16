package model;

public class LinearSystem {

	private SquareMatrix coeficients;
	private double[] results;

	public LinearSystem() {

		coeficients = new SquareMatrix(3);
		results = new double[3];

	}

	public void fillValues(int line, double[] values) {

		for (int i = 0; i < values.length; i++) {

			if (i < 3) {

				this.coeficients.set(values[i], line, (i + 1));

			}

			if (i == 3) {
				this.results[line - 1] = values[i];
			}

		}

	}

	// Solving the linear system using the Cramer's rule for solving linear systems
	public double[] calculateResult() {

		double[] results = new double[3];

		for (int i = 0; i < results.length; i++) {

			SquareMatrix tempMatrix = this.coeficients.clone();

			tempMatrix.setRow(this.results, (i + 1));

			results[i] = tempMatrix.det() / this.coeficients.det();

		}

		return results;

	}

}
