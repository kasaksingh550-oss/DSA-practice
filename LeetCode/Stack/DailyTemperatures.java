package Stack;
import java.util.*;
import java.lang.*;
import java.io.*;
public class DailyTemperatures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter temperatures");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        Stack<Integer> st = new Stack<>();
        int temp[] = new int[n];
        System.out.println("after how mny days u get warmer temperatures= ");
        for(int i=n-1;i>=0;i--){
        while (!st.isEmpty() && arr [st.peek()]<arr[i]){
            st.pop();
        }
        if(st.isEmpty()){
            temp[i]=0;
        }else{
            temp[i]=st.peek()-i;
        }
        st.push(i);
        }
        for(int i=0;i<n;i++){
            System.out.print(temp[i]+" ");
        }

    }
}
