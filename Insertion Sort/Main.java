public class Main {
  
  public static void main(String[] args) {
    
    int[] array = {5,1,2,6,9,3,4,7,8};
    
    InsertionSort.insertionSort(array);
    
    for(int i=0; i <= array.length - 1; i++){
      System.out.print(array[i] + " ");
   }
  }
}