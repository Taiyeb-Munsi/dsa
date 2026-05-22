package sorting;

import java.util.Random;

public class MergeSortModified {
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

    public static void sort(int[] arr, int low, int high) {
        if(low >= high) return;

        int mid = low + (high - low) / 2;

        sort(arr, low, mid);
        sort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    } 

    public static void merge(int[] arr, int low, int mid, int high) {
        int start1 = low;
        int start2 = mid + 1;

        if(arr[mid] <= arr[start2]) {
            return;
        }

        while(start1 <= mid && start2 <= high) {
            if(arr[start1] <= arr[start2]) {
                ++start1;
            }
            else {
                int temp = arr[start2];
                int index = start2;

                while(index > start1) {
                    arr[index] = arr[index - 1];
                    --index;
                }

                arr[start1] = temp;

                ++start1;
                ++mid;
                ++start2;
            }
        }
    }
}
