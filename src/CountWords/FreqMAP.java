package CountWords;

import java.util.HashMap;

import edu.duke.FileResource;

public class FreqMAP {

	
	public void countWords() {
		FileResource fr = new FileResource();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int total =0;
		for(String s: fr.words()) {
			s = s.toLowerCase();
			if(map.keySet().contains(s)) {
				map.put(s, map.get(s)+1);
			}else {
				map.put(s, 1);
			}
			total +=1;
		}
		System.out.println("Total: "+total);
		for(String s: map.keySet()) {
			int ocurrences = map.get(s);
			if(ocurrences>500) {
				System.out.println(ocurrences+"\t"+s);
			}
		}
	}
}
