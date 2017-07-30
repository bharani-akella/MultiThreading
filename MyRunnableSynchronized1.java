package interview;

public class MyRunnableSynchronized1 implements Runnable {

Display obj;

public static Thread joinMain; 
public MyRunnableSynchronized1(Display d){
	
	obj=d;
}
	
	public void run(){
		
		obj.displayn();
		
	}
	
}

