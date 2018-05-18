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

    public static void main(String args[]){
        StringReversal tst = new StringReversal();
        String input = "Abc Htr lju ytu rtm";
        System.out.println(tst.reverseit(input));
    }

}
