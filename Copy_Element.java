public class Copy_Element {

    public static void main(String[] args) {
        System.out.println("IN THIS PROGRAMM , I WIL COPY ALL THE ELEMENTS FROM ONE ARRAY TO TH ANOTHER ARRAY");
        System.out.println("BEFORE COPY ARRAY ELEMENTS");
        int a [] = { 1 , 4, 9 , 8 , 9 , 2};
        int b [] = new int[a.length];
        for(int i = 0 ; i < a.length ; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("AFTER COPY ARRAY ELEMENTS");
        for(int i = 0 ; i < a.length ; i++)
        {
            b[i] = a[i];
        }
        for(int i = 0 ; i < b.length ; i++)
        {
            System.out.print(b[i] + " ");
        }
    }
}