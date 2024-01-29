package DAY8;

import java.util.Arrays;

public class Passingfns {
    public static void main(String[] args) {
        int[] nums={1,3,5,7,99};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

static void change(int[] nums){
    nums[3]=999;
}
}