package com.konbil;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] arr = new int[5]; //creates the object in heap memory
        int[] no1 = {1,34,9,2,2};

        //Input using for loops
        System.out.print("Please enter the numbers:" );
        for(int i=0; i<arr.length; i++) {

          arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));

//        for(int i=0; i<arr.length; i++) { //for every element in array, print the element
//            System.out.print(arr[i] + "  " );
//        }

//        for(int num : arr){
//            System.out.print(num + " ");
//        }
    }
}
