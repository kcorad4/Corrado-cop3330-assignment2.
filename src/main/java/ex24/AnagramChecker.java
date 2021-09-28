package ex24;

import java.util.Scanner;
import java.util.*;

public class AnagramChecker {

    static boolean isAnagram(String str1, String str2)
    {
        //remove all spaces
        String s1 = str1.replaceAll("\\s", "");
        String s2 = str2.replaceAll("\\s", "");

        //set initial to true
        boolean status = true;

        //check if same length of letters
        if (s1.length() != s2.length()) {
            status = false;
        //if same length continue check
        } else {
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            status = Arrays.equals(ArrayS1, ArrayS2);
        }
        if (status) {
            return true;
        } else {
            return false;
        }
    }//end methode isAnagram


    public static void main(String[] args)
    {
        //create a scanner
        Scanner sc = new Scanner(System.in);

        //ask and store inputs
        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");
        System.out.println("Enter the first string:");
        String str1 = sc.nextLine();
        System.out.print("Enter the second string: ");
        String str2=sc.nextLine();

        //call the anagram checking function
        if(isAnagram(str1,str2))
            System.out.println(str1 + " and " + str2 + " are anagrams");
        else
            System.out.println(str2 + " and " + str2 + " are not anagrams");

    }//end main
}//end class AnagramChecker
