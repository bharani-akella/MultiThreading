package interview;

public class MyThreadStartOverride extends Thread {
int k;
public MyThreadStartOverride(int k){
	this.k=k;
}
	public void start(){
		System.out.println("Start hhh");
	}
	
	public void run(){
		System.out.println("Run asd");
	}
}
