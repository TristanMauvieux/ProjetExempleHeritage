package fr.diginamic.ProjetExempleHeritage.main;

import fr.diginamic.ProjetExempleHeritage.Aliment.Aliment;
import fr.diginamic.ProjetExempleHeritage.animaux.Lapin;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lapin bunny = new Lapin(10, 12, 10);
		
		Aliment viande = new Aliment("steak", true);
		Aliment carotte = new Aliment("carrote",false);
		
		bunny.getregime().manger(viande);
		bunny.getregime().manger(carotte);
	}

}
