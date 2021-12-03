package programs.reverseintegers;

public class ReverseIntegerSolution {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
    public static int reverse(int x) {
       int result = 0;
       int temp = x;
       int counter=0;
       if(temp<0){
           temp = temp*-1;
       }
       while(temp>0){
           result = result *10 +temp%10;
           System.out.println(result);
           temp = temp/10;
           counter++;
           if(counter ==9 && temp!=0 && result>Math.pow(2,31)/10){
               return 0;
           }
       }
       return result;
    }

}
