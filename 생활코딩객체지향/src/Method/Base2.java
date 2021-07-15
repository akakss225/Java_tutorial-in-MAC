package Method;

public class Base2 {
	
	public static String delimeter = "";

	public static void main(String[] args) {
		delimeter = "----";
		printA();
		printB();
		
		delimeter = "****";
		printA();
		printB();
		
		delimeter = "----";
		printA();
		printB();
		
		delimeter = "****";
		printA();
		printB();
		
		
	}

	public static void printA() {
		System.out.println(delimeter);
		System.out.println("A");
		System.out.println("A");
	}
	public static void printB() {
		System.out.println(delimeter);
		System.out.println("B");
		System.out.println("B");
	}

}
