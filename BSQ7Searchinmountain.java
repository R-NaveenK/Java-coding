package com.Questions;

public class BSQ7Searchinmountain {
    public static void main(String[] args) {
        int[] arr = {1,3,5,8,9,6,5,3,0};
        int target = 9 ;
        int ans = search(arr , target);
        System.out.println(ans);

    }
    static int search(int[] arr , int target){
        int peak = moun(arr) ;
        int firstry = bisc(arr,target,0,peak);
        if(firstry != -1){
            return firstry;
        }
        return bisc(arr,target,peak+1,arr.length-1);

    }
    static int moun(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid+1]) {
                end = mid;
            } else{
                start = mid + 1;
            }
        }
        return start;

    }
    static int bisc(int[] arr, int tar , int start , int end) {
        if(arr[start] < arr[end]) {

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
        }
        else{
            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (arr[mid] < tar) {
                    end = mid - 1;
                } else if (arr[mid] > tar) {
                    start = mid + 1;
                } else {
                    return (mid);
                }

            }

        }return -1;

    }
}
