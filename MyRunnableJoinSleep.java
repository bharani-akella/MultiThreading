package interview;

public class MyRunnableJoinSleep implements Runnable {
int k;
public MyRunnableJoinSleep(int k){
	this.k=k;
}
	
	public void run(){
		for(int i=0;i<5;i++){
		System.out.println("child"+k);
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		}
	}
}
