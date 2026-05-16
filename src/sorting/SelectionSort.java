package sorting;

import java.util.Random;

public class SelectionSort {
    public static int[] sort(int[] arr) {
        for(int i=0;i<arr.length-1;++i) {
            int curr = i;
            for(int j=i+1;j<arr.length;++j) {
                if(arr[j] < arr[curr]) {
                    curr = j;
                }
            }

            if(curr != i) {
                int temp = arr[i];
                arr[i] = arr[curr];
                arr[curr] = temp;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] mainArr = new int[5];
        Random r = new Random();
        
        System.out.printf("Original array : ");
        for(int i=0;i<mainArr.length;++i) {
            mainArr[i] = r.nextInt(100) + 1;
            System.out.printf("%d ", mainArr[i]);
        }

        System.out.println();

        System.out.printf("Sorted array   : ");
        mainArr = sort(mainArr);

        for(int i=0;i<mainArr.length;++i) {
            System.out.printf("%d ", mainArr[i]);
        }

        System.out.println();
    }
}
