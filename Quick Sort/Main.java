public class Main {
  
 public static void main(String[] args) {
  int[] arr = {1, 7, 9, 3, 2, 5, 6, 4, 8, 10};

  int high = arr.length - 1;
 
  quickSort(arr, 0, high);
  
  for(int i=0; i < arr.length - 1; i++){
    System.out.print(arr[i] + " ");
  }
 }
 
 /**
  * QuickSort Algorithm 
  */
 public static void quickSort(int[] arr, int lowerIndex, int higherIndex) {
  if (arr == null || arr.length == 0)
   return;
 
  //Find the pivot
  int mid = lowerIndex + (higherIndex - lowerIndex) / 2;
  int pivot = arr[mid];
  
  //Set the lower an upper index values
  int i = lowerIndex;
  int j = higherIndex;
  int swap;
  
  //Start quickSort
  while (i <= j) {
    //Compare lower index values to pivot
   while (arr[i] < pivot) {
    i++;
   }
   //Compare higher index values to pivot
   while (arr[j] > pivot) {
    j--;
   }
 
   //Swap elements
   if (i <= j) {
    swap = arr[i];
    arr[i] = arr[j];
    arr[j] = swap;
    i++;
    j--;
   }
  }
  
  //sort both sub-arrays
  if (lowerIndex < j)
   quickSort(arr, lowerIndex, j);
 
  if (higherIndex > i)
   quickSort(arr, i, higherIndex);
 }
}