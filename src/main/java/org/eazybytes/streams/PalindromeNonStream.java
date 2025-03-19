package org.eazybytes.streams;

public class PalindromeNonStream {

    public static void main(String[] args) {
        String str1="abba";

        String reverse="";

        for (int i=str1.length()-1;i>=0;i--){
            reverse=reverse+str1.charAt(i);

        }
        System.out.println(reverse);
        System.out.println(str1);
        System.out.println("palindrome or not ::" +reverse.equals(str1));
        System.out.println("The given String is Palindrome or not  :"+ isPalindrome(str1));


    }

    /*  This is the best approach called TWO POINTER TECHNIQUE*/
    public static boolean isPalindrome(String str){

        int left=0;
         int right=str.length()-1;

         while(left<right){
             if (str.charAt(left) != str.charAt(right)) {

                 return false;
             }
             left++;
             right--;
         }

        return true;
    }
}
