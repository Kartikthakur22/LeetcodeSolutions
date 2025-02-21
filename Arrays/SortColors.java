/*
 Leetcode-75
 Given an array nums with n objects colored red, white, or blue, sort them in-place
 so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
 */
public class SortColors {
    public void sortColors(int[] arr) {
        int n=arr.length;
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){
            if(arr[mid]==0){    //arr[0 to low-1] contains 0
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1){    //arr[low to mid-1] contains 1
                mid++;
            }
            else{
                int temp=arr[mid];   //arr[high+1 to n-1] contains 2
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
    }
}
