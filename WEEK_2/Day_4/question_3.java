package WEEK_2.Day_4;

import java.util.*;

public class question_3 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.print(generateParanthesis(n));
    }
    public static List<String> generateParanthesis(int n){
        List<String> ans=new ArrayList<>();
        generate("",0,0,n,ans);
        return ans;
    }
    public static void generate(String str, int open, int close, int n, List<String> ans){
        // BASE CASE
        if(str.length()==2*n){
            ans.add(str);
            return;
        }
        //ADD '(' IF POSSIBLE
        if(open<n){
            generate(str + "(", open+1, close,n,ans);
        }
        //ADD ')' IF POSSIBLE
        if(close<open){
            generate(str+ ")", open,close+1 ,n,ans);
        }
    }
}
