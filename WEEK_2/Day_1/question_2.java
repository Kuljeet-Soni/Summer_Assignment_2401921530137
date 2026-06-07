package WEEK_2.Day_1;
import java.util.Scanner;
public class question_2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        System.out.println(first_unique_char(s));
}
    public static int first_unique_char(String s){
        int[]freq= new int[26];
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0; i<s.length();i++){
            if(freq[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
}
