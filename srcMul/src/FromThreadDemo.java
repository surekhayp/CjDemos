
public class FromThreadDemo extends Thread{

	public FromThreadDemo() {
		// TODO Auto-generated constructor stub
	}

	  /*
	   Default priority of a thread is 5 (NORM_PRIORITY).
	    The value of MIN_PRIORITY is 1 and the value of MAX_PRIORITY is 10.
	
	   */
		public void run(){  
		System.out.println("You see your first thread thread is running...");  
		System.out.println("running thread name is:"+Thread.currentThread().getName());  
		System.out.println("running thread priority is:"+Thread.currentThread().getPriority());  
		}  
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FromThreadDemo t1=new FromThreadDemo();

		FromThreadDemo t2=new FromThreadDemo();
		
		//System.out.println("Name of t1:"+t1.getName());  
		//System.out.println("Name of t2:"+t2.getName());
		
		t1.setPriority(Thread.NORM_PRIORITY);  
		t2.setPriority(Thread.MAX_PRIORITY);  
		 
		 t1.setName("FirstThread");
		 t2.setName("SecondThread");
		 t1.start();  
		 t2.start();
	
		// System.out.println("Thread1 Name is --------- " + t1.getName());
		// System.out.println("Thread2 Name is --------- " + t2.getName());
		// System.out.println("Done.............................");
		   
	}

}
