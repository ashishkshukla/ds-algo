package practice;

import java.util.*;
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class StringPalindrome {
    public static void main(String args[] ) throws Exception {
       
     String input="xbccbabba";
       longestPalindrome(input);

    }
    
    static void longestPalindrome(String inputString){
        int tableLength=inputString.length();
        int palindromeLength=0;
        String palindromeString="";
        for(int i=1;i<tableLength;i++){
            for(int j=0;j<=tableLength-i;j++){
                boolean isPalindrome=true;
                String checkSubString=inputString.substring(0,j)+
                inputString.substring(j+i,tableLength);
                int start=0;
                int end=checkSubString.length()-1;
                while(start< end){
                    if(checkSubString.charAt(start)!=checkSubString.charAt(end)){
                        isPalindrome=false;
                        break;
                    }
                    start++;
                    end--;
                }
                
                if(isPalindrome ){
                    if(checkSubString.length() > palindromeLength){
                        palindromeString =checkSubString;
                        palindromeLength=checkSubString.length();
                        System.out.println(palindromeString);
                    }
                    if(checkSubString.length() == palindromeLength){
                        if(palindromeString.compareTo(checkSubString)>0)
                        palindromeString=checkSubString;
                    }
                }
            }
        }
        
        
    }
}
