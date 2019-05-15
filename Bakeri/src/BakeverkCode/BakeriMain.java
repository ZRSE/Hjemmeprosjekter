package BakeverkCode;

import java.util.ArrayList;
import java.util.Date;

public class BakeriMain {
	
	
	ArrayList<Ingrediens> ingrediens = new ArrayList<>();
	ArrayList<Oppskrift> oppskrifter = new ArrayList<>();
	
	
	
	//Nytt bakeri
	private String navn;
	
	public BakeriMain(String navn) {
		this.navn = navn;
	}
	
	
	//For å legge til ingrediens
	public void addIngrediens(int ingrediensID, String ingrediensNavn, int lagerbeholdningGram) {
		Ingrediens ingredienser = new Ingrediens(ingrediensID, ingrediensNavn, lagerbeholdningGram);
		ingrediens.add(ingredienser);
	}
	
	public void addOppskrift(int oppskriftID, String oppskriftNavn, Date registrertDato, String produktKlasse, ArrayList ingredienser) {
		
	}
	
	//Viser ingredienser
	public boolean visIngredienser() {
		
		
		for(Ingrediens ing : ingrediens) {
			
			
			StringBuilder alleIngredienser = new StringBuilder();
			
			alleIngredienser.append("IngrediensID: ");
			alleIngredienser.append(ing.getIngrediensID() + "\n");
			alleIngredienser.append("Ingrediensnavn: ");
			alleIngredienser.append(ing.getIngrediensNavn() + "\n");
			alleIngredienser.append("Lagerbeholdning i gram: ");
			alleIngredienser.append(ing.getLagerbeholdningGram());
			alleIngredienser.append("g");
			

		
			
			System.out.print(alleIngredienser);
			System.out.println(" ");
			System.out.println(" ");
			
		}
		
		return true;
		
	}
	

	public static void main(String[] args) {
			
		BakeriMain KnowitBakeri = new BakeriMain("Knowits Bakeri");
		System.out.println("Velkommen til Knowits Bakeri");
		
		//Er autoinkrement
		KnowitBakeri.addIngrediens(0, "Pepper", 2);
		KnowitBakeri.addIngrediens(0, "Hvete", 500);
		KnowitBakeri.addIngrediens(0, "Havre", 520);

		
		System.out.println(KnowitBakeri.visIngredienser());
		
		
		
	}

}
