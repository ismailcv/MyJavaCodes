package bubbleSort;


class BubbleSort {
    void bubbleSort(int arr[])
    {
        int n = arr.length;
        long counter = 0;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    counter++;
                }
       System.out.println("Karþýlaþtýrma sayýsý: " + counter ); 
    }
 
    /* Prints the array */
/*   void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            
        	if((i%25)== 0){
            	System.out.println(arr[i] + " ");
            }
            else{
            	System.out.print(arr[i] + " ");
            }
        System.out.println();
    }
 */
    // Driver method to test above
    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        int[] arr1 = new int[1000]; //en iyi durum için 
        int[] arr2 = new int[1000]; //Rastgele durum için
        int[] arr3 = new int[1000]; // En kötü durum için
        
        long startTime = System.nanoTime();
        
        for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i;
		}
        
        for (int i = 0; i < arr1.length; i++) {
			arr2[i] = (int) (Math.random()*100);
		}
        
        for (int i = 0; i < arr3.length ; i++) {
			arr3[i] = 100000 - i;
		}
        
        ob.bubbleSort(arr1);
        ob.bubbleSort(arr2);
        ob.bubbleSort(arr3);
        
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("Total execution time in Java in millis: "+ elapsedTime/1000000);
        
        //ob.printArray(arr1);       
    
        
        
        
        
        
        
        
    }
}