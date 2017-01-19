package com.mower.springmvc.model;

public enum Orientation {

	// La liste des orientations
	OUEST("Orientation OUEST"), SUD("Orientation SUD"), EST("Orientation EST"), NORD("Orientation NORD");

	private String name = "";

	// Constructeur
	Orientation(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}
	
	public void orientationGauche(String orientation){
		switch(orientation) {
		case "NORD":
			this.name = EST.toString();
		case "OUEST" :
			this.name = NORD.toString();
		case "SUD":
			this.name = OUEST.toString();
		case "EST" :
			this.name = SUD.toString();
		}
	}
	
	public void orientationDroit(String orientation){
		switch(orientation) {
		case "NORD":
			this.name = OUEST.toString();
		case "OUEST" :
			this.name = SUD.toString();
		case "SUD":
			this.name = EST.toString();
		case "EST" :
			this.name = NORD.toString();
		}
	}
	
	public void avancer(String orientation){
		
	}

}
