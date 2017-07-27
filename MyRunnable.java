package interview;

public class MyRunnable implements Runnable {
int k;
public MyRunnable(int k){
	this.k=k;
}
	
	public void run(){
		for(int i=0;i<4;i++)
		System.out.println(Thread.currentThread().getName()+"'s "+i);
	}
}
