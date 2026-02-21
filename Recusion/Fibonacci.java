public class Fibonacci {
    public int fibonacci(int n) {
//       //brute force approach
//        if(n==0){
//            System.out.println("0");
//        }
//        else if(n==1){
//            System.out.println("0,1");
//        }
//        else{
//            int[] fib=new int [n+1];
//            fib[0]=0;
//            fib[1]=1;
//          for(int i=2;i<n;i++){
//              fib[i]=fib[i-1]+fib[i-2];
//          }
//            for(int j=0;j<5;j++){
//                System.out.println(fib[j]);
//            }

        //better approach
//        if(n==0){
//            System.out.println("0");
//        }else{
//         int sl=0;
//         int last=1;
//         System.out.print(sl+ " " + last+" ");
//         int curr;
//         for(int i=2;i<n;i++){
//              curr=last+sl;
//             last=curr;
//             sl=last;
//             System.out.print(curr+" ");
//         }
        // }

        // recursive approach
        if (n <= 1) {
            return n;
        }
        int last=fibonacci(n-1);
        int sl=fibonacci(n-2);
        return last+sl;
    }
    public static void main(String[] args) {
        Fibonacci f=new Fibonacci();
        f.fibonacci(5);
        System.out.println(f.fibonacci(5));

    }
}
