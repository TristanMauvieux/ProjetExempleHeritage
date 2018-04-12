package fr.diginamic.ProjetExempleHeritage.main;

import fr.diginamic.ProjetExempleHeritage.Aliment.Plante;
import fr.diginamic.ProjetExempleHeritage.Aliment.Viande;
import fr.diginamic.ProjetExempleHeritage.animaux.Homme;
import fr.diginamic.ProjetExempleHeritage.animaux.Lapin;
import fr.diginamic.ProjetExempleHeritage.animaux.Lion;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lapin bunny = new Lapin(10, 12, 10,"bunny");
		Lion henry = new Lion(30, 500, 60, "henry");
		Homme philipe = new Homme(45, 70, 187, "philipe");
		
		
		Plante carotte = new Plante("carotte");
		Viande steak = new Viande("steak");
		
		bunny.getregime().manger(steak);
		bunny.getregime().manger(carotte);
		
		henry.getregime().manger(steak);
		henry.getregime().manger(carotte);
		henry.getregime().manger(bunny);
		henry.getregime().manger(philipe);
	}

}
