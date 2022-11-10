package Week4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import edu.duke.FileResource;

public class VigenereBreaker {
	public String sliceString(String message, int whichSlice, int totalSlices) {
		ArrayList<String>slice =  new ArrayList<String>();
		for(int i=whichSlice; i<message.length(); i=i+(totalSlices)) {
        slice.add(message.substring(i,i+1));
		}
        return slice.toString();
    }

    public int[] tryKeyLength(String encrypted, int klength, char mostCommon) {
        int[] key = new int[klength];
        CaesarCracker cc = new CaesarCracker(mostCommon);
        
        for (int i =0; i< klength; i++) {
        String slice = sliceString(encrypted, i , klength);
        int k = cc.getKey(slice);
        key[i]=k;
        }
        return key;
    }
    
    public HashSet<String> readDictionary(FileResource fr) {
    	HashSet<String> hs = new HashSet<String>();
    	for( String word: fr.lines()) {
    	hs.add(word.toLowerCase());}
    	return hs;
    }
    
    public int countWords(String message, HashSet<String> dictionary) {
    int realWords =0;
    for(String word: message.split("\\W+")){
    if(dictionary.contains(word.toLowerCase())) {
    	realWords++;}}
    return realWords;
    }
    
    public void breakForLanguage(String encrypted, HashSet<String> dictionary) throws IOException {
    	int[] key;
    	ArrayList<Integer> max = new ArrayList<Integer>();
    	for(int i=0; i<=100; i++) {
    		key = new int[i];
    		key = tryKeyLength(encrypted, i, mostComonCharIn(dictionary));
    		VigenereCipher vc = new VigenereCipher(key);
    		String decrypted = vc.decrypt(encrypted);
    		int words = countWords(decrypted, dictionary);
    		if(String.valueOf(countWords(encrypted, dictionary)).equals("516")) {
    			System.out.println(i+" "+key[i]);}
    		max.add(words);
    		FileWriter fw = new FileWriter(new File("C:\\Users\\Vanes\\eclipse-workspace\\ZDuke\\src\\Week4\\WriteHere"));
    		for(int f =0; f<key.length;f++) {
    		System.out.println(i+" "+key[f]+" "+words);
    			}
    		fw.close();
    		}
    			
    		}
    	
//    	int result =0;
//    	for (Integer integer : max) {
//			if(integer>result) {
//				result = integer;
//			}}
//    	System.out.println(result);
//    }

    public void breakVigenere () {
        FileResource dic = new FileResource();
        FileResource input = new FileResource();
        String encrypted = input.asString();
        char a = mostComonCharIn(readDictionary(dic));
        for(int var=0; var<100; var++) {
        int[] k = tryKeyLength(input.asString(), var, a);}
//        for(int i=0; i< k)
//        int[] key = new int[k];
//        HashSet<String> dictionary = new HashSet<String>();
//        dictionary = readDictionary(dic);
//        breakForLanguage(encrypted, dictionary);
        }
    
    public char mostComonCharIn(HashSet<String> dictionary) {
    	HashMap<String, Integer> alphabetCount = new HashMap<String, Integer>();
    	
    	String alphabet = "abcdefghijklmnopqrstuvwxyz";
    	for(int i=0; i<alphabet.length();i++) {
    		alphabetCount.put(alphabet.substring(i, i+1),0);
    	}
    	System.out.println(dictionary.toString());
    	for(String s: dictionary) {
    		for(int k=0; k<s.length();k++) {
    			String letter = s.substring(k, k+1);
//    			System.out.println(letter);
    			if(alphabetCount.containsKey(letter)) {
    				alphabetCount.replace(letter, alphabetCount.get(letter)+1);
    				}
    			}
    		}
    	char ans;
    	String answer;
    	Integer bigAnswer =0;
    	Integer index=0;
    	Integer[] biggest = new Integer[26];
    	for(int i=0; i<alphabet.length(); i++) {
    		biggest[i]=alphabetCount.get(alphabet.substring(i,i+1));
//    		System.out.println("AQUIIIIIIIIIIIIIII "+alphabetCount.get(alphabet.substring(i,i+1)));
//    		System.out.println("AQUIIIIIIIIIIIIIII "+alphabet.substring(i,i+1));
//    		System.out.println("AQUIIIIIIIIIIIIIII "+alphabetCount.get("a"));
    	}
    	for(int k=1; k<biggest.length;k++) {
    		if(biggest[k]>bigAnswer) {
    			bigAnswer = biggest[k];
    		}
    	}
    	for(int q=0; q<biggest.length;q++) {
    		if(biggest[q]==bigAnswer) {
    			index = q;}}
    	answer = alphabet.substring(index, index+1);
    	ans = answer.charAt(0);	
    	return ans;
    	}
    	
    
    public void breakForAllLangss(String encrypted ) {
//    	FileResource fr = new FileResource();
//    	encrypted = fr.asString();
    	HashMap<String, HashSet<String>> language = new HashMap<String, HashSet<String>>();
    	String[] languages = new String [] {"Danish", "Dutch", "English", "French", "German", "Italian", "Portuguese", "Spanish"};
    	for (String string : languages) {
    		System.out.println(string);
    	language.put(string, readDictionary(new FileResource()));
    	}
    	
    	language.keySet().forEach(entry->{
    		countWords(encrypted, language.get(entry));
    		System.out.println(entry+" "+countWords(encrypted, language.get(entry)));
    	});
    }
    
    
    	}
    	
    
    
//  public void breakVigenere () {
//  FileResource fr = new FileResource();
//  String encrypted = fr.asString();
//  int k = 4;
//  char a = 'e';
//  int[] key = new int[k];
//  key = tryKeyLength(encrypted, k, a);
//  VigenereCipher vc = new VigenereCipher(key);
//  String out= vc.decrypt(encrypted);
//  System.out.println(out);
//  for (int i=0; i< k; i++) {
//		System.out.println(key[i]);}
//  }


