package interview;

public class MyThreadStartOverride2 extends Thread {
int k;
public MyThreadStartOverride2(int k){
	this.k=k;
}
	public void start(){
		super.start();
		System.out.println("Start hhh");
	}
	
	public void run(){
		System.out.println("Run asd");
	}
}
