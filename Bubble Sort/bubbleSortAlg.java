public class bubbleSortAlg {
  
  /** 
   * Bubble sort algorithm method in asscending order
   */
  public static void bubbleSortA(int[] array){
    
    int lastPosition; //Holds the last position in the array
    int index; //Holds the index element to compare
    int temp; //temp variable used to swap elements
    
    //Outer for loop sets lastPosition to hold the last position in the array
    //This loop will execute until the lastPosition is greater than or equal to zero
    for(lastPosition = array.length - 1; lastPosition >= 0; lastPosition--) {
      //Inner for loop goes through each element in the array
      for(index = 0; index <= lastPosition - 1; index++) {
        //Compares two elements next to each other in the array
        if(array[index] > array[index + 1]) {
          //Swap the elements
          temp = array[index];
          array[index] = array[index + 1];
          array[index + 1] = temp;
        }
      }
    }
  }
  
 /** 
   * Bubble sort algorithm method in descending order
   */
  public static void bubbleSortB(int[] array){
    
    int lastPosition; //Holds the last position in the array
    int index; //Holds the index element to compare
    int temp; //temp variable used to swap elements
    
    //Outer for loop sets lastPosition to hold the last position in the array
    //This loop will execute until the lastPosition is greater than or equal to zero
    for(lastPosition = array.length - 1; lastPosition >= 0; lastPosition--) {
      //Inner for loop goes through each element in the array
      for(index = 0; index <= lastPosition - 1; index++) {
        //Compares two elements next to each other in the array
        if(array[index] < array[index + 1]) {
          //Swap the elements
          temp = array[index];
          array[index] = array[index + 1];
          array[index + 1] = temp;
        }
      }
    }
  }
}