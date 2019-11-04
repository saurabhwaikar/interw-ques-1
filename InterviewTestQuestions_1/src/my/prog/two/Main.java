package my.prog.two;

/* Save this in a file called Main.java to compile and test it */

/* 
   Example file showing how to write a program that reads
   input from `input.txt` in the current directory
   and writes output to `output.txt` in the current directory
*/

/* Do not add a package declaration */
import java.util.*;
import java.io.*;

/* DO NOT CHANGE ANYTHING ABOVE THIS LINE */
/* You may add any imports here, if you wish, but only from the 
   standard library */

/* Do not add a namespace declaration */

public class Main {
    public static void main (String[] args) {
        ArrayList<String> inputData = new ArrayList<String>();
        int numLines = 0;
        try {
            Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));

            /* Here we can read in the input file */
            /* In this example, we're reading all the lines of file
               `input.txt` and then ignoring them. 
               You should modify this part of the
               program to read and process the input as desired */
            List<IpDetail> ipList = new ArrayList<>(); // input data
            Map<String, Integer> apiLatestVersionMap = new HashMap<>();
            Map<String, Integer> oldestApiMap = new HashMap<>();
            Set<String> appsWithOldestAPI = new HashSet<>();
            while(in.hasNextLine()) {
                String line = in.nextLine();
                String[] tokens = line.split(",");
                IpDetail ipDetail = new Main().new IpDetail();
                ipDetail.setAppName(tokens[0].trim());
                ipDetail.setApiName(tokens[1].trim());
                ipDetail.setApiVersion(tokens[2].trim());
                ipList.add(ipDetail);
            }

            /* In this example, we're writing `num_lines` to
               the file `output.txt`.
               You should modify this part of the
               program to write the desired output */
            
            apiLatestVersionMap = getAPIDetailMap(ipList, apiLatestVersionMap);
    		oldestApiMap = getOldestApiMap(ipList, apiLatestVersionMap, oldestApiMap);
    		for (IpDetail ipDet: ipList) {
    			if(oldestApiMap.containsKey(ipDet.getApiName())) {
    				if(Integer.valueOf(ipDet.getApiVersion().substring(1)) == Integer.valueOf(oldestApiMap.get(ipDet.getApiName()))) {
    					appsWithOldestAPI.add(ipDet.getAppName());
    				}
    			}
    		}
    		
    		PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
    		for (String appNameOldAPI : appsWithOldestAPI) {
				output.println("" + appNameOldAPI);
			}
            output.close();
            
        } catch (IOException e) {
            System.out.println("IO error in input.txt or output.txt");
        }
    }
    
    class IpDetail {
    	String appName;
    	String apiName;
    	String apiVersion;
    	
		public String getAppName() {
			return appName;
		}
		public void setAppName(String appName) {
			this.appName = appName;
		}
		public String getApiName() {
			return apiName;
		}
		public void setApiName(String apiName) {
			this.apiName = apiName;
		}
		public String getApiVersion() {
			return apiVersion;
		}
		public void setApiVersion(String apiVersion) {
			this.apiVersion = apiVersion;
		}
    	
		@Override
		public String toString() {
			return " " + this.getAppName() + " :: " + this.getApiName() + " :: " + this.getApiVersion() 
					+ " :: " +  this.getApiVersion().substring(1)	+ " ;; ";
		}
    }
    
    public static Map<String, Integer> getAPIDetailMap(List<IpDetail> ipList, Map<String, Integer> apiMap){
    	for (IpDetail ipDetail : ipList) {
			if(apiMap.containsKey(ipDetail.getApiName())) {
				if(Integer.valueOf(ipDetail.getApiVersion().substring(1)) > apiMap.get(ipDetail.getApiName())) {
					apiMap.put(ipDetail.getApiName(), Integer.valueOf(ipDetail.getApiVersion().substring(1)));
				}
			} else {
				apiMap.put(ipDetail.getApiName(), Integer.valueOf(ipDetail.getApiVersion().substring(1)));
			}
		}
    	return apiMap;
    }
    
    public static Map<String, Integer> getOldestApiMap(List<IpDetail> ipList, Map<String, Integer> latestVersionApiMap, Map<String, Integer> oldestVersionApiMap){
    	for (IpDetail ipDetail : ipList) {
			if(latestVersionApiMap.containsKey(ipDetail.getApiName())) {   // checking if API is pressent in latestVesioAPIMAP
				if(Integer.valueOf(ipDetail.getApiVersion().substring(1)) < latestVersionApiMap.get(ipDetail.getApiName())) {
					if(oldestVersionApiMap.containsKey(ipDetail.getApiName())) {
						if(Integer.valueOf(ipDetail.getApiVersion().substring(1)) < oldestVersionApiMap.get(ipDetail.getApiName())) {
							oldestVersionApiMap.put(ipDetail.getApiName(), Integer.valueOf(ipDetail.getApiVersion().substring(1)));
						}
					} else {
						oldestVersionApiMap.put(ipDetail.getApiName(), Integer.valueOf(ipDetail.getApiVersion().substring(1)));
					}
				}
			}
		}
    	return oldestVersionApiMap;
    }
}
