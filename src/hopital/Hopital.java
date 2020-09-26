package hopital;

// import pour permettre input utilisateur
import java.util.Scanner;



public class Hopital {
	
	public static void main(String[] args) 
	{
		System.out.println("Bienvenue de la programma Java de l'hôpital");
		System.out.println("===========================================");
		System.out.println();
		System.out.println("Que voulez vous faire ?");
		System.out.println("Saisir les données d'une personne (patient ou employé). tapez 1");
		System.out.println("Saisir les données de locaux ou ordinateurs. tapez 2");
		System.out.println("Gérer le stock de médicaments. tapez 3");
		
		Scanner clavier = new Scanner(System.in);
		System.out.print("Votre choix : ");
		
		double choixUtilisateur = clavier.nextDouble();
		
		// Calcul du prix soldé et affichage
		
				if (choixUtilisateur == 1) {
					System.out.print("Personne");
				} else if (choixUtilisateur == 2) {
					System.out.print("Locaux ou ordinateur");
				} else if (choixUtilisateur == 3) {
					System.out.print("Médicaments");
				} else {
					System.out.print("Vous avez entré le mauvais code.");
				}
				clavier.close();	
}
}