package POOCaesarCipher;

public class CaesarCipher {
	
	public CaesarCipher(int key) {
		this.key =key;
	};
	private int key;
	private String alphabet = "abcdefghijklmnopqrstuvwxyz";
	private String shiftedAlphabet;
	
	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public String getShifterAlphabet() {
		return shiftedAlphabet;
	}

	public void setShiftedAlphabet(String shiftedAlphabet) {
		this.shiftedAlphabet = shiftedAlphabet;
	}

	public String getAlphabet() {
		return alphabet;
	}




	public String encrypt(String input) {
		StringBuilder encrypted = new StringBuilder(input.toLowerCase());
		setShiftedAlphabet(alphabet.substring(key)+alphabet.substring(0, key));
		for(int i=0; i<encrypted.length(); i++) {
			char currChar = encrypted.charAt(i);
			//Character.toLowerCase(currChar);
			int idx = alphabet.indexOf(currChar);
			if (idx != -1) {
				char newChar = shiftedAlphabet.charAt(idx);
				encrypted.setCharAt(i, newChar);}}
		setShiftedAlphabet(encrypted.toString());
		return getShifterAlphabet();}
	


	public String decrypt(String input) {
		setKey(26-getKey());
		return encrypt(input);
	}		
		
}