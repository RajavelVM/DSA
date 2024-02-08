package DAY9;

public class Searchinrange {
    public static void main(String[] args) {
        int[]arr={1,3,5,7,9,2,4,6};
        int target=9;
        System.out.println(linearsearch(arr,target,1,5));
    }
    static int linearsearch(int[]arr,int target,int start,int end){
        if (arr.length==0){
            return -1;
        }
        for (int i=start;i<=end;i++) {
            int element=arr[i];
            if (element==target){
                return i;
            }
          
            
        }
        return -1;

    }
}
