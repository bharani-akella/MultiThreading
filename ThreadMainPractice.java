package interview;

public class ThreadMainPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyThread c1=new MyThread(10);
MyThread c2=new MyThread(20);
MyThread c3=new MyThread(30);
MyThread c4=new MyThread(40);

c1.start();
c2.start();
c3.start();
c4.start();
System.out.println("LlL");
for(int i=0;i<3;i++){
	System.out.println("lol");
}
System.out.println("fini");
	}

}
