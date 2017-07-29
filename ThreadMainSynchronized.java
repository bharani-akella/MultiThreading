package interview;

public class ThreadMainSynchronized {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Display d1=new Display();
		
		
MyRunnableSynchronized r1=new MyRunnableSynchronized(d1,"hari");
MyRunnableSynchronized r2=new MyRunnableSynchronized(d1,"ram");
MyRunnableSynchronized r3=new MyRunnableSynchronized(d1,"Mukesh");


Thread t1=new Thread(r1);
Thread t2=new Thread(r2);
Thread t3=new Thread(r3);

t1.start();
t2.start();
t3.start();


	}

}
