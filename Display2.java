package interview;

public class Display2 {

	public static synchronized void displayn(){
	for(int i=1;i<=10;i++){
		System.out.print(i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

	public static synchronized void  displayc(){
		for(int i=65;i<=75;i++){
			System.out.print((char)i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}

}
