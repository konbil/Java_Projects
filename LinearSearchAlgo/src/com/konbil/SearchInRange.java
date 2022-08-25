package com.konbil;

public class SearchInRange {
    public static void main(String[] args) {

        int[] arr = {18, 12, 23, 45, 67,24,3,90};
        System.out.println(linearSearch(arr, 455, 1, 5));

    }
    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {

            return -1;
        }

//         run a for loop
        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if (element == target) {
                System.out.println("Found");
                return element;
            }
        }
        System.out.println("Not found in the array");
        return -1;
    }
}
