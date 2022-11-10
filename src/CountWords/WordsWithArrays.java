package CountWords;

import java.text.DecimalFormat;

import edu.duke.FileResource;
import edu.duke.StorageResource;

public class WordsWithArrays {
	
	StorageResource myWords;
	
	
	public WordsWithArrays() {
		myWords = new StorageResource();
	}
	
	public void readWords() {
		myWords.clear();
		FileResource resource = new FileResource();
		for (String word: resource.words()) {
			myWords.add(word.toLowerCase());	
			
		}
	}
	
	public boolean contains(String[] list, String word, int number) {
		for(int i=0; i<number; i++) {
			if(list[i].endsWith(word)) {
				return true;
			}
		}return false;
	}
	
	public int numberOfUniqueWords() {
		int numStored =0;
		String[] words = new String[myWords.size()];
		for (String s: myWords.data()) {
			if(!contains(words,s, numStored)) {
				words[numStored] =s;
				numStored++;
			}
		}return numStored;
	}
	
	public void tester() {
		DecimalFormat df = new DecimalFormat("###,###.##");
		readWords();
		System.out.println("Numb of words read: "+myWords.size());
		int unique = numberOfUniqueWords();
		Double freq =  ((double)unique/(double)myWords.size());
		System.out.println("Total words: "+ myWords.size());
		
		System.out.println("Numb of unique words: "+unique);
		System.out.println("Unique representes: "+df.format(freq)+"%");

		}
		
		
	}
