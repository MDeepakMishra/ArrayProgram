public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = {12, 7, 9, 20, 5, 30};
        int even = 0, odd = 0;

        for (int i : arr) {
            if (i % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
