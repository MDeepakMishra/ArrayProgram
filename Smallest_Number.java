public class Smallest_Number {
  public static void main(String[] args) {
    System.out.println("FIND MALLEST NUMBER FROM AN ARRAY");
    int a [] = {4, 9 , 1 , 8 , 7 , 2};
    int min = a[0];
    for( int i = 0 ; i <a.length ; i++){
       if(a[i] < min){
        min = a[i];
        }         
    }
   System.out.println(min);
  }   
}
