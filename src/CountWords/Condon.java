package CountWords;

import java.util.HashMap;

public class Condon {
	
	public void Condon() {
		DNA = new HashMap<>();
	}
	
	private HashMap<String, Integer> DNA;
	
	
	
	

	public void buildCondonMap (int start, String dna) {
		DNA = new HashMap<>(dna.length());
	while (start< dna.length()-2) {
	String condon = dna.substring(start, start+3);
	if(!DNA.isEmpty()) {
		if(!DNA.containsKey(condon)) {
			DNA.put(condon, 1);
	}else {DNA.replace(condon, (DNA.get(condon)+1));};
		
	}else {
	DNA.put(condon, 1);
	}
	start= start+3;
	}
	DNA.entrySet().forEach(entry->
	System.out.println(entry.getKey()+" "+entry.getValue())
			);
	}

}
