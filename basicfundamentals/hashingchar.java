package basicfundamentals;

import java.util.Scanner;

public class hashingchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();

        //precompute
        int hash[]=new int[256];
        for(int i=0;i<s.length();i++)
            hash[s.charAt(i)]++;
        int q= sc.nextInt();
        while(q--!=0){
            char ch=sc.next().charAt(0);
            System.out.println(hash[ch]);
        }
    }
}
