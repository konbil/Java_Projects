package com.konbil;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45};
        int target = 4;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
	// write your code here
    }

    //rerurn the index
    //return -1 if it doesn't exist
    static int binarySearch(int arr[], int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
//            find the middle element
//            int = (start + end) / 2;//might be possible that (start +end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid -1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }
            else {
                //ans found
                return mid;
            }
        }
        return -1;
    }
}
