
import java.util.*;
class NextGreaterElement
{
    public static  void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Stack<Integer>st =new Stack<>();
        int res[]=new int[n];

        // creating a loop for traversing right to left the arr
        for(int i=arr.length-1;i>=0;i--){

            //for removing smaller element of stack than arr element
            while(!st.isEmpty()&&st.peek()<arr[i]){
                st.pop();
            }
            // after that if stack is empty then put -1 in res array
            if(st.isEmpty()){
                res[i]=-1;
            }
            //  placing peek element in res array
            else{
                res[i]=st.peek();
            }

            //pushing current element in stack

            st.push(arr[i]);
        }
        // printing the res array
        for(int x:res){
            System.out.print(x+" ");
        }

    }
}