package com.Questions;

public class BSQ8RotatedArray {
    public static void main(String[] args) {
        int[] arr = {9,2,1};
        int target = 2;
        System.out.println(search(arr , target));

    }
    static int search(int[] arr , int target){
        int peak = pivot(arr) ;
        int firstry = bisc(arr,target,0,peak);
        if(firstry != -1){
            return firstry;
        }
        return bisc(arr,target,peak+1,arr.length-1);
    }
    static int pivot(int[] arr) {
        for (int i = 0; i < arr.length -1; i++) {
            if(arr[i]>arr[i+1]){
                return i ;
            }

        }return -1 ;
    }
    static int bisc(int[] arr, int tar , int start , int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > tar) {
                end = mid - 1;
            } else if (arr[mid] < tar) {
                start = mid + 1;
            } else {
                return (mid);
            }
        }
        return -1;

    }
}
