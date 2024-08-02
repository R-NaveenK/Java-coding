package com.Questions;

public class BSQ4firstandlastposition {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 7, 7, 8, 8, 9};
        int tar = 8;
        int[] an = {-1, -1};
        an[0] = bsear(arr, tar, true);
        an[1] = bsear(arr, tar, false);
        for (int i : an) {
            System.out.print    (i + " ");
        }


    }

    static int bsear(int[] arr, int tar, boolean feposi) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < tar) {
                start = mid + 1;
            } else if (arr[mid] > tar) {
                end = mid - 1;
            } else {
                ans = mid;
                if (feposi) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return ans;


    }
}