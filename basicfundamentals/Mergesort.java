package basicfundamentals;

import java.util.ArrayList;
import java.util.List;

public class Mergesort {
    public void merge(int arr[],int low,int mid,int high){
        List<Integer>temp=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid&&right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left++]);
            }else{
                temp.add(arr[right++]);
            }
        }
        while(left<=mid){
            temp.add(arr[left++]);

        }
        while(right<=high){
            temp.add(arr[right++]);
        }

        //copy back to original array
        for(int i=low;i<=high;i++) {
            arr[i] = temp.get(i - low);
        }
    }
    public void mergesort(int arr[],int low,int high){
        int mid=(low+high)/2;
        if(low>=high){
            return;
        }
        mergesort(arr,low,mid);
        mergesort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void main(String[] args) {
        int arr[]={9,8,7,6,5,4,3,2,1};
        System.out.println("Before sorting");
        for(int num:arr){
            System.out.print(num+" ");
        }
        Mergesort m=new Mergesort();
        m.mergesort(arr,0,arr.length-1);
        System.out.println("After sorting");
        for(int num:arr){
            System.out.print(num+" ");
        }



    }
}
