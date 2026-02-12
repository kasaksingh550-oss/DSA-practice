import java.util.Scanner;

public class PrintNumberstill1 {
    void printNumbers(int n,int m){
        if(m>n){
            return;
        }
        printNumbers(n,m+1);
        System.out.print(m+" ");
    }
}
class Main2{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter number");
            int n=sc.nextInt();

            PrintNumberstill1 obj=new PrintNumberstill1();
            obj.printNumbers(n,1);
        }
}
