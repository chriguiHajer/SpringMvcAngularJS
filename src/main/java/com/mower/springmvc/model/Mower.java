package com.mower.springmvc.model;

import java.util.ArrayList;
import java.util.List;

public class Mower {

	private long id;

	Coordinates coordinates;

	List<Instruction> instructions;
	
	Orientation orientation;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Coordinates getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;
	}

	public List<Instruction> getInstructions() {
		return instructions;
	}

	public void setInstructions(List<Instruction> instructions) {
		this.instructions = instructions;
	}

	public Mower(long id, Coordinates coordinates,String instructions) {
		super();
		this.id = id;
		this.coordinates = coordinates;
		List<Instruction> listInsctructions = new ArrayList<Instruction>();
		for(char instruction: instructions.toCharArray()){
			
			switch(instruction){
			case 'A':
				 listInsctructions.add(Instruction.Avancer);
				break;
			case 'D':
				listInsctructions.add(Instruction.Tourner_Droit);
				break;
			case 'G':
				listInsctructions.add(Instruction.Tourner_Gauche);
				break;
			}
			
		}
		
	  this.instructions = listInsctructions;
	}
	
	public void tournerAGauche(){
		this.orientation.orientationGauche(orientation.toString());
	}
	
	public void tournerADroit(){
		this.orientation.orientationDroit(orientation.toString());
	}
	
	public void avancer(){
		this.orientation.avancer(orientation.toString());
	}

}
