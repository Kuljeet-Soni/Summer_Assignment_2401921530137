package WEEK_1.Day_5;
import java.util.Scanner;
public class question_2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String s= sc.next ();
        sc.close();
        reverse(s);
    }
    public static void reverse(String s){
        char[] arr = s.toCharArray();
        int left=0;
        int right=s.length()-1;
        while(left<right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(new String(arr));
    }
}
