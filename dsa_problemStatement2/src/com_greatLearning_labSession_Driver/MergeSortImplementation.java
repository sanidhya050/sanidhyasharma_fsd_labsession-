package com_greatLearning_labSession_Driver;

public class MergeSortImplementation {
	void merge(int arr[], int left , int mid  , int right ) {
		int n1 = mid - left + 1 ;
		int n2 = right - mid;
		
		/* create temporary arrays */
		int leftArray[] = new int[n1];
		int rightArray[] = new int [n2];
		
		/* copy data to temporary array */
		for (int i = 0; i < n1 ; ++i )
			leftArray[i] = arr[ left + i ];
		for ( int j = 0 ; j < n2 ; ++j)
			rightArray[j] = arr[mid + 1 + j ];
		
		/* merge the temporary Arrays */
		// initialise the indexs of first and second sub arrays //
		int i = 0 , j = 0 ;
		
		// initialise indexs of meregd sub sub arrays //
		int k = left ;
		while  ( i < n1 && j < n2 ) {
			if ( leftArray[i]>=rightArray[j]) {
				arr[k]= leftArray[i];
				i++;
			}else {
				arr[k]= rightArray[j];
				j++;
			}
			 k++;
		}
		
		/*copy remaining elements of L*/
		while( i < n1 ) {
			arr[k] = leftArray[i];
			i++;
			k++;
		}
		/*copy remaining elements of r[] if any */
		while ( j < n2 ) {
			arr[k] = rightArray[j] ;
			j++;
			k++;
			
		   }
		}
	// main functions that sort Array[left..right ] using merge //
	public void sort(int[] notes, int left , int right ) {
		if (left<right) {
			//find the middle point //
			int mid = ( left + right ) / 2;
			
			//sort first and second halves //
			sort ( notes, left, mid );
			sort ( notes, mid +1 , right );
			
			// merge the sort halves //
			merge ( notes ,left,mid, right );
			
		}
		

			
		
	}

}
