package TestQuestions;

public class Q14 {
public static void main(String[] args) {
	final StringBuffer a=new StringBuffer();
	final StringBuffer b=new StringBuffer();
	new Thread() {
		public void run() {
			System.out.print(a.append("A"));
		synchronized (b) {
			System.out.print(b.append("B"));
		}}
		}.start();
		new Thread() {
			public void run() {
				System.out.print(a.append("C"));
			synchronized (a) {
				System.out.print(b.append("D"));
			}}
			}.start();
	
}
}
