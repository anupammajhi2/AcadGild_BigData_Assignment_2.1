import java.io.IOException;

public class acad{
	public static void main(String args[]) throws IOException {
		System.out.println(sum(10,45));
		System.out.println(sum("Anupam"));
	}
	
	public static int sum(int a, int b) {
		return (a+b);
	}
	
	public static String sum(String name) {
		return ("Hello "+ name);
	}
}
