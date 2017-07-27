package interview;

public class MyRunnableYield implements Runnable {
int k;
public MyRunnableYield(int k){
	this.k=k;
}
	
	public void run(){
		for(int i=0;i<5;i++)
		System.out.println("child"+k);
	Thread.currentThread().yield();
	}
}
