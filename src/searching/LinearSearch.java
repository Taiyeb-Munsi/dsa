package searching;

public class LinearSearch {
    static int linearsearch(int[] arr, int key) {
        for(int i=0;i<arr.length;++i) {
            if(arr[i] == key) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] list = {42, 7, 19, 88, 5, 33, 71, 12, 11, 42, 9, 24, 0, 3};
        int target = 11;

        int result = linearsearch(list, target);

        if(result == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Found at index : " + result);
        }
    }
}
