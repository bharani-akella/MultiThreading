package interview;

public class MyRunnableSynchronized implements Runnable {
String k;
Display obj;

public static Thread joinMain; 
public MyRunnableSynchronized(Display d,String k){
	this.k=k;
	obj=d;
}
	
	public void run(){
		obj.wish(k);
	}
	
}

