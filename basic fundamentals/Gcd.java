import java.util.*;
public class Gcd {
   static int GCD(int n1,int n2) {
        while (n1 > 0 && n2 > 0) {
            if (n1 > n2) {
                n1 = n1 % n2;
            } else {
                n2 = n2 % n1;
            }

        } if (n1 == 0) {
           return n2;
       } else {
           return n1;
       }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n1 = input.nextInt();
        System.out.print("Enter a number: ");
        int n2 = input.nextInt();
        int result = GCD(n1,n2);
        System.out.println(result);


    }
}
