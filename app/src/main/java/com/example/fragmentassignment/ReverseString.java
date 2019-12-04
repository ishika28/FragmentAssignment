package com.example.fragmentassignment;

public class ReverseString {

    public static String reverseString(String value){

        StringBuilder sb = new StringBuilder(value);
        String result = sb.reverse().toString();
        return result;
    }
}


