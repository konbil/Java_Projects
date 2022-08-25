package com.konbil;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {18, 12, 23, 45, 67,24,3,90};
        System.out.println(min(arr));
    }
//    assume arr.length != 0
//    return the min value in the array
    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
