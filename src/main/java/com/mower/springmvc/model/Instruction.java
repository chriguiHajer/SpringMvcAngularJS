package com.mower.springmvc.model;

public enum Instruction {

	// Insctructions possibles
		Avancer{public void avancer(final Mower mower){ mower.avancer();}},
		Tourner_Gauche{public void tournerGauche(final Mower mower){ mower.tournerAGauche();}},
		Tourner_Droit{public void tournerDroit(final Mower mower){ mower.tournerADroit();}};


}
