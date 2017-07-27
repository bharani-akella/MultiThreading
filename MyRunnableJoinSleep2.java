package interview;

public class MyRunnableJoinSleep2 implements Runnable {
int k;
public static Thread joinMain; 
public MyRunnableJoinSleep2(int k){
	this.k=k;
}
	
	public void run(){
		try {
			joinMain.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
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
