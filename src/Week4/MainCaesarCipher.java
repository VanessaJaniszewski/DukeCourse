package Week4;

import java.io.FileReader;

import edu.duke.FileResource;

public class MainCaesarCipher {

	public static void main(String[] args) {
		
		CaesarCipher cc = new CaesarCipher(2);
		FileResource fr = new FileResource();
		String name = fr.asString();
		String nameEncrypted = cc.encrypt(name);
		System.out.println(nameEncrypted);
		
		String nameDecrypted = cc.decrypt(nameEncrypted);
		System.out.println(nameDecrypted);
		

	}

}
