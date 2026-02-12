import java.util.*;
public class Countdigits {
    public static int countDigits(int n){
        int cnt=(int)(Math.log10(n))+1;
        return cnt;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();

        int digits=countDigits(n);
        System.out.println(" digit are:"+digits);
    }
}

