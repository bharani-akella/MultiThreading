package interview;

public class ThreadMainJoinSleep {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
MyRunnableJoinSleep c1=new MyRunnableJoinSleep(10);
MyRunnableJoinSleep c2=new MyRunnableJoinSleep(20);
MyRunnableJoinSleep c3=new MyRunnableJoinSleep(30);

Thread t1=new Thread(c1,"one");
//Thread t2=new Thread(c2,"two");
//Thread t3=new Thread(c3);

t1.setPriority(10);
t1.start();
//t2.setPriority(5);
//t2.start();
t1.join();
for(int i=0;i<5;i++)
System.out.println("Parent");


	}

}
