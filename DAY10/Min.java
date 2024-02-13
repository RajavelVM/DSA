package DAY10;

public class Min {
    public static void main(String[] args) {
        int arr[]={1,3,5,7,9,8,34,56,78,999};
        System.out.println(min(arr));
    }


static int min(int[] arr){
    int ans=arr[0];
    for (int i=1;i<arr.length;i++){
        if (arr[i]<ans) {
            ans=arr[i];
        }
        
    }
    return ans;
}
}