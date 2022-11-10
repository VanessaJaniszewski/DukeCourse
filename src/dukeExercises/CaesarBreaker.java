package dukeExercises;

import java.util.ArrayList;
import java.util.List;

public class CaesarBreaker {
		
		
		public void decript(String encrypted) {
			CaesarCipher cc = new CaesarCipher();
			StringBuilder sb = new StringBuilder();
		for (int i=1; i<=26; i++) {
			for(int j=1; j<=26; j++) {
			List<String> sentence = new ArrayList<>();
			   sentence.add(cc.encryptTwoKeys(encrypted, i, j));
			   System.out.println(sentence);
//			
			}}};
		
		
		
//		public void decript(String encrypted) {
//			CaesarCipher cc = new CaesarCipher();
//			StringBuilder sb = new StringBuilder();
//		for (int i=1; i<=26; i++) {
//			for(int j=1; j<=26; j++) {
//			List<String> sentence = new ArrayList<>();
//			   sentence.add(cc.encryptTwoKeys(encrypted, 26-j, 26-i));
//			   System.out.println(sentence);
//			
//			}}
//			
//			}
				
		
//	public void decript(String encrypted) {
//		StringBuilder sb = new StringBuilder();
//		char[] answer = new char[encrypted.length()];
//		for (int k = 0; k< encrypted.length() ; k++) {
//			if(k==0 || k%2==0) {
//		     answer[k]= encrypted.charAt(2);}
//			else {
//				answer[k]= encrypted.charAt(20);
//			}
//			System.out.println(answer[k]);
//		     
//	}}
	
		
		public void testDecrypt(String encrypted) {
			CaesarCipher cc = new CaesarCipher();
			for(int i=0; i<=26; i++) {
			cc.encrypt(encrypted, 26-i);
			System.out.println(cc.encrypt(encrypted, 26-i));}
			
		}
		
	}


