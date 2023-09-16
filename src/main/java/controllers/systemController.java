package controllers;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import model.LinearSystem;

@Named
@RequestScoped
public class systemController implements Serializable {

	private static final long serialVersionUID = 1L;

	private LinearSystem sys;

	private String xResult;
	private String yResult;
	private String zResult;

	private boolean showResultsModal = false;

	private double x1;
	private double y1;
	private double z1;
	private double r1;

	private double x2;
	private double y2;
	private double z2;
	private double r2;

	private double x3;
	private double y3;
	private double z3;
	private double r3;

	public boolean getShowResultsModal() {
		return showResultsModal;
	}

	public void setShowResultsModal(boolean showResultsModal) {
		this.showResultsModal = showResultsModal;
	}

	public String getxResult() {
		return xResult;
	}

	public void setxResult(String xResult) {
		this.xResult = xResult;
	}

	public String getyResult() {
		return yResult;
	}

	public void setyResult(String yResult) {
		this.yResult = yResult;
	}

	public String getzResult() {
		return zResult;
	}

	public void setzResult(String zResult) {
		this.zResult = zResult;
	}

	public double getX1() {
		return x1;
	}

	public void setX1(double x1) {
		this.x1 = x1;
	}

	public double getY1() {
		return y1;
	}

	public void setY1(double y1) {
		this.y1 = y1;
	}

	public double getZ1() {
		return z1;
	}

	public void setZ1(double z1) {
		this.z1 = z1;
	}

	public double getR1() {
		return r1;
	}

	public void setR1(double r1) {
		this.r1 = r1;
	}

	public double getX2() {
		return x2;
	}

	public void setX2(double x2) {
		this.x2 = x2;
	}

	public double getY2() {
		return y2;
	}

	public void setY2(double y2) {
		this.y2 = y2;
	}

	public double getZ2() {
		return z2;
	}

	public void setZ2(double z2) {
		this.z2 = z2;
	}

	public double getR2() {
		return r2;
	}

	public void setR2(double r2) {
		this.r2 = r2;
	}

	public double getX3() {
		return x3;
	}

	public void setX3(double x3) {
		this.x3 = x3;
	}

	public double getY3() {
		return y3;
	}

	public void setY3(double y3) {
		this.y3 = y3;
	}

	public double getZ3() {
		return z3;
	}

	public void setZ3(double z3) {
		this.z3 = z3;
	}

	public double getR3() {
		return r3;
	}

	public void setR3(double r3) {
		this.r3 = r3;
	}

	public LinearSystem getSys() {
		return sys;
	}

	public void setSys(LinearSystem sys) {
		this.sys = sys;
	}

	public void cleanFields() {

		x1 = 0;
		y1 = 0;
		z1 = 0;
		r1 = 0;

		x2 = 0;
		y2 = 0;
		z2 = 0;
		r2 = 0;

		x3 = 0;
		y3 = 0;
		z3 = 0;
		r3 = 0;

	}

	public void newSystem() {
		cleanFields();
		this.showResultsModal = false;
	}

	public void createLinearSystem() {

		sys = new LinearSystem();
		double[] l1 = { x1, y1, z1, r1 };
		double[] l2 = { x2, y2, z2, r2 };
		double[] l3 = { x3, y3, z3, r3 };

		sys.fillValues(1, l1);
		sys.fillValues(2, l2);
		sys.fillValues(3, l3);
	}

	public void calculate() {

		createLinearSystem();

		this.xResult = String.format("%.2f", sys.calculateResult()[0]);
		this.yResult = String.format("%.2f", sys.calculateResult()[1]);
		this.zResult = String.format("%.2f", sys.calculateResult()[2]);

		if (!this.showResultsModal) {
			this.showResultsModal = true;
		}

	}

}
