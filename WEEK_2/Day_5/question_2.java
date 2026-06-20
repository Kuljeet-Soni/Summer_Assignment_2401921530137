package WEEK_2.Day_5;

import java.util.Scanner;

public class question_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        char[] chars = s.toCharArray();
        sc.close();
        //System.out.print(compress(chars));
         int len = compress(chars);

    System.out.println("Length = " + len);

    System.out.print("Compressed Array = ");
    for (int i = 0; i < len; i++) {
        System.out.print(chars[i]+ " ");
    }
}
    public static int compress(char[] chars){
        int index=0;
        int i=0;
        while(i<chars.length){
        char current= chars[i];
        int count=0;
        while(i<chars.length && chars[i] == current){
            count ++;
            i++;
        }
        chars[index++] = current;
        if(count > 1){
            String num= Integer.toString(count);
            for (char c: num.toCharArray()){
                chars[index++]= c;
            }
        }
        
    } 
    return index;
    
}
}