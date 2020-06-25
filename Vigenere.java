package Algorithms;

public class Vigenere extends Sustitution{
	
	int vigenere;
	StringBuffer newpassword = new StringBuffer(); 
	int cifra;
	int newcifra1;
	int newcifra2;
	int flag = 0;
	
	public Vigenere(String text, int op, String crypt, int vigenere) {
		super(text, op, crypt);
		this.vigenere = vigenere;
		category(text,op,vigenere);
	}
	
	public void category(String text, int op, int vigenere) {
		if (op == 0){
			code(text,vigenere);
		}
		if (op == 1) {
			decode(text,vigenere);
		}		
	}
	
	public void code(String text, int vigenere) {
		for (int i = 0; i < text.length() ; i++) {
			if(text.charAt(i) == ' ') {
				newpassword.append(" ");
				flag = 0;
				//i++;
			}else {
				cifra = alphabet.indexOf(text.charAt(i));
				newcifra1 = changecifra(cifra+(int)vigenere/10);
				newcifra2 = changecifra(cifra+vigenere%10);
				if(flag == 0) {
					newpassword.append(alphabet.charAt(newcifra1));
					flag++;
				}
				else if(flag == 1) {
					newpassword.append(alphabet.charAt(newcifra2));
					flag--;	
				}
			}

		}System.out.println(newpassword);

	}
	
	public void decode(String text, int vigenere) {
		for (int i = 0; i < text.length() ; i++) {
			if(text.charAt(i) == ' ') {
				newpassword.append(" ");
				flag = 0;
				//i++;
			}else {
				cifra = alphabet.indexOf(text.charAt(i));
				newcifra1 = changecifra(cifra-(int)vigenere/10);
				newcifra2 = changecifra(cifra-vigenere%10);
				if(flag == 0) {
					newpassword.append(alphabet.charAt(newcifra1));
					flag++;
				}
				else if(flag == 1) {
					newpassword.append(alphabet.charAt(newcifra2));
					flag--;	
				}
			}

		}System.out.println(newpassword);
		
		
		
	}
	
	public int changecifra (int cifra){
		if (cifra < 0){
			cifra = cifra +26;	
		}
		if (cifra > 25) {
			cifra = cifra-26;	
		}
		return cifra;	
	}
	
}
