import java.util.*;
import java.lang.*;

public class Armstrong {

  public static int arm(int n){
    int k=String.valueOf(n).length();
    int sum=0;
    while(n>0){
        int id=n%10;
        sum+=Math.pow(id,k);
        n=n/10;
    }
    return sum;

}

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int a= arm(n);
        if(a==n) System.out.println("Armstrong number");
        else System.out.println("Not Armstrong number");

    }
}



