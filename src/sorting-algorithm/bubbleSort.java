import java.util.Random;

public class bubbleSort {
    public static int[] sort(int[] arr) {
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

        return arr;
    }

    public static void main(String[] args) {
        int[] mainArr = new int[25];
        Random r = new Random();
        
        System.out.printf("Original array : ");
        for(int i=0;i<mainArr.length;++i) {
            mainArr[i] = r.nextInt(100);
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
