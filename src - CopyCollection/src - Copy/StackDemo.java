import java.util.Stack;
import java.util.Iterator;  
public class StackDemo {

	public StackDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Stack<String> animals= new Stack<>();

        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");
        animals.push("Lion");
        System.out.println("Initial Stack: " + animals);

        // Remove element stacks
        String element = animals.pop();
        System.out.println("Removed Element: " + element);
        
        // Access element from the top
        String element1 = animals.peek();
        System.out.println("Element at top: " + element1);
        
        
        // Search an element
        int position = animals.search("Horse");
        System.out.println("Position of Horse: " + position);
        
        // Check if stack is empty
        boolean result = animals.empty();
        System.out.println("Is the stack empty? " + result);
        
        
        
        
        Stack<String> stk = new Stack<>();  
      //pushing elements into stack  
      stk.push("BMW");  
      stk.push("Audi");  
      stk.push("Ferrari");  
      stk.push("Bugatti");  
      stk.push("Jaguar");  
      //iteration over the stack  
      Iterator<String> iterator = stk.iterator();  
      while(iterator.hasNext())  
      {  
    	  Object values = iterator.next();  
    	  System.out.println(values);   
      }     
      
      for (String str : stk) {
    	  System.out.println(str);   
	   }
	}

}
