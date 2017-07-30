package interview;

public class SynchronisedBlockDisplay {

	public void display(String name){
	synchronized (SynchronisedBlockDisplay.class) {
		for(int i=0;i<10;i++){
			System.out.print("Hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	System.out.println(name);
		}
	}
}
		

}
