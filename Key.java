package Algorithms;

public class Key extends Sustitution {
	
	String key;
	int index_key;
	int index_text;
	int index_password;
	StringBuffer keyString = new StringBuffer();
	StringBuffer password = new StringBuffer();


	
	public Key(String text, int op, String crypt, String key) {
		super(text, op, crypt);
		this.key = key;
		category(text,op,key);
	}
	
	public void category(String text, int op, String key) {
		if (op == 0){
			code(text,key);
			//code(text,key);
		}
		if (op == 1) {
			decode(text,key);
		}		
	}
	
	public void code(String text, String key) {
		fill_word(text,key);
		int num;
		for (int i = 0; i < text.length() ; i++) {
			if (text.charAt(i) == ' '){
				password.append(" ");
				
				
				
			}else {
				num = alphabet.indexOf(text.charAt(i)) + alphabet.indexOf(keyString.charAt(i));
			
				if(num > 26) {
					num = num -26;
					password.append(alphabet.charAt(num));

				
				}else {
					password.append(alphabet.charAt(num));
				
				}
			}
		}
		System.out.println(password);	
	}
	
	public void decode(String text, String key) {
		fill_word(text,key);
		int num;
		for (int i = 0; i < text.length() ; i++) {
			if (text.charAt(i) == ' '){
				password.append(" ");
				
				
				
			}else {
				num = alphabet.indexOf(text.charAt(i)) - alphabet.indexOf(keyString.charAt(i));
			
				if(num < 0) {
					num = num + 26;
					password.append(alphabet.charAt(num));

				
				}else {
					password.append(alphabet.charAt(num));
				
				}
			}
		}
		System.out.println(password);	
	}
		
	public void fill_word(String word,String key) {
		int var = 0;
		for (int i = 0; i < word.length() ; i++) {
			if(word.charAt(i) == ' ') {
				var = 0;
				keyString.append(" ");
				i++;
			}
			if(var >= key.length()) {
				var = 0;	
			}if(var <= key.length()) {
			keyString.append(key.charAt(var));
			var++;
			}
			
		}

		
		
	}
	
}
