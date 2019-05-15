package BakeverkCode;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;


//konstruktøren til oppskrift, brukt atomicInteger for autoincrement.
// i denne filen finner man også getters og setters, og en tostring

public class Oppskrift {
	
	static final AtomicInteger inkremetOppId = new AtomicInteger(0);
	int oppskriftID;
	String oppskriftNavn;
	Date registrertDato;
	String produktKlasse;
	ArrayList ingredienser;
	
	public Oppskrift(/*int oppskriftID,*/ String oppskriftNavn, /*Date registrertDato,*/ String produktKlasse, ArrayList ingredienser) {
		super();
		this.oppskriftID = inkremetOppId.incrementAndGet();
		this.oppskriftNavn = oppskriftNavn;
		//this.registrertDato = registrertDato;
		this.produktKlasse = produktKlasse;
		this.ingredienser = ingredienser;
	}

	public int getOppskriftID() {
		return oppskriftID;
	}

	public void setOppskriftID(int oppskriftID) {
		this.oppskriftID = oppskriftID;
	}

	public String getOppskriftNavn() {
		return oppskriftNavn;
	}

	public void setOppskriftNavn(String oppskriftNavn) {
		this.oppskriftNavn = oppskriftNavn;
	}

	public Date getRegistrertDato() {
		return registrertDato;
	}

	public void setRegistrertDato(Date registrertDato) {
		this.registrertDato = registrertDato;
	}

	public String getProduktKlasse() {
		return produktKlasse;
	}

	public void setProduktKlasse(String produktKlasse) {
		this.produktKlasse = produktKlasse;
	}

	public ArrayList getIngredienser() {
		return ingredienser;
	}

	public void setIngredienser(ArrayList ingredienser) {
		this.ingredienser = ingredienser;
	}

	@Override
	public String toString() {
		return "Oppskrift [oppskriftID=" + oppskriftID + ", oppskriftNavn=" + oppskriftNavn + ", registrertDato="
				+ registrertDato + ", produktKlasse=" + produktKlasse + ", ingredienser=" + ingredienser + "]";
	}
	
	
	
	
	
	
	
	
	

}
