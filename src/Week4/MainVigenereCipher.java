package Week4;

import java.io.IOException;

import edu.duke.FileResource;

public class MainVigenereCipher {
public static void main(String[] args) {
	FileResource fr1 = new FileResource();
	String input = fr1.asString();
	VigenereBreaker vb = new VigenereBreaker();
	int[] keys = vb.tryKeyLength(input, 66, 'e');
	VigenereCipher vc = new VigenereCipher(keys);
	String decrypted= vc.decrypt(input);
	System.out.println(decrypted);
	
	
}
}
/*
66 24 516
66 6 516
66 6 516
66 18 516
66 23 516
66 1 516
66 1 516
66 1 516
66 1 516
66 14 516
66 8 516
66 8 516
66 8 516
66 7 516
66 19 516
66 8 516
66 3 516
66 8 516
66 2 516
66 1 516
66 1 516
66 1 516
66 1 516
66 3 516
66 6 516
66 19 516
66 1 516
66 12 516
66 1 516
66 0 516
66 19 516
66 8 516
66 0 516
66 18 516
66 19 516
66 4 516
66 1 516
66 2 516
66 8 516
66 8 516
66 8 516
66 1 516
66 1 516
66 2 516
66 19 516
66 4 516
66 4 516
66 2 516
66 1 516
66 2 516
66 1 516
66 18 516
66 4 516
66 1 516
66 21 516
66 1 516
66 24 516
66 18 516
66 1 516
66 1 516
66 2 516
66 4 516
66 1 516
66 2 516
66 18 516
66 2 516*/
