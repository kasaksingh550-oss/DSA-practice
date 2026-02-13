import java.util.*;
 public class ReverseArray {
    public int []reverse(int arr[]) {

        int s=0;
        int n = arr.length-1;
        while(s<n){
            int temp=arr[n];
            arr[n]=arr[s];
            arr[s]=temp;
            n--;
            s++;
        }
        return arr;



//        int ans[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            ans[i] = arr[n - i - 1];
//        }
//        return ans;

//        return Collections.reverse(arr);
    }
}
class main{
    public static void main(String[] args) {

        int []arr = {1,2,3,4,5};
        int n = arr.length;
        ReverseArray obj = new ReverseArray();
       int reversed[]= obj.reverse(arr);
       System.out.println("Reversed array is"+" ");
        for(int j=0;j<n;j++){
            System.out.print(reversed[j]+" ");
        }
    }
}
