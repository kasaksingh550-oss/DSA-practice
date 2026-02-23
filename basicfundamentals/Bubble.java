package basicfundamentals;

public class Bubble {
    public void sort(int arr[]){
        boolean flag = false;
        int n = arr.length;
        for(int i=n-1;i>0;i--){
          for(int j=0;j<=i-1;j++){
              if(arr[j]>arr[j+1]){
                   flag =true;
                  int temp=arr[j+1];
                  arr[j+1]=arr[j];
                  arr[j]=temp;
              }

          }
            if(!flag){
                break;
            }
        }
        System.out.println("After sorting:");
        for(int num:arr){
            System.out.println(num+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={4,3,2,1};
        for(int num:arr){
            System.out.println(num+" ");
        }
        Bubble bubble=new Bubble();
        bubble.sort(arr);


    }
}
