package interview;

public class ThreadMainJoinSleep2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
MyRunnableJoinSleep2.joinMain=Thread.currentThread();
MyRunnableJoinSleep2 r1=new MyRunnableJoinSleep2(10);
Thread t1=new Thread(r1,"one");
t1.setPriority(10);
t1.start();
for(int i=0;i<5;i++){
	System.out.println("Parent");
Thread.currentThread().sleep(500);	
}


	}

}
