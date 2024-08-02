package com.Questions;

import java.util.Arrays;

public class BSin2DQ1RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        System.out.println(Arrays.toString(search(arr,37)));
    }
    static int[] search(int[][] mat , int target){
        int r = 0 ;
        int c = mat.length - 1 ;

        while(r < mat.length && c >= 0){
            if(target == mat[r][c]){
                return new int[]{r,c};
            }else if(mat[r][c] < target){
                r++;
            }else{
                c--;
            }
        }   
        return new int[]{-1, -1};
    }
}
