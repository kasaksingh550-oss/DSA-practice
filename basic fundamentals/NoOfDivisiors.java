import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NoOfDivisiors {
    public List<Integer> getDivisors(int n) {

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        return list;

    }
}
class main{
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        NoOfDivisiors obj = new NoOfDivisiors();
        List<Integer> result=obj.getDivisors(n);
      System.out.println(result);
    }
}

