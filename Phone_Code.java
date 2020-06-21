package Algorithms;

public class Phone_Code extends Codification {

	public Phone_Code(String text, int op, String crypt) {
		super(text, op, crypt);
		phone_code_Algorithm(text,op);
	}
	
	String[] code = {"21","22","23","31","32","33","41","42","43","51","52","53","61","62","63","71","72","73","74","81","82","83","91","92","93","94"};
	StringBuffer newcode = new StringBuffer();
	int a;
	
	public void phone_code_Algorithm(String password, int op) {
		if (op ==0) {
			phone_code(password);		
		}
		if (op==1) {
			//decode(password);
		}
		
	}
	
	
	public void phone_code(String text) {
		for (int i = 0; i < text.length(); i++) {
			if(text.charAt(i) == ' ') {
				newcode.append("*");
			}else {
			a = alphabet.indexOf(text.charAt(i));
			newcode.append(code[a]);
			newcode.append(" ");

			}
		}
		System.out.println(newcode);
	
	}
	public void phone_decode(String text) {
		for (int i = 0; i < text.length(); i++) {
			
		}

		
		
	}
	
	



}
