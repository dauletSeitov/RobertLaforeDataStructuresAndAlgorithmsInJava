import java.util.*;

public class BubbleSort {


	public static void main(String[] args) {
		
		int [] arr = new int [100];

		Random rand = new Random(); 
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt();
			System.out.print(arr[i] + "\t");
		} 

		System.out.println("hello world!");
	}


}
