package Week3;

import java.util.Date;

public class Tester {
	
	    public void testLogEntry() {
	        LogEntry le = new LogEntry("1.2.3.4", new Date(), "example request", 200, 500);
	        System.out.println(le);
	        LogEntry le2 = new LogEntry("1.2.100.4", new Date(), "example request 2", 300, 400);
	        System.out.println(le2);
	    }
	    
	    public void testLogAnalyzer() {
	        // complete method
	    	LogAnalyzer la = new LogAnalyzer();
	    	la.readFile("C:\\Users\\Vanes\\eclipse-workspace\\ZDuke\\src\\short-teste_log");
	    	la.printAll();
	    }
	    
	    public void testUniqIP() {
	    	LogAnalyzer la = new LogAnalyzer();
	    	la.readFile("C:\\Users\\Vanes\\eclipse-workspace\\ZDuke\\src\\short-teste_log");
//	    	int uniqueIPs = la.countUniqueIPs();
	    	int visitss = la.uniqueIPVisitsOnDay("Mar 17");
	    	System.out.println("There are "+ visitss +" on that day");
	    
	    	int range = la.countUniqueIPsInRange(200,299);
	    	System.out.println("There are: "+range+" IPs is in the range of your code input");
	    }
}
