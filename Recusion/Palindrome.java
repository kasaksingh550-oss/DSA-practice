public class Palindrome {
    public boolean checkPalindrome(String str,int i) {
        if(i>=str.length()){
            return true;
        }
        if(str.charAt(i)!=str.charAt(str.length()-i-1)){
            return false;
        }
        return checkPalindrome(str,i+1);
    }
    public static void main(String[] args) {
        String str="madam";
        Palindrome obj = new Palindrome();
        System.out.println(obj.checkPalindrome(str,0));
    }
}
