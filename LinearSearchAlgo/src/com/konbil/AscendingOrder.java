package com.konbil;
//https://uncareer.net/vacancy/data-clerk-g4-466860
public class AscendingOrder {
    public static void main(String[] args) {
        int[] nums= {12,1,5,99,23,54,7};
       ArrangeInAscendingOrder(nums);
    }

    static int ArrangeInAscendingOrder(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int temp;
        for(int i = 0; i < arr.length; i++){
           for(int j=i+1; j < arr.length; j++){
               if(arr[i] > arr[j]){
                   temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;}

               }

           }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");

        }

        System.out.println("");
       return -1;
    }
}
