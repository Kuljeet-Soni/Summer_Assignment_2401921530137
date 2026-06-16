package WEEK_2.Day_4;

import java.util.Scanner;

public class question_1 {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    String s= sc.nextLine();
    sc.close();
    System.out.print(reverse_words(s));
    }
    public static String reverse_words(String s){
        // Base case
        if(s.length()==0){
            return "";
        }
        int space = s.indexOf(' ');
        // Last word
        if(space == -1){
            return reverse(s);
        }
        // First word
        String first= s.substring(0,space);
        // remaining sentence
        String rest= s.substring(space+1);
        return reverse(first)+" "+reverse_words(rest);
    }
    // recursive function to reverse one word
    public static String reverse(String s){
        if(s.length() <= 1){
            return s;
        }
        return reverse(s.substring(1))+ s.charAt(0);
    }
  
}
