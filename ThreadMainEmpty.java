package interview;

public class ThreadMainEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyThreadEmpty c1=new MyThreadEmpty(10);
MyThreadEmpty c2=new MyThreadEmpty(20);
MyThreadEmpty c3=new MyThreadEmpty(30);
MyThreadEmpty c4=new MyThreadEmpty(40);

c1.	start();
c2.start();
c3.start();
c4.start();
	}

}
