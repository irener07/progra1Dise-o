package Algorithms;

public class Reverse_Word extends Transposition {
	
	StringBuffer newpassword = new StringBuffer();

	public Reverse_Word(String text, int op, String crypt) {
		super(text, op, crypt);
		StringBuffer texto = new StringBuffer();
		texto.append(text);
		code(texto);	
	}

	public void code(StringBuffer text) {
		int var = 0;
		text.insert(0, ' ');

		for(int i = 0; i < text.length(); i++) {
			if(text.charAt(i) == ' ') {
				for(int cont = i ; cont > var ; cont--) {
					newpassword.append(text.charAt(cont));
				}
				
				var = i;
			}if(i >= text.length()-1) {
				newpassword.append(" ");
				System.out.println(i);
				for(int cont = i ; cont > var ; cont--) {
					newpassword.append(text.charAt(cont));
				}
				newpassword.deleteCharAt(0);
				System.out.println(newpassword);
			}
		}
	}
}
	
	
	


