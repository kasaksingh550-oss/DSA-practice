package basicfundamentals;

public class Selection {
    public void sort(int[] arr){
        int n = arr.length;
        for(int j=0;j<n-1;j++){
            int minindex = j;
            for(int i=j+1;i<n;i++){
                if(arr[i]<arr[minindex]){
                    minindex = i;

                }
            }
            int temp = arr[j];
            arr[j] = arr[minindex];
            arr[minindex] = temp;

        }
        System.out.println("After sorting");
        for(int num:arr){
            System.out.print(num+" ");
        }

    }
    public static void main(String[] args) {
        int arr[]={7,8,4,3,1};
        System.out.println("Before sorting");
        for(int num:arr){
            System.out.println(num+" ");
        }
        Selection s=new Selection();
        s.sort(arr);

    }
}
