import java.util.Scanner;
 public class ReverseArray {
    public int []reverse(int arr[]) {
        int n = arr.length;
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = arr[n - i - 1];
        }
        return ans;
    }
}
class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[]=new int[n ];
        System.out.println("Enter the elements of the array");

        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
        }
        System.out.println("Array is"+" ");
        for(int i=0;i<n;i++){

            System.out.println(arr[i]+" ");
        }
        ReverseArray obj = new ReverseArray();
       int reversed[]= obj.reverse(arr);
       System.out.println("Reversed array is"+" ");
        for(int j=0;j<n;j++){
            System.out.print(reversed[j]+" ");
        }
    }
}
