package com.mower.springmvc.model;

public class Coordinates {

	public int x;

	public int y;

	public Orientation orientation;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Orientation getOrientation() {
		return this.orientation;
	}

	public void setOrientation(String orientation) {

		switch (orientation) {

		case "N":
			this.orientation = Orientation.NORD;
			break;
		case "S":
			this.orientation = Orientation.SUD;
			break;
		case "O":
			this.orientation = Orientation.OUEST;
			break;
		case "E":
			this.orientation = Orientation.EST;
			break;
		}

	}

}
