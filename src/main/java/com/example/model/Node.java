package com.example.model;

public class Node {

	private String name;
	private boolean FixX;
	private boolean FixY;
	private double[] initial;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isFixX() {
		return FixX;
	}
	public void setFixX(boolean fixX) {
		FixX = fixX;
	}
	public boolean isFixY() {
		return FixY;
	}
	public void setFixY(boolean fixY) {
		FixY = fixY;
	}
	public double[] getInitial() {
		return initial;
	}
	public void setInitial(double[] initial) {
		this.initial = initial;
	}
	
	
}
