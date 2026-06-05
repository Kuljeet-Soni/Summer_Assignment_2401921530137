package WEEK_1.Day_5;

import java.util.Scanner;

public class question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        sc.close();
        System.out.println(longest_common_prefix(str));
    }

    public static String longest_common_prefix(String[] str) {
        if (str == null || str.length == 0) {
            return "";
        }
        for (int i = 0; i < str[0].length(); i++) {
            char ch = str[0].charAt(i);
            for (int j = 1; j < str.length; j++) {
                if (i >= str[j].length() || str[j].charAt(i) != ch) {
                    return str[0].substring(0, i);
                }
            }
        }
        return str[0];
    }

}
