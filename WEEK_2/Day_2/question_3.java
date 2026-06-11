package WEEK_2.Day_2;

import java.util.*;

public class question_3 {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        String s= sc.next();
        String p= sc.next();
        sc.close();
        System.out.println(Anagrams_indicies(s,p));
    }
    public static List<Integer> Anagrams_indicies(String s, String p){
        List<Integer> ans = new ArrayList<>();
        if (p.length()>s.length()){
            return ans;
        }
        int[] p_count= new int[26];
        int[] window = new int[26];
        // BUILD FREQUENCY ARRAYS
        for (int i=0; i<p.length(); i++){
            p_count[p.charAt(i)-'a']++;
            window[s.charAt(i)-'a']++;
        }
        // CHECK FIRST WINDOW
        if (matches(p_count,window)){
            ans.add(0);       
        }
        // SLIDING WINDOW
        for(int r= p.length(); r<s.length(); r++){
            window[s.charAt(r)-'a']++;
            int l=r-p.length();
            window[s.charAt(l)-'a']--;
            if (matches(p_count,window)){
                ans.add(l+1);
            }
        }
        return ans;
    }
    private static boolean matches(int [] a, int [] b){
        for (int i=0; i<26; i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }
    
}
