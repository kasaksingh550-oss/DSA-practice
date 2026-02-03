package Basics;

import java.util.Scanner;

public class PalindromeNumber {
    public static boolean palindrome(int number) {
        int rev=0;
        int temp=number;
        while(number!=0){
            rev=rev*10+number%10;
            number=number/10;
        }
        return temp==rev;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        boolean result=palindrome(n);
        System.out.println(result);
    }
}
