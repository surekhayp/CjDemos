import java.util.Comparator;
import java.util.Map.Entry;
import java.util.TreeMap;


class Customers {
	  
    private String name;
    private int marks;
  
    public Customers(String name, Integer marks)
    {
        this.name = name;
        this.marks = marks;
    }
  
    public String getName() { return this.name; }
  
    public Integer getMarks() { return this.marks; }
    // override toString method
    public String toString()
    {
        return this.name + ": " + marks;
    }
}




//Comparator that sort elements according to marks in
//Accending order
class AccordingMarks implements Comparator<Customers> {
 public int compare(Customers s1, Customers s2)
 {
     return s1.getMarks().compareTo(s2.getMarks());
 }
}


public class treeMapdemo {
	
	public static void withComparator()
	{
		
	}


	public treeMapdemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
        
		
		// New TreeMap of custom class Student
				// New TreeMap of custom class Student
		        TreeMap<Customers, Integer> map= new TreeMap<>(new AccordingMarks());
		  
		        // Add elements to TreeMap
		        map.put(new Customers("Ganesha", 400), 1);
		        map.put(new Customers("Rudra", 500), 2);
		        map.put(new Customers("Arnavi", 300), 3);
		  
		        System.out.println(
		            "TreeMap keys sorting in Accending order of the marks:");
		  
		        // Print map using Entry
		        for (Entry<Customers, Integer> entry : map.entrySet()) 
		        {
		            System.out.println("Key : (" + entry.getKey() + "), Value : "  + entry.getValue());
		        }
				
		        
		        
		
		/*
		TreeMap<Integer,String> numbers = new TreeMap<>();

        numbers.put(1,"One");
        numbers.put(2,"Two");
        numbers.put(8,"Three");
        numbers.put(4,"Six");
        numbers.put(10,"Ninety");
        System.out.println("TreeMap: " + numbers);

        // Using entrySet()
        System.out.println("Key/Value mappings: " + numbers.entrySet());

        // Using keySet()
        System.out.println("Keys: " + numbers.keySet());

        // Using values()
        System.out.println("Values: " + numbers.values());
        
        

        // Using replace()
        numbers.replace(2, "Twenty two");
        numbers.replace(3,"Three Hundred");
        System.out.println("TreeMap using replace: " + numbers);

        // Using replaceAll()
        numbers.replaceAll((key, oldValue) -> oldValue + "Updated ...");
        System.out.println("TreeMap using replaceAll: " + numbers);
        
        // Using the firstKey() method
        Integer firstKey = numbers.firstKey();
        System.out.println("First Key: " + firstKey);

        // Using the lastKey() method
        Integer lastKey = numbers.lastKey();
        System.out.println("Last Key: " + lastKey);

        // Using firstEntry() method
        System.out.println("First Entry: " + numbers.firstEntry());


        // Using the lastEntry() method
        System.out.println("Last Entry: " + numbers.lastEntry());
        
        // Using higher()
        System.out.println("Using higherKey(): " + numbers.higherKey(8));
        System.out.println("Using higherEntry(): " + numbers.lowerKey(8));

        // Using lower()
        System.out.println("\nUsing lowerKey(): " + numbers.lowerKey(4));
      //  System.out.println("Using lowerEntry(): " + numbers.lowerEntry(4));
       * */
       
}
}