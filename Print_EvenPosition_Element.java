public class Print_EvenPosition_Element {

    public static void main(String[] args) {
        System.out.println("PRINT EVEN POSITTION ARRAY ELEMENTS");
        int a [] = { 1 , 4, 9 , 8 , 7 , 2};
        for(int i = 0 ; i < a.length ; i++)
        {
            if( i % 2 !=0)
            {
                System.out.println("INDEXNUMBER" + " " +  i + " " + "ARRAY ELEMENT" + " " + a[i]);
            }
        }
    }
}