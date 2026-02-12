package Basics;

import java.util.Scanner;

public class ReverseInteger {

    public static int reverse(int x) {
        int rev=0;
        while(x!=0) {
            int lastdigit = x % 10;
            x = x / 10;
            if (rev > Integer.MAX_VALUE / 10 || rev <Integer.MIN_VALUE / 10) {
                return 0;
            }
            rev = rev * 10 + lastdigit;
        }
        return rev;
        }
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x= scan.nextInt();

        int result =reverse(x);
        System.out.println(result);
//            ReverseInteger obj = new ReverseInteger();
//        System.out.println(obj.reverse(x));
    }
}
