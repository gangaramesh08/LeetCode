package programs.atoi;

public class AtoiSolution {
    public static void main(String[] args) {
        //System.out.println((int)Math.pow(2,31));
        myAtoi("+12345678999");
        myAtoi("2147483648");
        myAtoi("-91283472332");
        myAtoi("-12345678999");
        myAtoi("  0000000000012345678");
        myAtoi(" -1010023630o4");
        myAtoi(" -");
        myAtoi(" ");
        myAtoi("");
        myAtoi("  00+12");
    }
    public static int myAtoi(String s) {
        int i=0;
        int result = 0;
        int edge = (int)Math.pow(2,31);
        boolean isNegative = false;
        //loop to remove leading white spaces
        for(;i<s.length();i++){
            if(s.charAt(i)!=' '){
                break;
            }
        }
        try{
            return Integer.parseInt(s.substring(i));
        } catch (Exception exception){

        }

        //to identify if the string starts with '-' or '+'
        if(i!=s.length() && s.charAt(i)=='-'){
            isNegative = true;
            i++;
        } else if( i!=s.length() && s.charAt(i)=='+'){
            i++;
        }

        //loop to remove leading 0s.
        for(;i<s.length();i++){
            if(s.charAt(i)!='0'){
                break;
            }
        }


        //actual loop to print only numbers
        for(int j=i;j<s.length();j++){
            if(s.charAt(j)<'0' || s.charAt(j)>'9'){
                break;
            }
            if(result>edge/10 || (result==edge/10 && s.charAt(j)>'7')){
                result = edge;
                if(isNegative){
                    result = result +1;
                }
                break;
            }
            result = result *10 + Integer.parseInt(String.valueOf(s.charAt(j)));
        }
        if(isNegative){
            result = result*-1;
        }
        return result;
    }
}
