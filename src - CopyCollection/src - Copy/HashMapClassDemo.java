import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class HashMapClassDemo {

	public HashMapClassDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMapClassDemo.DemoHasmMap();
		
		
	}
	
	public static void DemoHasmMap()
	{
		// create a hashmap
	    Map<Integer,String> languages = new HashMap<>();

	    // add elements to hashmap
	    languages.put(1,"Java");
	    languages.put(3,"JavaScript");
	    languages.put(5,"Python");
	    languages.put(7,"HTML");
	    languages.put(9,"UML");
	    System.out.println("HashMap: " + languages);
	    
	 // get() method to get value
	    String val = 	languages.get(5);
	    System.out.println("Value at index 3: " + val);
	    
	    // using keySet()
	    System.out.println("Keys: " + languages.keySet());

	    // return set view of values
	    // using values()
	    System.out.println("Values: " + languages.values());

	    // return set view of key/value pairs
	    // using entrySet()
	    System.out.println("Key/Value mappings: " + languages.entrySet());
	    
	    
	    
	    // change element with key 2
	    languages.replace(2, "TypeScript");
	    System.out.println("HashMap using replace(): " + languages);
	    System.out.println("Updated HashMap: after replace " + languages);
	    //Deleting
	 // remove element associated with key 2
	    String value = languages.remove(5);
	    System.out.println("Removed value: " + value);

	    System.out.println("Updated HashMap: after delete " + languages);
	    
	    
	    
	    //iterations
	    
	    // iterate through keys only
	    System.out.print("Keys: ");
	    for (Integer key : languages.keySet()) {
	      System.out.print(key);
	      System.out.print(", ");
	    }

	    // iterate through values only
	    System.out.print("\nValues: ");
	    for (String vals : languages.values()) {
	      System.out.print(vals);
	      System.out.print(", ");
	    }
	    
	    // iterate through key/value entries
	    System.out.print("\nEntries: ");
	    for (java.util.Map.Entry<Integer, String> entry : languages.entrySet()) {
	      System.out.print(entry);
	      System.out.print(", ");
	}
	    
	    
	}

}
