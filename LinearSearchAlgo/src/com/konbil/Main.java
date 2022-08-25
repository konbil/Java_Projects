package com.konbil;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = {21,53,2,5,6,7,4,6,3,43,665,243};
        int target = 76;
        int ans = linearSearch(nums, target);

        }

        static int linearSearch(int[] arr, int target) {
            if (arr.length == 0) {

                return -1;
            }

//         run a for loop
            for (int index = 0; index < arr.length; index++) {
                int element = arr[index];
                if (element == target) {
                    System.out.println("Found");
                    return index;
                }
            }
            System.out.println("Not found in the array");
            return -1;
        }
}
