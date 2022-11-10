package POOCaesarCipher;

public class CaesarCipherTwo {
	
	public  CaesarCipherTwo(int key1, int key2) {
		this.key1 = key1;
		this.key2 = key2;
	}
	
	private int key1;
	private int key2;
	private String alphabet = "abcdefghijklmnopqrstuvwxyz";; 
	private String shiftedAlphabet1;
	private String shiftedAlphabet2;
	
	public int getKey1() {
		return key1;
	}
	public int getKey2() {
		return key2;
	}

	public String getShiftedAlphabet1() {
		return shiftedAlphabet1;
	}
	public void setShiftedAlphabet1(String shiftedAlphabet1) {
		this.shiftedAlphabet1 = shiftedAlphabet1;
	}
	public String getShiftedAlphabet2() {
		return shiftedAlphabet2;
	}
	public void setShiftedAlphabet2(String shiftedAlphabet2) {
		this.shiftedAlphabet2 = shiftedAlphabet2;
	}
	public String getAlphabet() {
		return alphabet;
	}

		public String encrypt(String input) {
			CaesarCipher cc1 = new CaesarCipher(this.key1);
			CaesarCipher cc2 = new CaesarCipher(this.key2);
			String one = cc1.encrypt(input);
			String two = cc2.encrypt(input);
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
	
		
		
		public String decrypt(String input) {
			CaesarCipherTwo cc = new CaesarCipherTwo(26-this.key1,26-this.key2);
			String result = cc.encrypt(input);
			return result+"\nKey1: "+(Math.abs(26-getKey1()))+" Key2: "+(Math.abs(26-getKey2()));	
		}
		
		public static Integer countLetters(String word) {
			word.toCharArray();
			Integer count =0;
			for (char c : word.toCharArray())
				if (Character.isAlphabetic(c)) {
					count++;}
			return count;}
	}

	


//
//public String decrypt(String input) {
//	CaesarCipherTwo cc2 = new CaesarCipherTwo(26-key1, 26-key2);
//	String resultkey ="";
//	StringBuilder result = new StringBuilder();
//	for (int i=1; i<=26; i++) {
//	for(int j=1; j<=26; j++) {
//String teste = cc2.encrypt(input);
//for (int a=1; a<=26; a++) {
//	for(int b=1; b<=26; b++) {
//		key1=a;
//		key2=b;
//	String teste2 = cc2.encrypt(teste);
//   if(teste2.equalsIgnoreCase(teste)){
//		result.append(cc2.encrypt(teste));
//	     resultkey = i+"."+j;}}}
//}}
//return result+"\n"+resultkey;	
//}
//}
