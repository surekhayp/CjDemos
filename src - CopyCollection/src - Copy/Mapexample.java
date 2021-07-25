import java.util.*;    
class Book {    
	int id;    
	String name,author,publisher;    
	int quantity;    
	public Book(int id, String name, String author, String publisher, int quantity) {    
	    this.id = id;    
	    this.name = name;    
	    this.author = author;    
	    this.publisher = publisher;    
	    this.quantity = quantity;    
	}    
}    
public class Mapexample {    
	public static void main(String[] args) {    
	    //Creating map of Books    
	    Map<Integer,Book> mapBooks=new HashMap<Integer,Book>();    
	    //Creating Books    
	    Book b1=new Book(101,"C programming","Denis Ritchie","BPB",8);    
	    Book b2=new Book(102,"Python","V Y desai","Mc Graw Hill",4);    
	    Book b3=new Book(103,"Operating System","Galvin","Tata Mc Graw",6);    
	    //Adding Books to map   
	    mapBooks.put(1,b1);  
	    mapBooks.put(2,b2);  
	    mapBooks.put(3,b3);  
	      
	    //Traversing map  
	    for(Map.Entry<Integer, Book> entry:mapBooks.entrySet()){    
	        int key=entry.getKey();  
	        Book b=entry.getValue();  
	        System.out.println(key+" Details:");  
	        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
	    }    
	    
	    //    String value = languages.get(1);
	    Book bobj=mapBooks.get(1);
	    System.out.println("heres the book U r looking for ");
	    System.out.println(bobj.id + "\t" + bobj.name + "\t" + bobj.author + "\t" +  bobj.publisher );
	}    
}    