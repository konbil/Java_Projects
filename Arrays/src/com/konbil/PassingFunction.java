package com.konbil;

import java.util.Arrays;

public class PassingFunction {
    public static void main(String[] args) {
        int[] nums = {3, 6, 12, 8};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void change(int[] arr){
        arr[0] = 99;
    }
}
