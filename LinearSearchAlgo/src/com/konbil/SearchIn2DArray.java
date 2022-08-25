package com.konbil;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78,99,43, 59},
                {18, 12}
        };

        //search2d(arr, 919);
        System.out.println(max(arr));

    }

    static int search2d(int[][] arr, int target){
        if(arr == null){
            return -1;
        }

        for (int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] == target){
                    System.out.println(target);
                    return target;
                }
            }
        }
        System.out.println("Not found");
        return -1;
    }
//Find Max in 2D
    static int max(int[][] arr){
        if(arr == null){
            return -1;
        }
        int max = Integer.MIN_VALUE;

        for (int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }

        return max;
    }
}
