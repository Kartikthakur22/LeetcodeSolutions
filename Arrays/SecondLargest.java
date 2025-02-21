/*
 GFG
 Find second largest element in array.
 */
class SecondLargest{
    public static int secondLargest(int[] arr, int n){
        if(n<2){
            return -1;
        }
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            if (arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest=arr[i];
            }
        }
        return secondLargest;
    }
}