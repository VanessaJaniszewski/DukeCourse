package Week3;

import java.util.HashMap;

public class CountTester {
	
	public void testCounts() {
		LogAnalyzer la = new LogAnalyzer();
		la.readFile("C:\\Users\\Vanes\\eclipse-workspace\\ZDuke\\src\\short-teste_log");
		HashMap<String,Integer>counts = la.countVisitsPerIP();
			System.out.println("The IPs are: "+counts);
			System.out.println("Total different IPs: "+counts.size());
			
	}
	
	public void testCountOrdered() {
		LogAnalyzer la = new LogAnalyzer();
		la.readFile("C:\\Users\\Vanes\\eclipse-workspace\\ZDuke\\src\\short-teste_log");
		la.mostNumberVisitsByIp();
		System.out.println(la.countUniqueIPs());
	
	}
	
	
	public void comparedays() {
		LogAnalyzer la1 = new LogAnalyzer();
		LogAnalyzer la2 = new LogAnalyzer();
		LogAnalyzer la3 = new LogAnalyzer();
		LogAnalyzer la4 = new LogAnalyzer();
		LogAnalyzer la5 = new LogAnalyzer();
		la1.readFile("C:\\Users\\Vanes\\eclipse-workspace\\ZDuke\\src\\short-teste_log");
		la2.readFile("C:\\Users\\Vanes\\eclipse-workspace\\ZDuke\\src\\short-teste_log");
		la3.readFile("C:\\Users\\Vanes\\eclipse-workspace\\ZDuke\\src\\short-teste_log");
		la4.readFile("C:\\Users\\Vanes\\eclipse-workspace\\ZDuke\\src\\short-teste_log");
		la5.readFile("C:\\Users\\Vanes\\eclipse-workspace\\ZDuke\\src\\short-teste_log");
		System.out.println("24: "+la1.IPVisitsOnDayMost("set. 24"));
		System.out.println("26: "+la2.IPVisitsOnDayMost("set. 26"));
		System.out.println("28: "+la3.IPVisitsOnDayMost("set. 28"));
		System.out.println("30: "+la4.IPVisitsOnDayMost("set. 30"));

	}
	
	
	
	public void comparedayIP() {
		LogAnalyzer la1 = new LogAnalyzer();
		la1.readFile("C:\\Users\\Vanes\\eclipse-workspace\\ZDuke\\src\\short-teste_log");
		HashMap <String,Integer> aaa = new HashMap<String,Integer>(la1.IPVisitsOnDayMost("sep. 24"));
		System.out.println(aaa.toString());
		la1.special(aaa);

	}
	
	public void question5() {
		LogAnalyzer la = new LogAnalyzer();
		la.readFile("C:\\Users\\Vanes\\eclipse-workspace\\ZDuke\\src\\short-teste_log");
		System.out.println(la.uniqueIPVisitsOnDay("sep. 27"));

	}
	
	public void question6() {
		LogAnalyzer la = new LogAnalyzer();
		la.readFile("C:\\Users\\Vanes\\eclipse-workspace\\ZDuke\\src\\short-teste_log");
		System.out.println(la.countUniqueIPsInRange(200, 299));

	}
	
	
	

}
