// Time Complexity :O(n) with less comparissions
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// code along with comments explaining the approach:
// So we check pairs of numbers in the array and then greater is compared with global max and
// smaller is compared with the global min.

class GFG {

    public static void main (int[] arr){
        int n,max,min;
        n = arr.length;
        max=arr[0];
        min=arr[0];
        for(int i=0;i<n;i=i+2){
            if(i==n-1){
                if(arr[i]>max) max=arr[i];
                if(arr[i]<min) min=arr[i];
            }
            else if(arr[i]>arr[i+1]){
                if(arr[i]>max) max=arr[i];
                if(arr[i+1]<min) min=arr[i+1];
            }
            else{
                if(arr[i+1]>max) max=arr[i+1];
                if(arr[i]<min) min=arr[i];

            }
        }
    }
}