package sorting;

import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        int[] mainArr = new int[6];
        Random r = new Random();
        
        System.out.printf("Original array : ");
        for(int i=0;i<mainArr.length;++i) {
            mainArr[i] = r.nextInt(20);
            System.out.printf("%d ", mainArr[i]);
        }

        System.out.println();

        System.out.printf("Sorted array   : ");
        sort(mainArr);

        for(int i : mainArr) {
            System.out.printf("%d ", i);
        }

        System.out.println();
    }

    public static void sort(int[] arr) {
        if(arr.length <= 1) return;

        int leftSize = arr.length/2;
        int rightSize = arr.length - leftSize;

        int[] leftArr = new int[leftSize];
        int[] rightArr = new int[rightSize];

        for(int i = 0; i < arr.length; ++i) {
            if(i < leftSize) {
                leftArr[i] = arr[i];
            }
            else {
                rightArr[i - leftSize] = arr[i];
            }
        }

        sort(leftArr);
        sort(rightArr);
        merge(leftArr, rightArr, arr);
    } 

    public static void merge(int[] arr1, int[] arr2, int[] arr) {
        int i = 0, j = 0, k = 0;
        
        while(i < arr1.length && j < arr2.length) {
            if(arr1[i] < arr2[j]) {
                arr[k++] = arr1[i++];
            } else {
                arr[k++] = arr2[j++];
            }
        }
        
        while(i < arr1.length) {
            arr[k++] = arr1[i++];
        }
        
        while(j < arr2.length) {
            arr[k++] = arr2[j++];
        }
    }
}
