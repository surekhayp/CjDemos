import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map.*;
public class HAshMapDemo {

	public HAshMapDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    // create a hashmap
	    HashMap<String, Integer> languages = new HashMap<>();

	    // add elements to hashmap
	    languages.put("Java", 8);
	    languages.put("JavaScript", 1);
	    languages.put("Python", 3);
	    System.out.println("HashMap: " + languages);
	    
	 // get() method to get value
	    String value = languages.get(1);
	    System.out.println("Value at index 1: " + value);
	    

	    // return set view of keys
	    // using keySet()
	    System.out.println("Keys: " + languages.keySet());

	    // return set view of values
	    // using values()
	    System.out.println("Values: " + languages.values());

	    // return set view of key/value pairs
	    // using entrySet()
	    System.out.println("Key/Value mappings: " + languages.entrySet());
	    
	    
	    //changing

	    HashMap<Integer, String> languages11 = new HashMap<>();
	    languages11.put(1, "Java");
	    languages11.put(2, "Python");
	    languages11.put(3, "JavaScript");
	    System.out.println("Original HashMap: " + languages11);

	    // change element with key 2
	    languages11.replace(2, "C++");
	    System.out.println("HashMap using replace(): " + languages11);
	    
	    //Deleting
	 // remove element associated with key 2
	    String value = languages11.remove(2);
	    System.out.println("Removed value: " + value);

	    System.out.println("Updated HashMap: " + languages);
	    
	    
	    //iterate

	    // create a HashMap
	    HashMap<Integer, String> languages12 = new HashMap<>();
	    languages.put(1, "Java");
	    languages.put(2, "Python");
	    languages.put(3, "JavaScript");
	    System.out.println("HashMap: " + languages12);

	    // iterate through keys only
	    System.out.print("Keys: ");
	    for (Integer key : languages12.keySet()) {
	      System.out.print(key);
	      System.out.print(", ");
	    }

	    // iterate through values only
	    System.out.print("\nValues: ");
	    for (String value : languages12.values()) {
	      System.out.print(value);
	      System.out.print(", ");
	    }
	    
	    // iterate through key/value entries
	    System.out.print("\nEntries: ");
	    for (java.util.Map.Entry<Integer, String> entry : languages12.entrySet()) {
	      System.out.print(entry);
	      System.out.print(", ");
	}

}
