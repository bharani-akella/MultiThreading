package interview;

public class ThreadNotify extends Thread{
int total;

public void run(){
synchronized (this) {
System.out.println("Child calculating total");
	for(int i=1;i<=100;i++){
		total=total+i;
	}
	System.out.println("Child sends notificaation");
	
	this.notify();
	
}

}
	
}
