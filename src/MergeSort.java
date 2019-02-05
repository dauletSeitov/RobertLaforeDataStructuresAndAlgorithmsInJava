
public class MergeSort {


	public static void main(String [] args){

		int [] arr = new int[]{6,8,1,6,2,8,2,7,4,5};
		System.out.println(java.util.Arrays.toString(arr));
		new MergeSort().doSort(arr);
		System.out.println(java.util.Arrays.toString(arr));


	}

	private void doSort (int[] arr){

		int start = 0; 
		int end = arr.length;
		sort(arr, start, end);
	}


	private void sort (int[] arr, int start, int end){

		if (start == end)
			return;

		int mid  = (start + end)/2;

		sort(arr, start, mid);
		sort(arr, mid+1, end);

		merge(arr, start, mid+1, end);
	}

	private void merge (int[] workSpace, int lowPtr, int highPtr, int upperBound) {

	/*	int j = 0;
		// workspace index
		int lowerBound = lowPtr;
		int mid = highPtr-1;
		int n = upperBound-lowerBound+1;

		// # of items
		while(lowPtr <= mid && highPtr <= upperBound)
			if( theArray[lowPtr] < theArray[highPtr] )
				workSpace[j++] = theArray[lowPtr++];
			else
				workSpace[j++] = theArray[highPtr++];
	
		while(lowPtr <= mid)
			workSpace[j++] = theArray[lowPtr++];
		
		while(highPtr <= upperBound)
			workSpace[j++] = theArray[highPtr++];
		
		for(j=0; j<n; j++)
			theArray[lowerBound+j] = workSpace[j];*/
		

	}
}