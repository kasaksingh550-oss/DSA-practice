import java.util.Scanner;
public class PrintNameUsingRecursion {
    void printName(int n, String s){
        if(n==0){
            return;
        }
        System.out.println(s);
        printName(n-1, s);
    }
}
class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("Enter the Name");
        String name = sc.next();
        PrintNameUsingRecursion pn = new PrintNameUsingRecursion();
        pn.printName(n,name );

    }
}