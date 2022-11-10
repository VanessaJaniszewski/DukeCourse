package CountWords;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;

public class WordsInFile {
	
	public void WordsInFile() {
		map = new ArrayList<>();
	}
	
	private HashMap <String, ArrayList<String>> myFullmap;  
	private ArrayList<String> map;
	private ArrayList<String> wProv;
	StringBuilder sb; 

	private ArrayList<String> addWordsFromFile(File f) throws IOException {
		FileReader fr = new FileReader(f);
		BufferedReader bf = new BufferedReader(fr);
		map = new ArrayList<>();
		wProv = new ArrayList<>();
		wProv.clear();
		map.clear();
		String s;
		while( (s=bf.readLine()) != null) {  
			for (String word: s.split(" ")) {	
				wProv.add(word);}
		for(int i=0; i< wProv.size();i++) {
		StringBuilder a = new StringBuilder(wProv.get(i).toLowerCase());
		if(!map.contains(a.toString())) {
			map.add(a.toString());
			}else {
				continue;
			}
		a.setLength(0);
			
		}}
		return map;
	}
	
	
	public void buildWordsFileMap() throws IOException {
		myFullmap = new HashMap<>();
		myFullmap.clear();
		sb= new StringBuilder();
		String f1 = "C:\\Users\\Vanes\\eclipse-workspace\\ZDuke\\src\\f1";
		String f2 = "C:\\Users\\Vanes\\eclipse-workspace\\ZDuke\\src\\f2";
		String f3 = "C:\\Users\\Vanes\\eclipse-workspace\\ZDuke\\src\\f3";
		String f4 = "C:\\Users\\Vanes\\eclipse-workspace\\ZDuke\\src\\f4";
		String f5 = "C:\\Users\\Vanes\\eclipse-workspace\\ZDuke\\src\\f5";
		
		File file1 = new File(f1);
		File file2 = new File(f2);
		File file3 = new File(f3);
		File file4 = new File(f4);
		File file5 = new File(f5);
		myFullmap.put(f1, addWordsFromFile(file1));
		myFullmap.put(f2, addWordsFromFile(file2));
		myFullmap.put(f3, addWordsFromFile(file3));
		myFullmap.put(f4, addWordsFromFile(file4));
		myFullmap.put(f5, addWordsFromFile(file5));
		BufferedReader br1 = new BufferedReader(new FileReader(file1));
		BufferedReader br2 = new BufferedReader(new FileReader(file2));
		BufferedReader br3 = new BufferedReader(new FileReader(file3));
		BufferedReader br4 = new BufferedReader(new FileReader(file4));
		BufferedReader br5 = new BufferedReader(new FileReader(file5));
		String s1 = br1.readLine();
		sb.append(s1);
		String s2 = br2.readLine();
		sb.append(s2);
		String s3 = br3.readLine();
		sb.append(s3);
		String s4 = br4.readLine();
		sb.append(s4);
		String s5 = br5.readLine();
		sb.append(s5);
		System.out.println(sb.toString());
		
	
	
	}
	
//	public void maxNumber() throws IOException {
//		buildWordsFileMap();	
//		myFullmap.entrySet().forEach(entry->{
//			System.out.println(entry.getValue());
//			sb.append(entry.getValue());
//			System.out.println(sb.toString());
//			
//			try {
//				wf.findUnique(sb.toString());
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		});
//	}
public void createFile(String filesName) throws IOException {
		      File myObj = new File("C:\\Users\\Vanes\\eclipse-workspace\\ZDuke\\src\\"+filesName);
		      myObj.createNewFile();
		     
		  }

public void writeInFile(String filesName, String name) throws IOException {
	try (Writer writer = new BufferedWriter(new FileWriter(filesName))) {
	    writer.write(name);
	} catch (IOException e) {
	    e.printStackTrace();
	}
}

		
}
