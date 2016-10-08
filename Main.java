public class Main {
  
  public static void main(String[] args) {
  
  int[] sort = {2,10,5,4,7,9,1,3,6,8};
  
  bubbleSortAlg.bubbleSortA(sort);
  
  for(int i=0; i <= sort.length - 1; i++){
    System.out.print(sort[i] + " ");
  }
  
  bubbleSortAlg.bubbleSortB(sort);
  
  System.out.println();
  
    for(int i=0; i <= sort.length - 1; i++){
    System.out.print(sort[i] + " ");
  }
  
  }
}