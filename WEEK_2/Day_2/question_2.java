package WEEK_2.Day_2;

import java.util.Scanner;

public class question_2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String s1 = sc.next();
        String s2= sc.next();
        sc.close();
        System.out.println(is_available(s1,s2));
    }
    public static boolean is_available(String s1, String s2){
        if(s1.length()> s2.length()){
            return false;
        }
        int[] s1count = new int[26];
        int[] window = new int[26];

        // COUNT FREQUENCIES OF S1
        for(int i=0; i<s1.length(); i++){
             s1count[s1.charAt(i)-'a']++;
             window[s2.charAt(i)-'a']++;
        }
        // CHECK FIRST WINDOW
        if (matches(s1count,window)){
            return true;
        }
        // SLIDING WINDOW
        for(int r=s1.length(); r<s2.length(); r++){
        window[s2.charAt(r)-'a']++;
        int l = r-s1.length();
        window[s2.charAt(l)-'a']--;
        if(matches(s1count,window)){
            return true;
        }
    }
    return false;
}
private static boolean matches(int[] a, int[] b){
    for(int i=0; i<26;i++){
        if(a[i] != b[i]){
        return false;
    }
}
    return true;
}
}