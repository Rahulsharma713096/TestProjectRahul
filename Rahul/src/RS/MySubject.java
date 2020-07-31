package RS;

public class MySubject {
public static void main(String[] args) {
	try {
		badmethod();
		System.out.print("A");
	}catch(Exception ex) {
		System.out.print("B");
	}finally {
		System.out.print("C");
	}System.out.print("D");
}
	
	public static void badmethod() {
	
}
}
