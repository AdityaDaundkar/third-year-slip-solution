import java.util.Hashtable;
import java.util.Scanner;

public class CitySTDHashtable {
    public static void main(String[] args) {
        Hashtable<String, String> cityStdHashtable = new Hashtable<>();
        
        // Populate the Hashtable with city names and STD codes
        cityStdHashtable.put("Pune", "212");
        cityStdHashtable.put("Pimpri", "415");
        cityStdHashtable.put("Kolhapur", "213");
        cityStdHashtable.put("Mumbai", "312");
        cityStdHashtable.put("Nashik", "617");

        // Display the details of the Hashtable
        System.out.println("City STD Codes Hashtable:");
        for (String city : cityStdHashtable.keySet()) {
            String stdCode = cityStdHashtable.get(city);
            System.out.println(city + ": " + stdCode);
        }

        // Search for a specific city and display its STD code
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a city name to find its STD code: ");
        String searchCity = scanner.nextLine();
        if (cityStdHashtable.containsKey(searchCity)) {
            String stdCode = cityStdHashtable.get(searchCity);
            System.out.println("STD code for " + searchCity + ": " + stdCode);
        } else {
            System.out.println(searchCity + " not found in the Hashtable.");
        }
        
        scanner.close();
    }
}
