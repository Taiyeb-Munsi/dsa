package sorting;

import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        int[] mainArr = new int[6];
        Random r = new Random();
        
        System.out.printf("Original array : ");
        for(int i=0;i<mainArr.length;++i) {
            i = r.nextInt(20);
            System.out.printf("%d ", i);
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
        boolean swapped;

        for(int i=0;i<arr.length - 1;++i) {
            swapped = false;
            for(int j=0;j<(arr.length - i - 1);++j) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }

            if(!swapped) {
                break;
            }
        }
    }
}
