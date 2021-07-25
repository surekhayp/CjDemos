import java.util.*;  
class Student{  
	  int rollno;  
	  String name;  
	  int age;  
	  Student(int rollno,String name,int age){  
	   this.rollno=rollno;  
	   this.name=name;  
	   this.age=age;  
	  }  
	}  
public class ArrayListdemo {

	public ArrayListdemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	      
		ArrayListdemo.ArrayListSample();
		
		//Creating user-defined class objects  
		  Student s1=new Student(101,"Ganesha",23);  
		  Student s2=new Student(102,"Rudra",21);  
		  Student s3=new Student(103,"Venkatesh",25);  
		  //creating arraylist  
		  ArrayList<Student> al=new ArrayList<Student>();  
		  al.add(s1);//adding Student class object  
		  al.add(s2);  
		  al.add(s3);  
		  //Getting Iterator  
		  Iterator<Student> itr=al.iterator();  
		  //traversing elements of ArrayList object  
		  while(itr.hasNext()){  
		    Student st=(Student)itr.next();  
		    System.out.println(st.rollno+" "+st.name+" "+st.age); 
	}
		  
		  
	}
	public static void methdoTwo()
	{
		  //Creating user-defined class objects  
		  Student s1=new Student(101,"Ganesha",23);  
		  Student s2=new Student(102,"Rudra",21);  
		  Student s3=new Student(103,"Venkatesh",25);  
		  //creating arraylist  
		  ArrayList<Student> al=new ArrayList<Student>();  
		  al.add(s1);//adding Student class object  
		  al.add(s2);  
		  al.add(s3);  
		  //Getting Iterator  
		  Iterator<Student> itr=al.iterator();  
		  //traversing elements of ArrayList object  
		  while(itr.hasNext()){  
		    Student st=(Student)itr.next();  
		    System.out.println(st.rollno+" "+st.name+" "+st.age);  
		  }  
	}
	public static void ArrayListSample()
	{
		
		
		 // creating an array list
	    ArrayList<String> animals = new ArrayList<>();
	    animals.add("Cow");
	    animals.add("Cat");
	    animals.add("Dog");
	    System.out.println("ArrayList: " + animals);

	    // iterate using for-each loop
	    System.out.println("Accessing individual elements:  ");

	    for (String language : animals) {
	      System.out.print(language);
	      System.out.print(", ");
	      
	      // get the element from the arraylist
	      String str = animals.get(1);
	      System.out.print("Element at index 1: " + str);
	      
	      
	      
	      animals.add(1, "Deer");
	      System.out.println("Updated ArrayList: " + animals);
	      
	      
	   // change the element of the array list
	      animals.set(2, "JavaScript");
	      System.out.println("Modified ArrayList: " + animals);
	      
	      // remove element from index 2
	      String str = animals.remove(2);
	      System.out.println("Updated ArrayList: " + animals);
	      System.out.println("Removed Element: " + str);
	      
	      
		
		//Creating arraylist  
			ArrayList<String> list=new ArrayList<String>();
			//Adding object in arraylist 
			list.add("Mango");   
		    list.add("Apple");    
		    list.add("Banana");    
		    list.add("Grapes");    
		  
		  
		  //Traversing list through Iterator  
		  Iterator<String> itr=list.iterator();//getting the Iterator  
		  while(itr.hasNext()){//check if iterator has the elements  
		   System.out.println(itr.next());//printing the element and move to next  
		  }  
		  
		  System.out.println("-----------------------------------------------");
		//Traversing list through for-each loop  
		  for(String fruit:list)    
		    System.out.println(fruit);    
		  System.out.println("-----------------------------------------------");
	   }
	}    
	    public static void ArrayListToArray()
	    {
	    	ArrayList<String> languages = new ArrayList<>();

	        // add elements in the array list
	        languages.add("Java");
	        languages.add("Python");
	        languages.add("C++");
	        System.out.println("ArrayList: " + languages);

	        // create a new array of String type
	        String[] arr = new String[languages.size()];

	        // convert ArrayList into an array
	        languages.toArray(arr);
	        System.out.print("Array: ");

	        // access elements of the array
	        for (String item : arr) {
	          System.out.print(item + ", ");
	    }
	    
	        //array to arraylits conversion
	        
	        }
	    
	    
}
}
