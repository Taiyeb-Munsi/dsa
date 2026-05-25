package sorting;

import java.util.Random;

public class QuickSort {
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
        sort(mainArr, 0, mainArr.length - 1);

        for(int i : mainArr) {
            System.out.printf("%d ", i);
        }

        System.out.println();
    }

    public static void sort(int[] arr, int start, int end) {
        if(start >= end) return;

        int j = start - 1;
        int pivot = arr[end];

        for(int i = start; i < end; ++i) {
            if(pivot >= arr[i]) swap(arr, ++j, i);
        }
        
        swap(arr, ++j, end);

        sort(arr, start, j - 1);
        sort(arr, j + 1, end);
    }

    public static void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}
