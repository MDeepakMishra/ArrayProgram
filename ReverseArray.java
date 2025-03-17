public class ReverseArray {
     public static void main(String[] args) {
        System.out.println("ARRAY REVERSE");
        System.out.println("ORIGINAL ARRAY ELEMENTS");
        int a[] ={1 , 2, 3, 4};
        int n = a.length;
        for(int i = 0 ; i < a.length ; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("REVERSE ARRAY ELEMENTS");
        for(int  i = n -1 ; i >= 0 ; i--)
        {
            System.out.print(a[i] + " ");
        }
     }
}
