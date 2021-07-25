
public class RunnableDemo implements Runnable{ 

	public RunnableDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableDemo t1=new RunnableDemo();

		RunnableDemo t2=new RunnableDemo();
		
	   Thread o1=new Thread(t1);
	   o1.setName("ThreadFirst");
	   o1.start();
	   
	   Thread o2=new Thread(t1);
	   o2.setName("ThreadSecond");
	   o2.start();
	   
	   System.out.println("---------------Done --------------------");
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Currently thread" + Thread.currentThread().getName()  + " is running...");  
	}

}
