package Algorithms;

public class Sustitution extends Codification{

	public Sustitution(String text, int op, String crypt) {
		super(text, op, crypt);
		//sustitution_category(crypt);
	}
	/*
	public void sustitution_category(String crypt) {
		if (crypt == "cesar") {
			new Cesar(text,op,crypt);
		}
		if (crypt == "vigenere") {
			new Vigenere(text,op,crypt);			
		}
		else {
			new Key(text,op,crypt);
		}
	}*/
}
