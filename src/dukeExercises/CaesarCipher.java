package dukeExercises;

public class CaesarCipher {
	
	public String encrypt(String input, int key) {
		StringBuilder encrypted = new StringBuilder(input.toLowerCase());
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String shiftedAlphabet = alphabet.substring(key)+alphabet.substring(0, key);
		
		
		for(int i=0; i<encrypted.length(); i++) {
			char currChar = encrypted.charAt(i);
			//Character.toLowerCase(currChar);
			int idx = alphabet.indexOf(currChar);
			if (idx != -1) {
				char newChar = shiftedAlphabet.charAt(idx);
				encrypted.setCharAt(i, newChar);
			}
		}
		return encrypted.toString();
	}
	public String encryptTwoKeys(String input, int key1, int key2) {
		String one = encrypt(input, key1);
		String two = encrypt(input, key2);
		StringBuilder encrypted = new StringBuilder(input);
		for(int i=0; i<input.length(); i++) {
			if(i==0 ||i%2==0) {
				encrypted.setCharAt(i, one.toCharArray()[i]);
			}else {
				encrypted.setCharAt(i, two.toCharArray()[i]);
			}
		}
				
		return encrypted.toString();
		
	}

//	public void testCaesar() {
//		FileResource fr = new FileResource("/DUKE/src/ReadFileDukeCryp");
//		String message = fr.asString();
//		String encrypted = encrypt(message, key);
//		System.out.println("key is " + key + "\n" + encrypted);
//	}
	
	public static void main(String[] args) {
		CaesarCipher cc = new CaesarCipher();
		
		System.out.println(cc.encryptTwoKeys("At noon be in the conference room with your hat on for a surprise party. YELL LOUD!",8,21));
	}
}
