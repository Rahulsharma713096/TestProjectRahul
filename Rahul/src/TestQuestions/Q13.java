package TestQuestions;

public class Q13 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.printf("%d",3);
	}
public static void main(String[] args) throws InterruptedException {
	Thread th=new Thread(new Q13());
	th.start();
	System.out.printf("%d",1);
	th.join();
	System.out.printf("%d",2);
}
}
