public class SumOf_Array_Elements {
    public static void main(String[] args) {
        System.out.println("SUM OF ALL ELEMENTS");
        int sum = 0 ;
        int a [] = { 1 , 4, 9 , 8 , 9 , 2};
        for(int i = 0 ; i < a.length ; i++)
        {
           sum = sum + a[i];
        }
        System.out.print(sum);
    }
}
