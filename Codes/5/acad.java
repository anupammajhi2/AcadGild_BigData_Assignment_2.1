import java.io.IOException;

public class acad{
	public static void main(String args[]) throws IOException {
		System.out.println("Enter number : ");
		int num = Integer.parseInt(System.console().readLine());
		
		for(int i=1;i<=10;i++){
			System.out.println(num + " X " + i + " = " + (num*i));
		}
		
	}
}
