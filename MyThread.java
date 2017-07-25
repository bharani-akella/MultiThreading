package interview;

public class MyThread extends Thread {
int k;
public MyThread(int k){
	this.k=k;
}
	public void run(){
		System.out.println("T"+k+" started");
		for(int i=0;i<3;i++)
		System.out.println("T"+k);	
		System.out.println("T"+k+" finished\n");
		
		}
	
}
