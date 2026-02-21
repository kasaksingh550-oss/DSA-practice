package basicfundamentals;
import java.util.HashMap;
import java.util.Scanner;

public class Hasingusinghashmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //precompute
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++)
            map.put(arr[i],(map.getOrDefault(arr[i],0)+1));

        //fetch
        int q=sc.nextInt();
        while(q-->0){
            int key=sc.nextInt();
            System.out.println(map.getOrDefault(key,0));
        }
    }

}
