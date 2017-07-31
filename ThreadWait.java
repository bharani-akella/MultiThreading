package interview;

public class ThreadWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  ThreadNotify b=new ThreadNotify();
  b.start();
  synchronized (b) {
	System.out.println("Main is invoking wait");
	b.wait();
	System.out.println("Main got notification");
	System.out.println(b.total);
}
  
 
	}

}
