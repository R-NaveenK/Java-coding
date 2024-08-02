package com.Questions;

public class BSQ9Rotationcount {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8};
        int ans = pivot(arr);
        System.out.println(ans + 1);

    }
    static int pivot(int[] arr) {
        for (int i = 0; i < arr.length -1; i++) {
            if(arr[i]>arr[i+1]){
                return i ;
            }

        }return -1 ;
    }
}
