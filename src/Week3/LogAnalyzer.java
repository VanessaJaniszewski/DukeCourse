package Week3;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import edu.duke.FileResource;

public class LogAnalyzer {
	  private ArrayList<LogEntry> records;
	     
	     public LogAnalyzer() {
	    	 records = new ArrayList<LogEntry>();
	         // complete constructor
	     }
	        
	     @SuppressWarnings("static-access")
		public void readFile(String filename) {
	         // complete method
	    	 FileResource fr = new FileResource(filename);
	    	 WebLogParser wlp = new WebLogParser();
	    	 
	    	 for(String line: fr.lines()) {
	    		LogEntry le = wlp.parseEntry(line);
	    		records.add(le);
	    	 }
	     }
	       
	    public HashMap<String, Integer> countVisitsPerIP(){
	    	HashMap<String, Integer> counts = new HashMap<String, Integer>();
	    	for(LogEntry le: records) {
	    		String ip = le.getIpAddress();
	    		if(!counts.containsKey(ip)) {
	    			counts.put(ip, 1);
	    		}else {
	    			counts.replace(ip, counts.get(ip)+1);
	    		}
	    	}
	    	return counts;
	    }
	     
	     public void printAll() {
	         for (LogEntry le : records) {
	             System.out.println(le);
	         }
	     }
	     
	     public int countUniqueIPs() {
	     ArrayList<String> uniqueIPs = new ArrayList<String>();
	 	for(LogEntry le: records) {
	 		String ipAddr = le.getIpAddress();
	 		if(!uniqueIPs.contains(ipAddr)) {
	 			uniqueIPs.add(ipAddr);
	 		}
	 		}
	 	return uniqueIPs.size();
	 	}
	     
	     public int uniqueIPVisitsOnDay(String someday) {
	    	 ArrayList<String> dayVisit = new ArrayList<String>();
	    	 SimpleDateFormat df = new SimpleDateFormat("MMM dd");
	    	for(LogEntry le:records) {
	    		String dayVis = df.format(le.getAccessTime()).toString();
	    		if(!dayVisit.contains(dayVis)) {
	    			dayVisit.add(dayVis);
	    	 }}
	    	return dayVisit.size();
	     }
	     
	     
		public int IPVisitsOnDay(String someday) {
	    	 ArrayList<String> dayVisit = new ArrayList<String>();
	    	 SimpleDateFormat df = new SimpleDateFormat("MMM dd");
	    	for(LogEntry le:records) {
	    		
	    		String dayVis = df.format(le.getAccessTime()).toString();
//	    		someday = df.format(someday);
	    			if((dayVis.toString()).equals(someday)){
	    				dayVisit.add(dayVis);
	    			}}
	    	return dayVisit.size();
	     }
		
		
		public HashMap<String,Integer> IPVisitsOnDayMost(String someday) {
	    	 HashMap<String,Integer> dayVisit = new HashMap<String,Integer>();
	    	 SimpleDateFormat df = new SimpleDateFormat("MMM dd");
	    	for(LogEntry le:records) {
	    		
	    		String dayVis = df.format(le.getAccessTime()).toString();
//	    		someday = df.format(someday);
	    			if((dayVis.toString()).equals(someday)){
	    				if(!dayVisit.containsKey(le.getIpAddress())) {
	    				dayVisit.put(le.getIpAddress(), 1);
	    				}else {
	    					dayVisit.replace(le.getIpAddress(), dayVisit.get(le.getIpAddress())+1);
	    				}
	    			}}
	    	return dayVisit;
	     }

	     
	     
	     
	     
	     
	     public int countUniqueIPsInRange(int low, int high) {
		     ArrayList<String> uniqueIPs = new ArrayList<String>();
		 	for(LogEntry le: records) {
		 		int  code = le.getStatusCode();	
		 		String ipAddr = le.getIpAddress();	
		 		if(code>=low && code<=high) {
		 		if(!uniqueIPs.contains(ipAddr)) {
		 			uniqueIPs.add(ipAddr);
		 		}}
		 		}
		 	return uniqueIPs.size();
		 	}
	    
	  public void mostNumberVisitsByIp() {
		  HashMap<String, Integer> counts = new HashMap<String, Integer>();
		    	for(LogEntry le: records) {
		    		String ip = le.getIpAddress();
		    		if(!counts.containsKey(ip)) {
		    			counts.put(ip, 1);
		    		}else {
		    			counts.replace(ip, counts.get(ip)+1);}}
		 List<Integer> countList = new ArrayList<Integer>();		  
		 List<Integer> listOrdered = new ArrayList<Integer>();	
		  counts.entrySet().forEach(entry->{
				  countList.add(entry.getValue());});
				  
				  for (int i =999; i>=0; i--) {
					  for (Integer integer : countList) {
					if (integer >i) {
						if(!listOrdered.contains(integer)) {
						listOrdered.add(integer);				
					}}}}
		for (Integer integer : listOrdered) {
			  counts.entrySet().forEach(entry->{
				  if(entry.getValue() == integer) {
				        System.out.println("The key for value " + integer + " is " + entry.getKey());}
			  });}}
	  
	  
	  public void special(HashMap<String, Integer> counts) {
		  List<Integer> listOrdered = new ArrayList<Integer>();	
		  List<Integer> countList = new ArrayList<Integer>();{	
		   counts = new HashMap<String, Integer>();
		   counts.entrySet().forEach(entry->{
			   countList.add(entry.getValue());
		   });
		 
		  counts.entrySet().forEach(entry->{
				  countList.add(entry.getValue());});
				  
				  for (int i =999; i>=0; i--) {
					  for (Integer integer : countList) {
					if (integer >i) {
						if(!listOrdered.contains(integer)) {
						listOrdered.add(integer);				
					}}}}}
				  
		for (Integer integer : listOrdered) {
			  counts.entrySet().forEach(entry->{
				  if(entry.getValue() == integer) {
				        System.out.println("The key for value " + integer + " is " + entry.getKey());}
			  });}}
	  
	  
	  
	  


}


			
			

	  

