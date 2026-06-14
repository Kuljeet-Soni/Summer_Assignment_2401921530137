package WEEK_2.Day_3;

import java.util.Scanner;

public class question_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        sc.close();
        System.out.print(repeated_substring_pattern(s));
}
    public static boolean repeated_substring_pattern(String s){
        int n= s.length();
        int[] lps=new int[n];
        int len=0;
        int i=1;
        // BUILD LPS ARRAY
        while(i<n){
            if(s.charAt(i)==s.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }else{
                if(len!=0){
                    len=lps[len-1];
                }
                else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        int lastLPS= lps[n-1];
        //CHECK IF STRING IS MADE BY REPEATING A SUBSTRING
        return lastLPS >0 && n%(n-lastLPS) ==0; 
        // (N-LASTLPS) --> REPEATED SUBSTRING KI LENGTH FIND KREGA!!!
        // % --> CHECK KREGA WOH PART PURI STRING KO BNA SKTA HAI YA NHI
    }
}
