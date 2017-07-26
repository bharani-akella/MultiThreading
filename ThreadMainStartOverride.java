package interview;

public class ThreadMainStartOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyThreadStartOverride c1=new MyThreadStartOverride(10);

c1.	start();
c1.run();
System.out.println("Main");
	}

}
