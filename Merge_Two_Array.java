public class Merge_Two_Array {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        int[] merged = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++)
            merged[i] = arr1[i];

        for (int i = 0; i < arr2.length; i++)
            merged[arr1.length + i] = arr2[i];

        System.out.print("Merged Array: ");
        for (int i : merged)
            System.out.print(i + " ");
    }
}
