public class InsertionSort {
  
  public static int[] insertionSort(int[] array){
    
    int key; //holds the value being compared to the swap variable
    int swap; //holds value being swapped
    int i, j; //i for the outer loop, j for the inner loop;
    
    for(i = 1; i < array.length; i++){
      key = array[i];
      j=i-1;
    while(j >= 0 && key < array[j]) { 
        swap = array[j];
        array[j] = array[j + 1];
        array[j+1] = swap;
        j--;
      }
    }
  return array;
 }
}
