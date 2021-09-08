//create a function that reverses a string:
//"Hi my name is Jalen" should be:
//"nelaJ si eman ym iH"


import java.lang.reflect.Array;
import java.util.Arrays;

import java.lang.StringBuilder;

public class ReverseAString {
    public static void main(String[] args){

        String sentence = "Hi my name is Jalen";

        System.out.println(sentence);
        System.out.print("First reverse method:  ");
        reverse(sentence);
        System.out.println("----------------");
        System.out.println("Second reverse method: " + sentence);
        System.out.print(reverse2(sentence));
    }
    
    //first reverse String method where a char array is used to reverse the string
    public static void reverse(String str){
        char[] rString = str.toCharArray();

        for(int i = str.length() - 1; i >= 0; i--){
            System.out.print(rString[i]);
        }

    }

    //second reverse String method where the string is reversed using the charAt() function
    public static String reverse2(String str){
        String result = "";

        for(int i = str.length() - 1; i >= 0; i--){
            result += str.charAt(i);
        }
        return result;
    }

    //Reversing a string using StringBuilder
    public static String reverseWithStringBuilder(String str){
        String newStr = new StringBuilder(str).reverse().toString();
        return newStr;
    }

}
