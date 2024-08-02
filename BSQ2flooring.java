package com.Questions;

public class BSQ2flooring {
    public static void main(String[] args) {
        int[] arr = { 2 , 12, 25, 56, 60 , 67, 79, 90};
        int target = 1 ;
        int ans = sea(arr , target);
        System.out.println(ans);
    }
    static int sea(int[] arr , int target){
        if(target < arr[0]){
            return -1 ;
        }
        int start = 0 ;
        int end = arr.length - 1 ;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }

        }return end ;
    }
}

