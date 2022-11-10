package dukeExercises;
	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileReader;
	import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;

	public class CountNumberOfWords {
	   public static void main(String[] args) throws IOException {
//	   {
//	      File f1=new File("C:\\Users\\Vanes\\eclipse-workspace\\ZDuke\\src\\exercise1"); //Creation of File Descriptor for input file
//	      String[] words=null;    //Intialize the word Array
//	      Integer[] counts = new Integer[20];
//	      int wc=0;     //Intialize word count to zero
//	      FileReader fr = new FileReader(f1);    //Creation of File Reader object
//	      BufferedReader br = new BufferedReader(fr);    //Creation of BufferedReader object
//	      String s;
//	      if((s=br.readLine())!=null)    //Reading Content from the file
//	      {
//	         words=s.split(" ");   //Split the word using space
//	         wc=wc+words.length;   //increase the word count for each word
//	         {for(int i=0; i< words.length; i++) {
//	         counts[words[i].length()]=+1;
//	      }}}
//	     
//	      System.out.println("Number of words in the file:" +wc + counts.length + "aaaa");    //Print the word count
//	      for (int i=0; i<counts.length; i++) {
//	    	System.out.println("Number of letters: "+i+" counts: "+counts[i]+ "frequency: "+(100*(counts[i]/wc)));
//	      } fr.close();
//	   } 
//	   
//	
//	
//	}
	

		File f1=new File("C:\\Users\\Vanes\\eclipse-workspace\\ZDuke\\src\\exercise1"); //Creation of File Descriptor for input file
		String[] words=null;    //Intialize the word Array
		ArrayList<String> a;
		a = new ArrayList<>();		   
		HashMap<Integer, ArrayList<String>> wcounted = new HashMap<Integer,ArrayList<String>>();
		wcounted.put(0,a);
		Integer wc=0;     //Intialize word count to zero
		FileReader fr = new FileReader(f1);    //Creation of File Reader object
		BufferedReader br = new BufferedReader(fr);    //Creation of BufferedReader object
		String s;
		
		while( br.readLine() != null) {  
		if((s=br.readLine())!=null) {   //Reading Content from the file


			words=s.split(" ");   //Split the word using space
			wc=wc+words.length;   //increase the word count for each word	
			for(Integer i=1; i< words.length; i++) {
				//				         counts[words[i].length()] = counts[words[i].length()+1];
				if(wcounted.get(countLetter(words[i])) == null){
					a = new ArrayList<>();
					a.add(words[i]);
					wcounted.put(countLetter(words[i]), a);

				}else {
					wcounted.get(countLetter(words[i])).add(words[i]);}
			}
			
		
		}}




		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("Number of words in the file:" +wc);//Print the word count
		{ for (int k=1; k<=wc; k++) {
			if(wcounted.get(k)!=null) {
				System.out.println("Nº letters: "+(k)+ "counts: "+wcounted.get(k).size() +"freq: "
						+ ""+df.format(100*(wcounted.get(k).size())/wc)+"%"+ wcounted.get(k).toString());}
			//counts[k] = wcounted.get(k).size();
			
			
			fr.close();}}}


	public static Integer countLetter(String word) {
		word.toCharArray();
		Integer count =0;
		for (char c : word.toCharArray())
			if (Character.isAlphabetic(c)) {
				count++;
			}
		return count;}


}

