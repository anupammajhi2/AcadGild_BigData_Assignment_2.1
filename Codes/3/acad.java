public class acad{
	public static void main(String args[]) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		sum(a,b);
	}
	
	public static void sum(int a, int b) {		
		System.out.println("First number is: " + a);
		System.out.println("Second number is :" + b);
		System.out.println("Sum is: " + (a + b));	
	}
}
