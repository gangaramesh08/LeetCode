package programs.zigzag;

public class ZigZagSolution {
    public static void main(String[] args) {
        convert("PAYPALISHIRINGYOU",4);
        /**
         * P   I   N
         * A  LS  IG
         * Y A H R Y U
         * P   I   O
         */
    }
    public static String convert(String s, int numRows) {//4
       StringBuffer sbf = new StringBuffer("");
       if(numRows==1){
           return s;
       }
       int j=0;
       int tempj=0;
       boolean flag = false;
       int gap = numRows -2;//2
       for(int i=0;i<numRows;){
           if (j<s.length()) {
               sbf.append(s.charAt(j));
           }
           if(i==0 || i==numRows-1){
               j = j + numRows*2 -2;
           }
           else if(flag){
                j = tempj + numRows*2 -2;
                tempj = j;
                flag=false;
           }
           else{
               j=j+ numRows - i +gap ;
               flag = true;
           }
           if(j>s.length()){
               flag=false;
               i++;
               gap--;
               tempj = i;
               j=i;
           }

       }
       return sbf.toString();

    }
}
