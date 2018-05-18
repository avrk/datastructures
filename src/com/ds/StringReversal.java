package com.ds;

/**
 * Created by Ravi on 5/17/18.
 */

/**
 * Input "Abc Htr lju ytu rtm"
 * Output "rtm ytu lju Htr Abc"
 *
 * Step1: reverse the entire string
 *        "mtr uty ujl rtH cbA"
 *
 * Step2: reverse each individual word
 *        "rtm ytu lju Htr Abc"
 *
 * */

public class StringReversal {

    private static String reverseit(String str){
        char[] charArray = str.toCharArray();

        for(int i = 0, j=charArray.length-1; i <= j; i++ , j--){
            char tmp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = tmp;
        }
        return new String(charArray);
    }

    private static void reverseCharacters(char[] charArray, int start, int end){
        for(int i = start, j=end; i <= j; i++ , j--){
            char tmp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = tmp;
        }
    }

    public static void main(String args[]){
        StringReversal tst = new StringReversal();
        String input = "Abc Htr lju ytu rtm";
        char[] charArray = input.toCharArray();
        tst.reverseCharacters(charArray, 0, charArray.length-1);
        int currentWordStartingIndex = 0;
        for(int i=0; i <= charArray.length; i++){
            if(i == charArray.length || charArray[i] == ' '){
                tst.reverseCharacters(charArray, currentWordStartingIndex, i-1);
                currentWordStartingIndex = i+1;
            }
        }
        System.out.println(charArray);
    }
}
