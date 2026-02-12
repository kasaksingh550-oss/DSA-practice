import java.util.Scanner;

import java.util.Scanner;
public class Prime {
   public static boolean isPrime(int n) {
       if(n<=1) return false;
       int cnt=0;
       for (int i=2; i*i<=n; i++){
           if(n%i==0){
               cnt++;
               if(i!=n%i){
                cnt++;
               }
           }
       }
       if(cnt==2) return true;
       else return false;
   }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number");
       int n = sc.nextInt();
       boolean result=isPrime(n);
       System.out.println(result);
   }
}
