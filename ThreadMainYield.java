package interview;

public class ThreadMainYield {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyRunnableYield c1=new MyRunnableYield(10);
MyRunnableYield c2=new MyRunnableYield(20);
MyRunnableYield c3=new MyRunnableYield(30);

Thread t1=new Thread(c1);
Thread t2=new Thread(c2);
Thread t3=new Thread(c3);

t1.setPriority(1);
t1.start();
t2.setPriority(5);
t2.start();
t3.setPriority(7);
t3.start();

for(int i=0;i<5;i++)
System.out.println("Parent");


	}

}
