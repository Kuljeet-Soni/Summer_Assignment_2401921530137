package WEEK_1.Day_4;
import java.util.Scanner;
public class question_2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m= sc.nextInt();
        int n= sc.nextInt();
        int num[][]=new int[m][n];
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[0].length;j++){
                num[i][j]=sc.nextInt();
            }
        }
        int r=sc.nextInt();
        int c=sc.nextInt();
        sc.close();
        reshape(num, r, c);
    }
    public static void reshape(int[][]arr,int r,int c){
        int M=arr.length;
        int N=arr[0].length;
        if(M*N != r*c)
            return ;
        int[][] ans=new int[r][c];
        for(int i=0;i<M*N;i++){
            ans[i/c][i%c]=arr[i/N][i%N];
        }
        for(int i=0;i<ans.length;i++){
    for(int j=0;j<ans[0].length;j++){
        System.out.print(ans[i][j] + " ");
    }
    System.out.println();
    }
    }
}

