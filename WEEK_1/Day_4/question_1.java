package WEEK_1.Day_4;
import java.util.Scanner;
public class question_1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][]num=new int[r][c];
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[0].length;j++){
                num[i][j]=sc.nextInt();
            }
        }
        sc.close();
        if(r!=c){
            System.out.println("Not a Square matrix");
            return;
        }
        diagonal_sum(num);
    }
    public static void diagonal_sum(int[][]arr){
        int n= arr.length;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            
        sum = sum+arr[i][i];
        sum= sum+arr[i][n-1-i];
    }

    if(n%2==1){
        sum=sum-arr[n/2][n/2];
    }
    System.out.println(sum);
    
    }
}
