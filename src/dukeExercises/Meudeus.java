package dukeExercises;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Meudeus {
	
		   public static void main(String[] args) throws IOException 
		   {
		      File f1=new File("C:\\Users\\Vanes\\eclipse-workspace\\DUKE\\ReadFileDukeCryp"); //Creation of File Descriptor for input file
		      String[] words=null;    //Intialize the word Array
		      Integer[] counts = new Integer[20];
		      int wc=0;     //Intialize word count to zero
		      FileReader fr = new FileReader(f1);    //Creation of File Reader object
		      BufferedReader br = new BufferedReader(fr);    //Creation of BufferedReader object
		      String s;
		      if((s=br.readLine())!=null)    //Reading Content from the file
		      {
		         words=s.split(" ");   //Split the word using space
		         wc=wc+words.length;   //increase the word count for each word
		         {for(int i=0; i< words.length; i++) {
		         counts[words[i].length()]=+1;
		      }}}
		     
		      System.out.println("Number:" +wc + counts.length + "aaaa");    //Print the word count
		      for (int i=0; i<counts.length; i++) {
		    	System.out.println("Number of letters: "+i+" counts: "+counts[i]+ "frequency: "+(100*(counts[i]/wc)));
		      } fr.close();
		   } 

	}
