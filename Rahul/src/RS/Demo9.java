package RS;

public class Demo9 {
public static void main(String[] args) {
	try { int c=1/0;
		System.out.println("hello world");
		System.out.println(c);
	}catch(Exception e) {
		System.out.println("World");
	}
	finally {
		System.out.println("World1");
	}
}
}
