
/*public class SyncMethoddemo {

	public SyncMethoddemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
*/

//example of java synchronized method  
class TableA{  
 synchronized void printTable(int n){//synchronized method  
   for(int i=1;i<=5;i++){  
     System.out.println(n*i);  
     try{  
      Thread.sleep(400);  
     }catch(Exception e){System.out.println(e);}  
   }  
  
 }  
}  
  
class MyThreadA extends Thread{  
Table t;  
MyThreadA(Table t){  
this.t=t;  
}  
public void run(){  
t.printTable(5);  
}  
  
}  
class MyThreadB extends Thread{  
Table t;  
MyThreadB(Table t){  
this.t=t;  
}  
public void run(){  
t.printTable(100);  
}  
}  
  
public class SyncMethoddemo{  
public static void main(String args[]){  
TableA obj = new TableA();//only one object  
MyThreadA t1=new MyThreadA(obj);  
MyThreadB t2=new MyThreadB(obj);  
t1.start();  
t2.start();  
}  
}  