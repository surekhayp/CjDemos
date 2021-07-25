
public class TestSleepdemo extends Thread{  
	 
	public void run(){  
		  for(int i=1;i<5;i++){  
		    try{
		    	Thread.sleep(500);
		    	}
		    
		    catch(InterruptedException e)
		    {
		    	System.out.println(e);
		    }  
	  System.out.println(i);  
	   }  
	 }
	public TestSleepdemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestSleepdemo t1=new TestSleepdemo();
		TestSleepdemo t2=new TestSleepdemo();
		
		t1.start();
		t2.start();
	}

}
