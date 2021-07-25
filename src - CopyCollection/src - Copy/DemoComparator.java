
import java.util.*;
import java.util.ArrayList;  
import java.util.Collections;


class PersonAgeComparator implements Comparator<Person>{
   public int compare(Person a1,Person a2){
     if(a1.auAge==a2.auAge)
       return 0;
   else if(a1.auAge>a2.auAge)
       return 1;
   else
       return -1;
  }
}


class BookNameComparator implements Comparator<Person>{ 
  public int compare(Person a1,Person a2){   
     return a1.bookName.compareTo(a2.bookName); 
  }  
}



public class DemoComparator {

	public DemoComparator() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // List of objects of Author class      
	     ArrayList<Person> al=new ArrayList<Person>();        
	     al.add(new Person("Henry", "Tropic of Cancer",  45));
	     al.add(new Person("Nalo", "Brown Girl in the Ring", 56));
	     al.add(new Person("Frank", "300", 65));
	     al.add(new Person("Deborah", "Sky Boys", 51));
	     al.add(new Person("George R. R.", "A Song of Ice and Fire", 62));
	     /*       
	      * Sorting the list using Collections.sort() method, we       
	      * can use this method because we have implemented the        
	      * Comparable interface in our user defined class Author       
	      */      
	     System.out.println("Sorting by Author First Name:");      
	     Collections.sort(al);        
	     for(Person au: al){       
	       System.out.println(au.getFirstName()+", "+au.getBookName()+", "+
	           au.getAuAge());        
	     } 
	     /*Sorting using PersonAgeComparator*/      
	     System.out.println("Sorting by Author Age:");
	     Collections.sort(al, new PersonAgeComparator());
	     for(Person au: al){       
	       System.out.println(au.getFirstName()+", "+au.getBookName()+", "+
	          au.getAuAge());        
	     }             
	     /*Sorting using NameComparator*/      
	     System.out.println("Sorting by Book Name:");      
	     Collections.sort(al, new BookNameComparator());      
	     for(Person au: al){       
	        System.out.println(au.getFirstName()+", "+au.getBookName()+", "+ 
	           au.getAuAge());       
	     }    

	}

}
