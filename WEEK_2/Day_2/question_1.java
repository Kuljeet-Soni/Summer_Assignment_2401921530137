package WEEK_2.Day_2;

import java.util.*;

public class question_1 {
     public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String s= sc.next();
        sc.close();
        System.out.println(length_of_longestSubstring(s));
     }
     public static int length_of_longestSubstring(String s){
        HashSet<Character> set= new HashSet<>();
        int left=0;
        int maxlen=0;
        for(int right=0; right<s.length();right++){
            char ch= s.charAt(right);
            while (set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            maxlen=Math.max(maxlen, right-left+1);
        }
        return maxlen;
     }
     
    
}
