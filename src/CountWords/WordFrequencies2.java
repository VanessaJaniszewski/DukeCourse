package CountWords;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencies2 {
	
	public WordFrequencies2( ) {

	
	}
	private Map<String, Integer> myWord;
	private Map<String, Integer> myWords;
	private ArrayList<Integer> order;
	private ArrayList<String> wProv;
	
	@SuppressWarnings("unlikely-arg-type")
	public void findUnique(String site) throws IOException {
		File fr = new File(site);
		FileReader frr = new FileReader(fr);
		BufferedReader bf = new BufferedReader(frr);
		
		myWords = new HashMap<>();
		myWord = new HashMap<>();
		order = new ArrayList<>();
		wProv = new ArrayList<>();
		myWords.clear();


		int counter = 0;
		String s;

		while( bf.readLine() != null) {  


		if ((s=bf.readLine())!=null) {
			for (String word: s.split(" ")) {
				counter++;
				wProv.add(word);}}
		System.out.println(wProv);

		
		
		
		
		for(int i=0; i< wProv.size();i++) {
		StringBuilder a = new StringBuilder(wProv.get(i).toLowerCase());
		if(!myWords.containsKey(a.toString())) {

				myWords.put(a.toString(), 1);	
			}else {
				myWords.put(a.toString(), myWords.get(a.toString())+1);
			}
		
		}

		myWords.entrySet().forEach(entry ->{
		if(entry.getValue().compareTo(myWords.get(entry.getKey()))>=1) {
			System.out.println(entry.getKey());
			myWord.put(entry.getKey(), entry.getValue());
		}}
		
				);
			}
	
				
		System.out.println("Number of unique words: "+myWords.size());
		 
		myWords.entrySet().forEach(entry -> {
		    System.out.println( entry.getKey() + " => " + entry.getValue());});
    }}



