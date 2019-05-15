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

		//Todo:_legg inn en løkke som sjekker om noe på den id finnes fra før

		
		Ingrediens ingredienser = new Ingrediens(ingrediensID, ingrediensNavn, lagerbeholdningGram);
		ingrediens.add(ingredienser);
	}
	
	public void addOppskrift(String oppskriftNavn, String produktKlasse, ArrayList ingredienser) {

		//Todo:_legg inn en løkke som sjekker om noe på den id finnes fra før

		
		Oppskrift oppskrift = new Oppskrift(oppskriftNavn, produktKlasse, ingredienser);
		oppskrifter.add(oppskrift);
	}
	
	public boolean updateIngredient(int ingrediensId, int lagerbeholdningGram) {
		
		 
		//oppdater lagerbeholdning
		
		for (int i = 0; i < ingrediens.size(); i++) {
			if (ingrediens.get(i).getIngrediensID() == ingrediensId) {
				
				lagerbeholdningGram += lagerbeholdningGram;
						
				ingrediens.get(i).setLagerbeholdningGram(lagerbeholdningGram);
				
			}
		}
		

		
		return false;
		
	}
	
	//Viser ingredienser
	public boolean visIngredienser() {
		
		
		
		//for å skrive ut ingredienser
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
		
		
		//KnowitBakeri.addOppskrift("Kake", "Gjærbakst",  );

		
		System.out.println(KnowitBakeri.visIngredienser());
		
		System.out.println("//////////////////////////////////////");
		
		//Legg til 5000 gram 
		KnowitBakeri.updateIngredient(2, 5000);
		
		System.out.println(KnowitBakeri.visIngredienser());

	}

}
