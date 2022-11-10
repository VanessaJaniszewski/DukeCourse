package POOCaesarCipher;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;

public class TestCaesarCipherTw {

	 
	
	
	public void simpleTests() throws IOException {
		CaesarCipherTwo cc = new CaesarCipherTwo(9,23);
		String file = "C:\\Users\\Vanes\\eclipse-workspace\\ZDuke\\src\\exercise1";
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		StringBuilder sb = new StringBuilder();
		boolean cont = true;
		while(cont) {
			String a=br.readLine();
			if(a!= null){
			sb.append(a);
			br.readLine();
			String print;
			String print2;
			print =cc.encrypt(sb.toString());
			System.out.println(print);
			print2 = cc.decrypt(print);
			System.out.println(print2);
			System.out.println("Decrypt: Key1: "+(cc.getKey1())+" Key2: "+(cc.getKey2()));
			}else { 
			System.out.println("End");
			break;
	}}}
		 
		 
	 
	
	 
		public void maxIndex() throws IOException {
			String file = "C:\\Users\\Vanes\\eclipse-workspace\\ZDuke\\src\\exercise1";
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
				String[] words=null;    //Intialize the word Array
				ArrayList<String> a;
				a = new ArrayList<>();		   
				HashMap<Integer, ArrayList<String>> wcounted = new HashMap<Integer,ArrayList<String>>();
				wcounted.put(0,a);
				Integer wc=0;     //Intialize word count to zero
				String s;
				while( br.readLine() != null) {  
				if((s=br.readLine())!=null) {   //Reading Content from the file
					words=s.split(" ");   //Split the word using space
					wc=wc+words.length;   //increase the word count for each word	
					for(Integer i=1; i< words.length; i++) {
						//				         counts[words[i].length()] = counts[words[i].length()+1];
						if(wcounted.get(countLetters(words[i])) == null){
							a = new ArrayList<>();
							a.add(words[i]);
							wcounted.put(countLetters(words[i]), a);
						}else {
							wcounted.get(countLetters(words[i])).add(words[i]);}}}}
				DecimalFormat df = new DecimalFormat("0.00");
				System.out.println("Number of words in the file:" +wc);//Print the word count
				{ for (int k=1; k<=wc; k++) {
					if(wcounted.get(k)!=null) {
						System.out.println("Nº letters: "+(k)+ "counts: "+wcounted.get(k).size() +"freq: "
								+ ""+df.format(100*(wcounted.get(k).size())/wc)+"%"+ wcounted.get(k).toString());}
					//counts[k] = wcounted.get(k).size();
					fr.close();}}}
		
		
		public static Integer countLetters(String word) {
			word.toCharArray();
			Integer count =0;
			for (char c : word.toCharArray())
				if (Character.isAlphabetic(c)) {
					count++;}
			return count;}
	

public void decyptALL(String input) {
	CaesarCipherTwo cc2;
for(int i =1; i<=26; i++) {
	for(int j=1; j<=26; j++) {
		cc2 = new CaesarCipherTwo(i, j);
		System.out.println(i+" "+j);
String teste=cc2.decrypt(input);
System.out.println(teste);
String find = "the name of the java mascot is duke. woeoeee!";
       if(teste.equalsIgnoreCase(find)) {
    	   System.out.println("Keys: "+ i+" "+j);
    	   System.out.println("Shifted key: "+(26-i)+" "+(26-j));
    	   break;
       }}
       }
	}}
