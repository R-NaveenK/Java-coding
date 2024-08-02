package com.Questions;

public class BSQ1celling {
    public static void main(String[] args) {
        int[] arr = {-1 , 2 , 12, 25, 56, 60 , 67, 79, 90};
        int target = 99 ;
        int ans = sea(arr , target);
        System.out.println(ans);
    }
    static int sea(int[] arr , int target){
        if(target > arr[arr.length - 1]){
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

        }return start ;
    }
}
