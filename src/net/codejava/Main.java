package net.codejava;
import java.util.Scanner;
import java.lang.Thread;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
			System.out.println("Voulez vous créer une liste de course ? (\"oui\" ou \"non\")");
			String answerCreate = in.nextLine();
			if (answerCreate.equals("non")) {
				System.out.println("D'accord, bonne journée.");	
			}
			else if (answerCreate.equals("oui")) {
				ListeCourses SL = new ListeCourses();
				while(true) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					    
					}
					System.out.println("Quelle action voulez vous effectuer ?");
					System.out.println("1. Ajouter un article à la liste");
					System.out.println("2. Supprimer un article de la liste");
					System.out.println("3. Afficher l'ensemble de la liste");
					System.out.println("4. Rechercher un article de la liste");
					System.out.println("5. Quitter l'application");
					
					int nbrAction = in.nextInt();
					in.nextLine();
					switch (nbrAction) {
					case 1 :
						System.out.println("Entrer le nom du produit à ajouter à la liste: ");
						
						String itemAdd = in.nextLine();
						System.out.println("Entrer la quantité souhaitée : ");
						int quantityAdd = in.nextInt();
						SL.addItem(itemAdd, quantityAdd);
						break;
					case 2 :
						System.out.println("Entrer le nom du produit à retirer de la liste : ");
						String itemRemove = in.nextLine();
						SL.removeItem(itemRemove);
						break;
					case 3 :
						SL.displayList();
						break;
					case 4 :
						System.out.println("Entrer le nom du produit à rechercher dans la liste : ");
						String itemSearch = in.nextLine();
						SL.searchItem(itemSearch);
						break;
					case 5 :
						System.out.println("Vous quittez l'application.");
						System.exit(0);
						break;
					default : 
						System.out.println("Numéro invalide, veuillez réessayer.");
						continue;
					}
				}
			}
		}
		finally {
			in.close();
		}
	}
}