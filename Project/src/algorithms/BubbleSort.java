package algorithms;

public class BubbleSort {
	
	public static void sort(int array[]) {
		
		int n = array.length;
		int i,j,temp;
		boolean swapped;
		
		for(i=0; i < n-1; i++) {
			swapped = false;
			
			for(j=0; j < n-i-1; j++) {
				if (array[j] > array[j+1]) {
		
					temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    
                    swapped = true;
                    
				}
			}
			
			if(swapped == false) {
				break;
			}
			
		}
		
	}
	
	//toString method
	public static void printArray(int arr[]){
        int i;
        for (i=0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        
        System.out.println();
    }

}

