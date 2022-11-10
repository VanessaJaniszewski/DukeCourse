package POOCaesarCipher;

import java.io.IOException;

public class MAIN {
	public static void main(String[] args) throws IOException {
		
	CaesarCipherTwo cc2 = new CaesarCipherTwo(26-17,26-4);
	CaesarCipher cc = new CaesarCipher(8);
//	String m = cc.encrypt("Can you imagine life WITHOUT the internet AND computers in your pocket?");
//	System.out.println(m);
	String m2 = cc2.encrypt("uybi gfqgykii jgziegv uigeixdiex smiizzin");
	System.out.println(m2);
	
	TestCaesarCipher tcc = new TestCaesarCipher();
	TestCaesarCipherTw tcc2 = new TestCaesarCipherTw();
	
//	tcc2.decyptALL("Uybi Gfqgykii Jgziegv Uigeixdiex Smiizzin");
	
	tcc.maxIndex();
	
	//	String e = cc2.encrypt("Duke Computer Science Department Overview");
//	System.out.println(e);
//	System.out.println(cc2.decrypt("Aal uttx hm aal Qtct Fhljha pl Wbdl. Pvxvxlx!"));
//	
//	cc2.encrypt("the name of the java mascot is duke. woeoeee!)
	
//	9 23
//	
//	System.out.println(cc2.decrypt("Hfs cpwewloj loks cd Hoto kyg Cyy."));
		
	
//		tcc2.decyptALL("Uybi Gfqgykii Jgziegv Uigeixdiex Smiizzin");
//		tcc2
//		cc2.simpleTests();
		
//		System.out.println(cc.encrypt("Vanessa e doidona"));
//		System.out.println(cc.decrypt("fkxocck o nysnyxk"));
		

	}

}
