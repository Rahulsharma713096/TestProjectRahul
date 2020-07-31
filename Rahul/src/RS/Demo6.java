package RS;

class DEmo{
	void dip1() {
		System.out.println("This is the parents class method");
	}
	DEmo()
	{
		System.out.println("DEmo class constructor");
	}

}
class DEmo12 extends DEmo{
	DEmo12() { this(14);
		System.out.println("D1 this isZero parametrize cons." );
	}
	DEmo12(int a){
		System.out.println("D1 this is   parametrize cons.");
	}
}
public class Demo6 {public static void main(String[] args) {
DEmo12	d=new DEmo12();
	System.out.println(d);

	
	
}

}
