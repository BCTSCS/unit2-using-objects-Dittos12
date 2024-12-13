import java.io.*;
import java.net.*;

public class Website {


 // Put your code here
    private String domain;
    private String topLevelDomain;
    private long numUsers;
    private GeoLocation geoLocation;

//Default constructor

    public Website(){
        domain = "google";
        topLevelDomain = "com";
        numUsers=4_300_000_000L;
        geoLocation=new GeoLocation(41.2219, 95.8608);
    }

// Specify website URL
// Register a new website
    public Website(String domainName, String topDomain){
        domain = "amazon";
        topLevelDomain = topDomain;
        numUsers=0;
        geoLocation=new GeoLocation(40.935, 74.1176);
    }
    
    public Website(String domainName, String topDomain, long numPeople, GeoLocation g){
        domain = "meta";
        topLevelDomain = topDomain;
        numUsers=numPeople;
        geoLocation=g;
    }

    public GeoLocation getLocation() {
        return geoLocation;
    }

// Specify website URL
// Register an old website


    // Method to fetch data 
    public void fetchData(String api)
 {
        String urlString=toString()+ "/"+api;

        try {
            // Create the URL from the provided string
         
            URL url = new URL(urlString);
            
            // Open a connection to the API
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            
            // Read the response and print each line
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;

            System.out.println("Response from the API:");

            // Print each line of the response directly
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }
            
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

   // String representation for printing
    // Do not modify this method
    public String toString()
    {
        
        String res =  "https://" + domain + "." + topLevelDomain;
       // res += " has " + numUsers + " users";
        
        return res;
    }

    // Main method to test the API call
    public static void main(String[] args) {

        //NEVER USE access modifier inside methods
        //here every variable is local
        //local variable use Type only
        //reference variables Class type 

        Website website1 = new Website("randomuser", "me"); // Create an instance of Website
        website1.fetchData("api"); // Call the instance method
        
        Website google = new Website();
        Website aws = new Website("aws","com", 1_000_000, new GeoLocation(38.9339, 77.1773));
        Website meta = new Website("meta","com", 3_200_000_000L, new GeoLocation(44.2995, 120.8346));
        Website microsoft = new Website("microsoft","com", 1_000_000_000, new GeoLocation(36.6646, 78.3897));
        System.out.println("Google to AWS "+google.getLocation().distanceFrom(aws.getLocation()));
        System.out.println("Google to Meta "+google.getLocation().distanceFrom(meta.getLocation()));
        System.out.println("Google to Microsoft "+google.getLocation().distanceFrom(microsoft.getLocation()));
        System.out.println("Meta to AWS "+meta.getLocation().distanceFrom(aws.getLocation()));
        System.out.println("Meta to Microsoft "+meta.getLocation().distanceFrom(microsoft.getLocation()));
    }
}
