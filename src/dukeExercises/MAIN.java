package dukeExercises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MAIN {
	public static void main(String[] args) throws IOException {
		CaesarCipher cc = new CaesarCipher();
//		for (int i=1; i<=26; i++) {
//			for(int j=1; j<=26; j++) {
//		String teste = cc.encryptTwoKeys("Aal uttx hm aal Qtct Fhljha pl Wbdl. Pvxvxlx!", i, j);
//		String find = "the name of the java mascot is duke. woeoeee!";
//		System.out.println(teste);
//		for (int a=1; a<=26; a++) {
//			for(int b=1; b<=26; b++) {
//			String teste2 = cc.encryptTwoKeys(teste, a, b);
//			System.out.println(cc.encryptTwoKeys(teste, a, b));
//		   if(teste2.equalsIgnoreCase(teste)){
//			     System.out.println(a+","+b);
//			     System.out.println(i+ ","+j);
//				
//			      break;}}}
//		}}

////		System.out.println(
//		CaesarBreaker cb = new CaesarBreaker();
//		System.out.println(cc.encryptTwoKeys("Geometric computing research at duke", 17, 4));}}
//		

//		for (int i=1; i<=26; i++) {
//		for(int j=1; j<=26; j++) {
//		System.out.println(cc.encryptTwoKeys("Geometric computing research at duke", i, j));
//		System.out.println(i +","+j);
//		}}}}
		
		
//		cb.testDecrypt("wis qwps knzi yc pjoy yvj bwsr");
//		for (int i=1; i<=26; i++) {
//			for(int j=1; j<=26; j++) {
//	String teste = cc.encryptTwoKeys("Top ncmy qkff vi vguv vbg ycpx", i, j);
//		System.out.println(teste);
//		for (int a=1; a<=26; a++) {
//			for(int b=1; b<=26; b++) {
//		System.out.println(cc.encryptTwoKeys(teste, a, b));}}
//	}}}}

for (int i=1; i<=26; i++) {
	for(int j=1; j<=26; j++) {
String teste = cc.encryptTwoKeys("Aal uttx hm aal Qtct Fhljha pl Wbdl. Pvxvxlx!", i, j);
String find = "gthe name of the java mascot is duke. woeoeee!";
System.out.println(teste);
for (int a=1; a<=26; a++) {
	for(int b=1; b<=26; b++) {
	String teste2 = cc.encryptTwoKeys(teste, a, b);
	System.out.println(cc.encryptTwoKeys(teste, a, b));
   if(teste2.equalsIgnoreCase(teste)){
	     System.out.println(a+","+b);
	     System.out.println(i+ ","+j);
		
	      break;}}}
}}}}

//		
//		List<String> a = new ArrayList<String>();
//		FileReader fr = new FileReader(new File("C:\\Users\\Vanes\\eclipse-workspace\\ZDuke\\src\\exercise1"));
//		BufferedReader bf = new BufferedReader(fr);
//		String s;
//		if((bf.readLine())!=null) {
//		a.add(bf.readLine());
//		}
//		
//		
//		System.out.println(a.toString());
//		}
		//vyr pmoi amph xs fiex xli amrh
		
		
		
		
//		WordLengths exerc = new WordLengths();
//		int[] count = new int[656];
//		exerc.countWordLengths("C:\\Users\\Vanes\\eclipse-workspace\\ZDuke\\src\\exercise1", count);
	

