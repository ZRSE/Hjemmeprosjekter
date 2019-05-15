package BakeverkCode;

import java.util.concurrent.atomic.AtomicInteger;


//konstruktøren til ingrediens, brukt atomicInteger for autoincrement
//i denne filen finner man også getters og setters, og en tostring

public class Ingrediens {
	
	static final AtomicInteger inkremetId = new AtomicInteger(0);
	int ingrediensID;
	String ingrediensNavn;
	int lagerbeholdningGram;
	
	
	public Ingrediens(int ingrediensID, String ingrediensNavn, int lagerbeholdningGram) {
		super();
		this.ingrediensID = inkremetId.incrementAndGet();
		this.ingrediensNavn = ingrediensNavn;
		this.lagerbeholdningGram = lagerbeholdningGram;
	}


	public int getIngrediensID() {
		return ingrediensID;
	}


	public void setIngrediensID(int ingrediensID) {
		this.ingrediensID = ingrediensID;
	}


	public String getIngrediensNavn() {
		return ingrediensNavn;
	}


	public void setIngrediensNavn(String ingrediensNavn) {
		this.ingrediensNavn = ingrediensNavn;
	}


	public int getLagerbeholdningGram() {
		return lagerbeholdningGram;
	}


	public void setLagerbeholdningGram(int lagerbeholdningGram) {
		this.lagerbeholdningGram = lagerbeholdningGram;
	}


	@Override
	public String toString() {
		return "Ingrediens [ingrediensID=" + ingrediensID + ", ingrediensNavn=" + ingrediensNavn
				+ ", lagerbeholdningGram=" + lagerbeholdningGram + "]";
	}
	
	
}
