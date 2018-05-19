import java.io.IOException;

public class acad{
	public static void main(String args[]) throws IOException {
		System.out.println("Enter first number : ");
		int a = Integer.parseInt(System.console().readLine());
		System.out.println("Enter second number : ");
		int b = Integer.parseInt(System.console().readLine());
		
		int min,max;
				
		if(a <= b) {
			min = a;
			max = b;
		}
		else {
			min = b;
			max = a;
		}
		
		System.out.println("Even Numbers: ");
		for(int i=min;i<=max;i++){
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("Odd Numbers: ");
		for(int i=min;i<=max;i++){
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
}
