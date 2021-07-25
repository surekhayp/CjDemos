import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemos {

	public SetDemos() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Creating a set using the HashSet class
        Set<Integer> set1 = new HashSet<>();

        // Add elements to the set1
        set1.add(2);
        set1.add(3);
        System.out.println("Set1: " + set1);

        // Creating another set using the HashSet class
        Set<Integer> set2 = new HashSet<>();

        // Add elements
        set2.add(1);
        set2.add(2);
        System.out.println("Set2: " + set2);

        // Union of two sets
        set2.addAll(set1);
        System.out.println("Union is: " + set2);
        
        
     // Creating a set using the TreeSet class
        Set<Integer> numbers = new TreeSet<>();

        // Add elements to the set
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        numbers.add(5);
        numbers.add(500);
        numbers.add(235);
        System.out.println("Set using TreeSet: " + numbers);
        
     // Access Elements using iterator()
        System.out.print("Accessing elements using iterator(): ");
        Iterator<Integer> myvalues = numbers.iterator();
        while(myvalues.hasNext()) {
            System.out.print(myvalues.next());
            System.out.print(", ");
        }
        
        
        TreeSet<Integer> evenNumbers = new TreeSet<>();

        // Using the add() method
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(5);
        evenNumbers.add(6);
        evenNumbers.add(500);
        System.out.println("TreeSet: " + evenNumbers);

        TreeSet<Integer> numbers12 = new TreeSet<>();
        numbers.add(1);

        // Using the addAll() method -Union
        numbers12.addAll(evenNumbers);
        System.out.println("New TreeSet: " + numbers);
        
        
        //Intersection
/*        TreeSet<Integer> evenNumbers = new TreeSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        System.out.println("TreeSet1: " + evenNumbers);*/

        /*TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("TreeSet2: " + numbers);*/

        // Intersection of two sets
        numbers.retainAll(evenNumbers);
        System.out.println("Intersection is: " + numbers);
        
        
        
        //for difference
        
        TreeSet<Integer> e1 = new TreeSet<>();
        e1.add(2);
        e1.add(4);
        System.out.println("TreeSet1: " + e1);

        TreeSet<Integer> n1 = new TreeSet<>();
        n1.add(1);
        n1.add(2);
        n1.add(3);
        n1.add(4);
        System.out.println("TreeSet2: " + n1);

        // Difference between two sets
        n1.removeAll(e1);
        System.out.println("Difference is: " + n1);
        
        
        TreeSet<Integer> nums = new TreeSet<>();
        nums.add(2);
        nums.add(5);
        nums.add(6);
        nums.add(10);
        System.out.println("TreeSet: " + nums);

        // Using the remove() method
        boolean value1 = nums.remove(5);
        System.out.println("Is 5 removed? " + value1);
        System.out.println("TreeSet: " + nums);
        // Using the removeAll() method
      //  boolean value2 = nums.removeAll(nums);
       // System.out.println("Are all elements removed? " + value2);
        
     SetDemos.navigabledemo();
        
	}

	
	public static void navigabledemo()
	{
		
		// Creating a set using the TreeSet class
        Set<Integer> numbers = new TreeSet<>();

        // Add elements to the set
        numbers.add(2);
        numbers.add(3);
        numbers.add(8);
        numbers.add(500);
        numbers.add(235);
        System.out.println("Set using TreeSet: " + numbers);
        

        // Using the first() method
        Integer first = ((TreeSet<Integer>) numbers).first();
        System.out.println("First Number: " + first);

        // Using the last() method
        int last = ((TreeSet<Integer>) numbers).last();
        System.out.println("Last Number: " + last);
        
        
        // Using higher()
        System.out.println("Using higher: " + ((TreeSet<Integer>) numbers).higher(3));

        // Using lower()
        System.out.println("Using lower: " + ((TreeSet<Integer>) numbers).lower(4));
        
        
        // Using pollFirst()
        System.out.println("Removed First Element: " + ((TreeSet<Integer>) numbers).pollFirst());

        // Using pollLast()
        System.out.println("Removed Last Element: " + ((TreeSet<Integer>) numbers).pollLast());

        System.out.println("New TreeSet: " + numbers);
	}
	
}
