package interview;

public class MyRunnableSleep implements Runnable {
int k;
public static Thread joinMain; 
public MyRunnableSleep(int k){
	this.k=k;
}
	
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("child"+(i+1));
try {
	Thread.sleep(500);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}			
		}
	}
}
