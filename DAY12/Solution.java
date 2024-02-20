package DAY12;

//Leetcode problem 34 
//By using 2 binary search we are finding the lowest and highest index of the key value in a sorted array

public class Solution {
    
        public int[] searchRange(int[] nums, int target) {
            int l=0 ,h=nums.length-1,mid=0;
            int res[]={-1,-1};
    
            while (l<=h){
                mid=(l+h)/2;
    
                if(target==nums[mid]){
                    res[0]=mid;
                    h=mid-1;
                }else if (target<nums[mid]){
                    h=mid-1;
                }else{
                    l=mid+1;
                }
            } 
            l=0;
            h=nums.length-1;
            mid=0;
             while (l<=h){
                mid=(l+h)/2;
    
                if(target==nums[mid]){
                    res[1]=mid;
                    l=mid+1;
                }else if (target<nums[mid]){
                    h=mid-1;
                }else{
                    l=mid+1;
                }
    
            
        }
        return res;
    }
    }

