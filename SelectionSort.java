import java.util.*;

public class SelectionSort {


	public static void main(String[] args) {
		
		int [] arr = new int []{2,6,8,3,5,8,0,1,4, 5};

		// Random rand = new Random(); 
		// for (int i = 0; i < arr.length; i++) {
		// 	arr[i] = rand.nextInt();
		// 	System.out.print(arr[i] + "\t");
		// } 

		System.out.println();
		int comparation = 0;
		

		for(int i = arr.length; i > -1 ; i--) {
			System.out.println("\n" + Arrays.toString(arr));
		 	for(int k = 0; k < i - 1; k++) {
		 		comparation ++;
			 	if(arr[k] > arr[k + 1]){

			 		int a = arr[k];
			 		arr[k]= arr[k+1];
			 		arr[k+1] = a;

			 	}
			 	//arr[]
				//System.out.print(k +"\t");
			}

			//System.out.println();
	
		}
		System.out.println("\n" + Arrays.toString(arr));
		System.out.println(comparation);


	}


}
