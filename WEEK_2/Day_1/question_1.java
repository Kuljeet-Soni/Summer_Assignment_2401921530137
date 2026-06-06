package WEEK_2.Day_1;
import java.util.Scanner;
public class question_1 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        sc.close();
        System.out.println(Anagram( s, t));
    }
    public static boolean Anagram(String s, String t){
        if(s.length()!= t.length()){
            return false;
        }
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i) -'a']++;
            freq[t.charAt(i) -'a']--;
        }
        for (int count:freq){
            if(count!=0){
                return false;
            }
        }
        return true;
    }
    
}
