package java_basic.Sorting;

public class Insertion_Sort {
    public static void PrintArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 4, 6, 5, 7};

        for (int i = 1;i< arr.length; i++){
            int current = arr[i];
            int j = i-1;
            while ( j>=0 && arr[j]>current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = current;
            }
        PrintArray(arr);
        }


}
