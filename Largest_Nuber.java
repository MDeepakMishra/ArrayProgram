public class Largest_Nuber {
    public static void main(String[] args) {
        System.out.println("FIND LARGEST NUMBER FROM AN ARRAY");
        int a [] = {4, 9 , 1 , 8 , 7 , 2};
        int max = a[0];
        for( int i = 0 ; i <a.length ; i++){
           if(a[i] > max){
            max = a[i];
            }         
        }
       System.out.println(max);
      }   
}
