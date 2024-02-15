package DAY11;
//Ascending order sorted array binary search//
public class Oabs {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,99,9999,99999};
        int target=99;
        int ans=orderagnosticBS(arr, target);
        System.out.println(ans);


    }

    static int orderagnosticBS(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}


