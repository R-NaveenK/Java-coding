package com.Questions;
public class BSQ3Smallestnumber {
    public static void main(String[] args) {
        char[] arr = {'c' , 'g' , 'j'};
        char target = 'k' ;
        char ans = (char) sea(arr , target);
        System.out.println(ans);
    }
    static int sea(char[] letter , char target){
        int start = 0 ;
        int end = letter.length - 1 ;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if (letter[mid] > target) {
                end = mid - 1;
            }else {
                start = mid + 1;
            }

        }return letter[start % letter.length] ;
    }
}



