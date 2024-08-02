package com.Questions;

public class BSQ5infinitearray {
    public static void main(String[] args) {
        int[] arr = {2,3,6,8,9,10,15,19,20,25,29,31,35,39,45};
        int target = 39 ;
        System.out.println(ans(arr,target));

    }
    static int ans(int[] arr , int target){
        int start = 0 ;
        int end = 1 ;
        while(arr[end] < target){
            int temp = end + 1 ;
            end =end + (end - start + 1) * 2 ;
            start = temp ;
        }
        return(sea(arr , target , start , end));
    }
    static int sea(int[] arr , int target , int start , int end){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }

        }return -1 ;
    }

}
