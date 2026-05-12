public class BinarySearch {
    static int binarysearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        int mid;

        while(left < right) {
            mid = (right - left) / 2 + left;
            if(arr[mid] == key) {
                return mid;
            } else if(arr[mid] > key) {
                right = mid - 1;
            } else if(arr[mid] < key) {
                left = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 18, 20};
        int key = 15;

        int result = binarysearch(numbers, key);

        if(result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at : " + result);
        }
    }
}
