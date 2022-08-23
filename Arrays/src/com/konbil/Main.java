package com.konbil;

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

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + "  " );
        }
    }
}
