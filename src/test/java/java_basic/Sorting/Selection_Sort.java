package java_basic.Sorting;

public class Selection_Sort {
    public static void PrintArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 4, 6, 5, 7};


        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;


            }
        }
        //swap

        int sort = arr[smallest];
        arr[smallest] = arr[i];
        arr [i] = sort;
    }
        PrintArray(arr);
   }

}
