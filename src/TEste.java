import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;

import javax.security.auth.Subject;

public class TEste {
	
		   public static void main(String[] args) throws IOException 
		   {
		      File f1=new File("C:\\Users\\Vanes\\eclipse-workspace\\DUKE\\ReadFileDukeCryp"); //Creation of File Descriptor for input file
		      String[] words=null;    //Intialize the word Array
		      ArrayList<String> a;
		      a = new ArrayList<>();		   
		      HashMap<Integer, ArrayList<String>> wcounted = new HashMap<Integer,ArrayList<String>>();
		      wcounted.put(0,a);
		      Integer wc=0;     //Intialize word count to zero
		      FileReader fr = new FileReader(f1);    //Creation of File Reader object
		      BufferedReader br = new BufferedReader(fr);    //Creation of BufferedReader object
		      String s;
		      if((s=br.readLine())!=null) {   //Reading Content from the file
  
		    	  
		         words=s.split(" ");   //Split the word using space
		         wc=wc+words.length;   //increase the word count for each word	
		         {for(Integer i=1; i< words.length; i++) { //		         counts[words[i].length()] = counts[words[i].length()+1];
		        	 	
		         		char[] ch = new char[words[i].length()];
		         		ch = words[i].toCharArray();
		         		String.copyValueOf(ch);
		         		int count =0;
		         		for (char c : ch) {
							if(!Character.isLetter(c)) {
							count++;}
		         	if(wcounted.get(words[i].length()) == null){
		         		 a = new ArrayList<>();
		         		 a.add(words[i]);
				         wcounted.put(words[i].length()-count, a);
						}else {
		         wcounted.get(words[i].length()-count).add(words[i]);
							}
		         	}
		         		
		         
		      }
		      
		         
		    DecimalFormat df = new DecimalFormat("0.00");
		      System.out.println("Number of words in the file:" +wc);//Print the word count
		      { for (int k=1; k<=wc; k++) {
		    	  if(wcounted.get(k)!=null) {
		    	System.out.println("Nº letters: "+(k)+ "counts: "+wcounted.get(k).size() +"freq: "
		    			+ ""+df.format(100*(wcounted.get(k).size())/wc)+"%"+ wcounted.get(k).toString());
		      } fr.close();
		   } 
}}}}}
		      
