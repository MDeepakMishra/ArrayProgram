import java.util.Scanner;

public class SearchElemen {
    public static void main(String[] args) {
        System.out.println("SEARCH ELEMENTS WHICH IS PRESENT OR NOT IN AN EXIST ARRAY");
        int[] a = {11, 22, 33, 44, 55};
        System.out.println("ENTER NUM TO BE SEARCH");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for( int i = 0 ; i < a.length ; i++){
            if(n == i){
                System.out.println("YES GIVEN NUM IS PRESENT IN THIS ARRAY");
                System.out.println("INDEX OF AN SEARCHED ARRAY" + " " + i);
            }
        }
    }
}
