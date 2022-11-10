package dukeExercises;

public class WordPlay {

	
		
	public void vowelOrNot(String word){
        char[] workable = new char[word.length()];
        workable = word.toLowerCase().toCharArray();
        for(int i=0; i<word.length(); i++){
          if (
          workable[i] == 'a' || 
          workable[i] =='e' || 
          workable[i] =='i' || 
          workable[i] =='o' || 
          workable[i] =='u'){
              System.out.println(workable[i]+" is a vowel");
                
       }else {
           System.out.println(workable[i]+" is NOT a vowel");
       }
    }
}
	public boolean isVowel(char ch) {
		boolean vowel = false;
		String chString = null;
		chString= chString.valueOf(ch);
		if (chString.toLowerCase().equals("a") ||
				chString.toLowerCase().equals("e") ||
				chString.toLowerCase().equals("i") ||
				chString.toLowerCase().equals("o") ||
				chString.toLowerCase().equals("u")) {
			vowel = true;
		}
		return vowel;
	}
	
	public String replaceVowel(String phrase, char ch) {
		String phrase2;
		char[] newPhrase = new char[phrase.length()];
		for (int i =0; i< phrase.length(); i++) {
		if(isVowel(phrase.toCharArray()[i])){
			newPhrase[i] = ch;
		}else {
			newPhrase[i] = phrase.toCharArray()[i];
		}
		}
		phrase2 = new String(newPhrase);
		return phrase2;
	}
	
	public String emphasize(String phrase, char ch) {
		char[] phrase1 = new char[phrase.length()];
		char[] phrase2 = new char[phrase.length()];
		for(int i =0; i<phrase.length();i++) {
			phrase1[i] = phrase.toCharArray()[i];
		}
		for (int i =0; i<phrase.length();i++) {
		String b = String.valueOf(phrase1[i]);
		String c = String.valueOf(ch);
			if (b.equals(c)) {
				if (i==0 || i%2==0) {
					phrase2[i]= '*';
				}else {
					phrase2[i]= '+';
				}
			
		}else {
			phrase2[i]=phrase1[i];	
	}}
		
		return new String(phrase2);
	}
	
	public static void main(String[] args) {	
		
		WordPlay new1 = new WordPlay();
		
		System.out.println(
		new1.replaceVowel("ConseguIIIII", '#'));
		System.out.println(new1.emphasize("dna ctgaaactga", 'a'));
	
	}
}

