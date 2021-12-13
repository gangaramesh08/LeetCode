package programs.integertoroman;
public class IntegerToRomanSolution {
    public static void main(String[] args) {
        System.out.println(intToRoman(1994));
    }

    public static String intToRoman(int num) {
        StringBuffer roman = new StringBuffer();
        while (num != 0) {
            if (num >= 1000) {
                roman.append("M");
                num = num - 1000;
            } else if (num >= 900) {
                roman.append("CM");
                num = num - 900;
            } else if (num >= 500) {
                roman.append("D");
                num = num - 500;
            } else if (num >= 400) {
                roman.append("CD");
                num = num - 400;
            } else if (num >= 100) {
                roman.append("C");
                num = num - 100;
            } else if (num >= 90) {
                roman.append("XC");
                num = num - 90;
            } else if (num >= 50) {
                roman.append("L");
                num = num - 50;
            } else if (num >= 40) {
                roman.append("XL");
                num = num - 40;
            } else if (num >= 10) {
                roman.append("X");
                num = num - 10;
            } else if (num >= 9) {
                roman.append("IX");
                num = num - 9;
            } else if (num >= 5) {
                roman.append("V");
                num = num - 5;
            } else if (num >= 4) {
                roman.append("IV");
                num = num - 4;
            } else if (num >= 1) {
                roman.append("I");
                num = num - 1;
            }
        }
    return roman.toString();
   }
}
