package Week4;

import edu.duke.FileResource;

public class MainCaesarCracker {
	
	public static void main(String[] args) {
		
		CaesarCracker cc = new CaesarCracker();
		FileResource fr = new FileResource();
		String name = fr.asString();
		System.out.println(name);
		int key = cc.getKey(name);
		String decrypt = cc.decrypt(name);
		System.out.println(key);
		System.out.println(decrypt);
		System.out.println(cc.mostCommon);
		
		
	}

}
