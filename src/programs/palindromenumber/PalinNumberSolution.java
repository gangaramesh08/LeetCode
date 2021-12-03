package programs.palindromenumber;

public class PalinNumberSolution {
    public static void main(String[] args) {
        System.out.println(isPalindrome(123));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(0));
    }
    public static boolean isPalindrome(int x) {
        if(x>=0 && x==reverse(x)){
            return true;
        }
        return false;

    }
    public static int reverse(int temp) {
        int result = 0;
        while(temp>0){
            result = result *10 +temp%10;
            temp = temp/10;
        }
        return result;
    }
}
