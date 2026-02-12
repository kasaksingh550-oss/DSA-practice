import java.util.Scanner;

public class Binarysearch {
    int arr[];
    int key;

    Binarysearch(int[] array, int keyy){
         this.arr=array;
         this.key=keyy;
    }
    int search() {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int mid = (i + j) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                j = mid - 1;

            } else {
                i = mid + 1;
            }

        }
        return -1;
    }


        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the key=");
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("enter key to search");
            int key = sc.nextInt();
            Binarysearch b = new Binarysearch(arr, key);
            int ans = b.search();
            if(ans!=-1){
                System.out.println("key found at="+ans);
            }


        }


    }