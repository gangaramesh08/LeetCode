package programs.lettercombinationofphonenumber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationOfPhoneNumberSolution {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23456"));
    }
    public static List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        int dLen = digits.length();
        if (dLen == 0) {
            return list;
        }
        int len[] = new int[dLen];
        int tot_len = 1;
        for(int i=0;i<dLen;i++){
            len[i] = map.get(digits.charAt(i)).length();
            tot_len *= len[i];
        }
        int len_so_far = 1;
        int count;
        int cur_rep;
        int prev_rep = 0;

        int rep_index;
        int skip_index ;
        int count_index;

        char res[][]=new char[tot_len][digits.length()];
        int k;
        int z=0;
        int temp_k;
        //loop over each digit
        for(int digit_index=0;digit_index<dLen;digit_index++){
            String s = map.get(digits.charAt(digit_index));
            count = tot_len/len[digit_index]; // total number of times the letter appears in the  list
            cur_rep = count/len_so_far;     // subsequent repetition count of the current letter in the final list
            len_so_far = len_so_far * len[digit_index]; //letters covered so far
            int skip = Math.max(prev_rep - cur_rep, 0); // number of times the loop to be skipped before adding the letter next in the array
            k=0;
            count_index = 0; // counter to ensure that the letter has been added count times.
            temp_k = k;

            //loop over each alphabet corresponding to the digit
            for(int digit_value_index=0;digit_value_index<s.length();){

                rep_index=0;
                skip_index = 0;
                while (rep_index!=cur_rep){
                    res[k][z] = s.charAt(digit_value_index);
                    k++;
                    rep_index++;
                    count_index++;
                }
                while (skip_index!=skip){
                    k++;
                    skip_index++;
                }
                if(count_index==count){
                    digit_value_index++;
                    count_index = 0;
                }
                if(k>=tot_len){
                    prev_rep = cur_rep;
                    k = temp_k + cur_rep;
                    temp_k = k;
                }

            }
            z++;
        }
        for(int i=0;i<tot_len;i++){
            list.add(String.valueOf(res[i]));
        }
        return list;
    }

}
