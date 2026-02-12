import java.util.Scanner;

public class PrintNumbersUsingRecursion {
    void printNumbers(int n,int count){
        if(count<1){
            return;
        }

        printNumbers(n,count-1);
        System.out.print(count+" ");
    }
}
class Main{
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number");
            int n = sc.nextInt();
            PrintNumbersUsingRecursion p = new PrintNumbersUsingRecursion();
            p.printNumbers(n,n);
    }
}
