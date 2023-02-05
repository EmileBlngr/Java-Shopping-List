package net.codejava;
/* Liste de courses : Écrivez un programme qui gère une liste de courses. 
 * Le programme permettra à l'utilisateur de :
Ajouter des articles à la liste
Supprimer des articles de la liste
Afficher la liste complète
Rechercher un article dans la liste*/
import java.util.HashMap;
public class ListeCourses {
	private HashMap<String, Integer> shoppingList = new HashMap<String, Integer>();
	ListeCourses(){}
	public void addItem(String name, Integer quantity) {
		shoppingList.put(name, quantity);
		System.out.println("\nArticle " + name + " x " + quantity + " ajouté à la liste !");
	}
	public void removeItem(String name) {
		shoppingList.remove(name);
		System.out.println("\nArticle " + name + " retiré de la liste !");
	}
	public void displayList() {
		System.out.println("\nVoici votre liste de courses complète : ");
		for (String i : shoppingList.keySet()) {
			System.out.println(i + " x " + shoppingList.get(i));
		}
	}
	public boolean searchItem(String name) {
		if (shoppingList.containsKey(name)){
			System.out.println("Le produit "+name+" est présent dans la liste");
			return true;
		}
		else 
			System.out.println("Le produit "+name+" n'est pas présent dans la liste");
			return false;
	}
}
