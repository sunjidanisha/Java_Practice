package java_basic.Sorting;

import java.util.Arrays;

public class Merge_Sort {
    public static void merge(int arr[],int start ,int mid, int end) {
        int n1 = mid - start+1;
        int n2 = end - mid;

         // temporary array
        int[] L = new int[n1];
        int[] R = new int[n2];

        //copying left side
        for (int i= 0; i<n1;i++)
            L[i] =arr[start+i];

        //copying Right side
        for (int j= 0; j<n2;j++)
            R[j] =arr[mid+1+j];

        // start merge
        int i =0,j= 0, k =start;

        //copying main elements

        while (i<n1 && j<n2) {
            if (L[i] <= R[j]) {
                 arr[k]= L[i] ;
                i++;
            } else {
                arr[k]= R[j] ;
                j++;
            }
            k++;
        }

            //copying existing elements
            while (i < n1) {
                arr[k] = L[i]  ;
                i++;
                k++;
            }
            while (j < n2) {
                arr[k] = L[j]  ;
                j++;
                k++;
            }

    }
           //mergesort Recursion method applied
            public static void mergeSort(int arr[], int start, int end) {
                if (start < end) {
                    int mid = (start + end) / 2;

                    mergeSort(arr, start, mid);
                    mergeSort(arr, mid + 1, end);

                    merge(arr, start, mid, end);
                }
            }
                    public static void main(String[] args) {
                        int[] arr = {38, 27, 43, 3, 9, 82, 10};

                        //
                        mergeSort(arr, 0, arr.length - 1);

                        System.out.println("Sorted array: " + Arrays.toString(arr));
                    }
                }




