package interview;

public class ThreadMainRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyRunnable c1=new MyRunnable(10);
MyRunnable c2=new MyRunnable(20);

Thread t1=new Thread(c1,"Sam");
Thread t2=new Thread(c2,"Ravi");
Thread t3=new Thread();
Thread t4=new Thread();

t2.start();

t1.start();
t3.start();
t4.start();

System.out.println("Main");

	}

}
