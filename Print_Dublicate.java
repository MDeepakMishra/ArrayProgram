public class Print_Dublicate {
    public static void main(String[] args) {
        System.out.println(" IN THIS PROGRAMM I WILL PRINT DUBLICATE NUMBER");
        int a []={0 , 1 , 8 , 5 , 9 , 0 , 1 ,5 , 6};
        System.out.println("ARRAY ELEMENTS");
        for(int i = 0 ; i < a.length ; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("DUBLCATE NUMBERS");
        for(int i = 0 ; i < a.length ; i++)
        {
            for(int j = i + 1 ; j < a.length ; j++){
                if( a[j] == a[i]){
                    System.out.print(a[i] + " ");
                }
            }
        }
    }
}
