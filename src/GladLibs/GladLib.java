package GladLibs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import POOCaesarCipher.CountWords;
import edu.duke.FileResource;
import edu.duke.URLResource;

public class GladLib {
		private ArrayList<String> adjectiveList;
		private ArrayList<String> nounList;
		private ArrayList<String> colorList;
		private ArrayList<String> countryList;
		private ArrayList<String> nameList;
		private ArrayList<String> animalList;
		private ArrayList<String> timeList;
		private ArrayList<String> verbList;
		private ArrayList<String> fruitList;
		private ArrayList<String> usedWords;
		
		private Random myRandom;
		Integer counter =0;
		
		private static String dataSourceURL = "http://dukelearntoprogram.com/course3/data";
		private static String dataSourceDirectory = "data";
		
		public GladLib(){
			initializeFromSource(dataSourceDirectory);
			myRandom = new Random();
		}
		
		public GladLib(String source){
			initializeFromSource(source);
			myRandom = new Random();
		}
		
		private void initializeFromSource(String source) {
			adjectiveList= readIt(source+"/adjective.txt");	
			nounList = readIt(source+"/noun.txt");
			colorList = readIt(source+"/color.txt");
			countryList = readIt(source+"/country.txt");
			nameList = readIt(source+"/name.txt");		
			animalList = readIt(source+"/animal.txt");
			timeList = readIt(source+"/timeframe.txt");	
			verbList = readIt(source+"/verb.txt");
			fruitList = readIt(source+"/fruit.txt");
			
		}
		
		private String randomFrom(ArrayList<String> source){
			int index = myRandom.nextInt(source.size());
			return source.get(index);
		}
		
		private String getSubstitute(String label) {
			if (label.equals("country")) {
				return randomFrom(countryList);
			}
			if (label.equals("color")){
				return randomFrom(colorList);
			}
			if (label.equals("noun")){
				return randomFrom(nounList);
			}
			if (label.equals("name")){
				return randomFrom(nameList);
			}
			if (label.equals("adjective")){
				return randomFrom(adjectiveList);
			}
			if (label.equals("animal")){
				return randomFrom(animalList);
			}
			if (label.equals("timeframe")){
				return randomFrom(timeList);
			}
			if (label.equals("verb")){
				return randomFrom(verbList);
			}
			if (label.equals("fruit")){
				return randomFrom(fruitList);
			}
			if (label.equals("number")){
				return ""+myRandom.nextInt(50)+5;
			}
			return "**UNKNOWN**";
		}
		
		private String processWord(String w){
			usedWords = new ArrayList<>();
			int first = w.indexOf("<");
			int last = w.indexOf(">",first);
			if (first == -1 || last == -1){
				return w;
			}
			String prefix = w.substring(0,first);
			String suffix = w.substring(last+1);
			String sub = "";
			int abort = 0;
			boolean recallWord = true;
			if(!usedWords.isEmpty()) {
				while(recallWord = true) {
			for (String check : usedWords) {
			 if((sub = getSubstitute(w.substring(first+1,last))).equalsIgnoreCase(check)){
				 abort++;
			 		}}
			 if (abort >= 0) {
				 recallWord = true;
			 }else if (abort ==0) {
				 recallWord = false;
			 }}}else {sub = getSubstitute(w.substring(first+1,last));
		usedWords.add((w.substring(first+1,last)));
		}return prefix+sub+suffix;
		
		}
		
		private void printOut(String s, int lineWidth){
			int charsWritten = 0;
			for(String w : s.split("\\s+")){
				if (charsWritten + w.length() > lineWidth){
					System.out.println();
					charsWritten = 0;
				}
				System.out.print(w+" ");
				charsWritten += w.length() + 1;
			}
		}
		
		private String fromTemplate(String source){
			String story = "";
			if (source.startsWith("http")) {
				URLResource resource = new URLResource(source);
				for(String word : resource.words()){
					story = story + processWord(word) + " ";
				}
			}
			else {
				FileResource resource = new FileResource(source);
				for(String word : resource.words()){
					story = story + processWord(word) + " ";
				}
			}
			return story;
		}
		
		private ArrayList<String> readIt(String source){
			ArrayList<String> list = new ArrayList<String>();
			if (source.startsWith("http")) {
				URLResource resource = new URLResource(source);
				for(String line : resource.lines()){
					list.add(line);
				}
			}
			else {
				FileResource resource = new FileResource(source);
				for(String line : resource.lines()){
					list.add(line);
				}
			}
			return list;
		}
		
		public void countReplaced(String name) throws IOException{
		    FileReader fr = new FileReader(name);
		    BufferedReader br = new BufferedReader(fr);
		    String s;
		    Integer count =0;
		    Integer countWords =0;
		while((s=br.readLine())!=null) {   
			for (char ch: s.toCharArray()){
			if (String.valueOf(ch).equals("<")) {
					count++;
		}}}
		
		System.out.println("\nNumber of replaced words: "+count);
		}
				
		public void makeStory(String name) throws IOException{
		    System.out.println("\n");
			String story = fromTemplate(name);
			printOut(story, 60);
			countReplaced(name);
		}
}


