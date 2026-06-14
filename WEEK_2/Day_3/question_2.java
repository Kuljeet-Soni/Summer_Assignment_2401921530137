package WEEK_2.Day_3;

import java.util.Scanner;

public class question_2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String s= sc.next();
        String t= sc.next();
        sc.close(); 
        System.out.println(is_subsequence(s,t));
    }
    public static boolean is_subsequence(String s, String t){
        int i=0;
        int j=0;
        while(i<s.length()&&j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
        return i==s.length();
    }
    
}
