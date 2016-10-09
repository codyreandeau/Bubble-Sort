public class Main {
  
  public static void main(String[] args) {
    
    int[] array = {4,65,9,21,1,8,12,45,32,17};
    
    SelectionSort.selectionSort(array);
    
    for(int i=0; i < array.length; i++){
      System.out.print(array[i] + " ");
    }
  }
}