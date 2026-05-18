package sorting;

import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {
        int[] mainArr = new int[5];
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
        for(int i=1;i<arr.length;++i) {
            int temp = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > temp) {
                arr[j+1] = arr[j];
                --j;
            }
            arr[j+1] = temp;
        }
    } 
}
