package DAY11;

//leetcode problem number 744 (ceiling)//

public class Solution {
    public char NextGreatestletter(char[]letters,char target){
        int start=0;
        int end=letters.length-1;

        while (start<=end) {
            int mid=start+(end-start)/2;

            if (start<letters[mid]) {
                end=mid-1;  
            }else{
                start=start+1;
            }
            
        }
        return letters[start%letters.length];

    }
}
