import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;

public class DemoAll {

	public DemoAll() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	DemoAll.DemoRemAll();
	//	DemoAll.AddAllDemo();
		DemoAll.iterateALL();
		/*
		 // creating an array list
	    ArrayList<String> animals = new ArrayList<>();
	    
	    animals.add("Cow");
	    animals.add("Cat");
	    animals.add("Dog");
	    System.out.println("ArrayList: " + animals);
	    
	    // get the element from the arraylist
	      String str = animals.get(1);
	      System.out.print("Element at index 1: " + str);
	      
	      
	      //adding at specific position
	      animals.add(3, "Deer");
	      System.out.println("Updated ArrayList: " + animals);
	      

	      //adding at specific position
	      animals.add(1, "parrot");
	      System.out.println("Updated ArrayList: " + animals);
	      
	      // change the element of the array list
	      animals.set(2, "ModifiedAnimal");
	      System.out.println("Modified ArrayList: " + animals);
	      
	      //remobe
	   // remove element from index 2
	      String animalValue = animals.remove(2);
	      System.out.println("Updated ArrayList: " + animals);
	      System.out.println("Removed Element: " + animalValue);

*/
		
		//clear
		 // create an arraylist
    /*    ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("JavaScript");
        languages.add("Python");
        System.out.println("Programming Languages: " + languages);

        // remove all elements
        languages.clear();
        System.out.println("ArrayList after clear(): " + languages);*/
	      
        
        //sorting Arraylist
     // create an ArrayList
       // ArrayList<String> languages = new ArrayList<>();

        // add elements to ArrayList
      /*  languages.add("Python");
        languages.add("Swift");
        languages.add("C");
        languages.add("JavaScript");
        System.out.println("Unsorted ArrayList: " + languages);

        // sort the ArrayList in ascending order
        languages.sort(Comparator.naturalOrder());
        System.out.println("Sorted ArrayList: " + languages);*/
	      
	}
	
	
	public static void DemoRemAll()
	{
		 try {
			  
	            // Creating object of ArrayList<Integer>
	            ArrayList<Integer> arrlist1 = new ArrayList<Integer>();
	  
	            // Populating arrlist1
	            arrlist1.add(1);
	            arrlist1.add(2);
	            arrlist1.add(3);
	            arrlist1.add(4);
	            arrlist1.add(5);
	  
	            // print arrlist1
	            System.out.println("ArrayList before "
	                               + "removeAll() operation : "
	                               + arrlist1);
	  
	            // Creating another object of  ArrayList<Integer>
	            ArrayList<Integer> arrlist2 = new ArrayList<Integer>();
	            arrlist2.add(1);
	            arrlist2.add(2);
	            arrlist2.add(3);
	  
	            // print arrlist2
	            System.out.println("Collection Elements"
	                               + " to be removed : "
	                               + arrlist2);
	  
	            // Removing elements from arrlist
	            // specified in arrlist2
	            // using removeAll() method
	            arrlist1.removeAll(arrlist2);
	  
	            // print arrlist1
	            System.out.println("ArrayList after "
	                               + "removeAll() operation : "
	                               + arrlist1);
	        }
	  
	        catch (NullPointerException e) {
	            System.out.println("Exception thrown : " + e);
	        }
		
		
		 
	}
	
	
	public static void AddAllDemo()
	 {
		 // create an arraylist
	        ArrayList<Integer> primeNumbers = new ArrayList<>();
	        // add elements to arraylist
	        primeNumbers.add(3);
	        primeNumbers.add(5);
	        System.out.println("Prime Numbers: " + primeNumbers);

	        // create another arraylist
	        ArrayList<Integer> numbers = new ArrayList<>();
	        numbers.add(1);
	        numbers.add(2);

	        // Add all elements from primeNumbers to numbers
	        numbers.addAll(primeNumbers);
	        System.out.println("Numbers: " + numbers);
	 }

	
	public static void iterateALL()
	{
				
		 ArrayList<String> list=new ArrayList<String>();
		 //Creating arraylist  
		//Adding object in arraylist  
         list.add("Ganesha");
         list.add("Venkatesh");  
         list.add("Narayani");  
         list.add("Madhav");  
      
         
/*
		 //Traversing list through Iterator  
		  Iterator<String> itr=list.iterator();//getting the Iterator  
		  while(itr.hasNext())
		  {//check if iterator has the elements  
			  System.out.println(itr.next());//printing the element and move to next  
		  }  
		  
		 
		  System.out.println("-----------------------------------------------");
			//Traversing list through for-each loop  
			  for(String fruit:list)   { 
			    System.out.println(fruit);    
			  System.out.println("-----------------------------------------------");
		   }
		  
			  */
			  
			  // create a list of names
		        ArrayList<String> names = new ArrayList<String>();
		        names.add("Welcome");
		        names.add("To");
		        names.add("Indias IT World");
		  
		        // Getting ListIterator
		        ListIterator<String> namesIterator = names.listIterator();
		  
		        // Traversing elements
		        while (namesIterator.hasNext()) {
		            System.out.println(namesIterator.next());
		        }
		  
		        // for-each loop creates Internal Iterator here.
		        for (String s : names) {
		            System.out.println(s);
		        }
		        
		        
			  //-----------------------------
			  
			  System.out.println("Traversing list through List Iterator:");  
	           //Here, element iterates in reverse order  
	              ListIterator<String> list1=list.listIterator(list.size());  
	              while(list1.hasPrevious())  
	              {  
	                  String str=list1.previous();  
	                  System.out.println(str);  
	      
			  			  
	              }  
	  	        System.out.println("Traversing list through for loop:");  
	  	           for(int i=0;i<list.size();i++)  
	  	           {  
	  	            System.out.println(list.get(i));     
	  	           }  
   }
}
