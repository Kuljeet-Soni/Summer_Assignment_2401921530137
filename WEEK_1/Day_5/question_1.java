package WEEK_1.Day_5;
import java.util.Scanner;
public class question_1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        System.out.println(Palindrome(s));
        sc.close();
    }
    
    public static boolean Palindrome(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++ ;
            }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right --;
            }
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++ ;
            right-- ;
        }
        return true;
    }
    
}
