package com.konbil;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner in = new Scanner(System.in);

        for(int row = 0; row<arr.length;row++){
            for(int col=0; col<arr[row].length;col++)
            {
                arr[row][col] = in.nextInt();
            }

        }


//        int[][] arr = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//// output
//        for(int row = 0; row<arr.length;row++){
//            System.out.print("[");
//            for(int col=0; col<arr[row].length;col++)
//            {
//                System.out.print(arr[row][col]+",");
//            }
//            System.out.print("]");
//        }

        //Output

//        for(int row = 0; row<arr.length;row++){
//
//            System.out.println(Arrays.toString(arr[row]));
//        }

        //Enhanced for loop
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
