package com.konbil;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr= {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        System.out.println(CeilingBs(arr, target));


    }
    static int CeilingBs(int arr[], int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];


        while (start <= end) {
//            find the middle element
//            int = (start + end) / 2;//might be possible that (start +end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;

                } else {
                    start = mid + 1;
                }

            }

            else {
                if (target > mid) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }


        }
        return arr[start];
    }
}
