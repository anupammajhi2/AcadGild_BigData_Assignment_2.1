import java.io.IOException;

public class acad{
	public static void main(String args[]) throws IOException {
		int[] input_array = { 34, 5, 23, 77, 2, 8, 16, 99, 0, 69 };
        bubble_sort(input_array);
	}
	
	public static void bubble_sort(int[] myArray) {
		
		for(int i=0; i < myArray.length; i++) {
			for(int j=0; j < myArray.length - i - 1; j++ ) {
				if(myArray[j] < myArray[j+1]) {
					int x = myArray[j];
					myArray[j] = myArray[j+1];
					myArray[j+1] = x;
				}
			}
		}
		
		for (int k = 0; k < myArray.length; k++) {
            System.out.print(myArray[k] + " ");
        }
	}
}
