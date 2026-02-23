package basicfundamentals;

public class Insertion {
    public void insert(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
           int key=arr[i];
           int j=i-1;
           while(j>=0&&arr[j]>key){
               arr[j+1]=arr[j];
               j--;
           }
           arr[j+1]=key;
        }
        System.out.println("After Sorting");
        for(int num:arr){
            System.out.println(num+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={9,8,7,6};
        System.out.println("Before sorting");
        for(int num:arr){
            System.out.println(num+" ");
        }
        Insertion s=new Insertion();
        s.insert(arr);
    }
}
