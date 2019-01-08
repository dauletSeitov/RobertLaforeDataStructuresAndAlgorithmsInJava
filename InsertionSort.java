import java.util.*;
public class InsertionSort {


	public static void main (String [] arg) {

		int [] arr = new int [] {9,4,6,2,7,4,8,1,6,7}; 

		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			k = i;

			while(k > 0 && arr[k-1] >= temp){
				arr[k] = arr[k-1];
				--k;
			}
			arr[k] = temp;
		}

		System.out.println(Arrays.toString(arr));

	}


}