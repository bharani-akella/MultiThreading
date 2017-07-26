package interview;

public class MyThreadOverload extends Thread {
int k;
public MyThreadOverload(int k){
	this.k=k;
}
	public void run(){
		System.out.println("Hello random "+k);
		
		}
	
	public void run(int k){
		k=this.k;
		System.out.println("Hello "+k);
		
		}
	
}
