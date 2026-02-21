package basicfundamentals;
import java.security.KeyStore;
import java.util.*;



// Brute force
public class Maxminoccuringhashing {

//    public void maxmin(int arr[],int n) {
//        int maxfreq = 0, maxele = 0;
//        int minfreq = n, minele = 0;
//        boolean visited[] = new boolean[n];
//        for (int i = 0; i < n; i++) {
//            if (visited[i] == true) {
//                continue;
//            }
//            int cnt = 1;
//            for (int j = i + 1; j < n; j++) {
//                if (arr[i] == arr[j]) {
//                    visited[j] = true;
//                    cnt++;
//
//                }
//            }
//            //update frequencies
//            if (cnt > maxfreq) {
//                maxfreq = cnt;
//                maxele = arr[i];
//            }
//            if (cnt < minfreq) {
//                minfreq = cnt;
//                minele = arr[i];
//            }
//        }
//        System.out.println("Maxfreq :"+ maxfreq);
//        System.out.println("Minfreq :"+ minfreq);
//
//
//    }

    //optimal
    public void maxmin(int arr[],int n){
        int maxfreq=0,minfreq=n;
        int maxele=0,minele=0;
        Map<Integer,Integer> map=new HashMap<>();
        //map freq in map
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        // updating freq
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            int element= entry.getKey();
            int count=entry.getValue();
            if(count>maxfreq){
                maxfreq=count;
                maxele=element;
            }
            if(count<minfreq){
                minfreq=count;
                minele=element;
            }
        }
        System.out.println(maxfreq);
        System.out.println(minfreq);

    }
    public static void main(String[] args) {
        Maxminoccuringhashing obj = new Maxminoccuringhashing();
        int arr[]={10,5,10,15,10,5};
        obj.maxmin(arr,arr.length);

    }




}
