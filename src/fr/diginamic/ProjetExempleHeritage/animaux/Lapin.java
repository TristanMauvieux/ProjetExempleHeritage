package fr.diginamic.ProjetExempleHeritage.animaux;

import fr.diginamic.ProjetExempleHeritage.regime.Herbivore;
import fr.diginamic.ProjetHeritage.animal.Animal;

public class Lapin extends Animal{

	public Lapin(int age, float poids, int taille) {
		super(age, poids, taille,"");
		Herbivore herbivore = new Herbivore();
	}
	

}
