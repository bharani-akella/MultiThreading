package interview;

public class MyRunnableSynchronised2 implements Runnable{
Display obj;
	public MyRunnableSynchronised2(Display d) {
		// TODO Auto-generated constructor stub
		obj=d;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		obj.displayc();
	}

	
}
