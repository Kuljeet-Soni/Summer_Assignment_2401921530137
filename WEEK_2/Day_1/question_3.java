package WEEK_2.Day_1;

import java.util.Scanner;

public class question_3 {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        String ransomNote= sc.next();
        String magazine=sc.next();
        sc.close();
        System.out.println(can_construct(ransomNote,magazine));
    }
    public static boolean can_construct(String ransomNote, String magazine){
        int[] freq= new int[26];
        //COUNT FOR MAGAZINE
        for(int i=0; i<magazine.length(); i++){
            freq[magazine.charAt(i)-'a']++;
        }
        // use character for ransomnote
        for(int i=0; i<ransomNote.length(); i++){
        freq[ransomNote.charAt(i)-'a']--;
        if(freq[ransomNote.charAt(i)-'a']<0){
            return false;
        }
    }
    return true;
    }
    
}
