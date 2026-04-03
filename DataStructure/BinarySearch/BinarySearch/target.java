public class target {

    public static int binarySearch(int[] arr, int tar) {
        int st = 0;
        int end = arr.length - 1;

        while (st <= end) {
            int mid = (st + end) / 2;

            if (tar > arr[mid]) {
                st = mid + 1;
            } else if (tar < arr[mid]) {
                end = mid - 1;
            } else {
                return mid; // target found
            }
        }
        return -1; // target not found
    }

    public static void main(String[] args) {
        int[] arr1 = {-1, 0, 3, 4, 5, 9, 12}; // odd
        int tar1 = 12;
        System.out.println(binarySearch(arr1, tar1));

        int[] arr2 = {-1, 0, 3, 5, 9, 12}; // even
        int tar2 = 0;
        System.out.println(binarySearch(arr2, tar2));
    }
}