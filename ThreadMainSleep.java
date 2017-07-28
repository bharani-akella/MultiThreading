package interview;

public class ThreadMainSleep {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
MyRunnableSleep r=new MyRunnableSleep(10);
Thread t=new Thread(r);
t.start();
for(int i=0;i<10;i++){
	System.out.println("Slide"+(i+1));
	Thread.sleep(500);
}		


	}

}
