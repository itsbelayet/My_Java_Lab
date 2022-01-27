package ProblemSolving;

import java.util.Arrays;

public class Temp_Java {

    public static void main(String[] args) {
//        String discription="My name is Mohammed Belayet Hossain";
//        char[] chararray=discription.toCharArray();
//        System.out.println(chararray[11]);
//        System.out.println(discription.toLowerCase());
            isAnagram("Miru","Urim");
    }
    public static void isAnagram(String st1, String st2){
        String flag=null;
        if (st1.length()!=st2.length()){
            flag="Not Anagram";
        }else {
            char[] st1array=st1.toLowerCase().toCharArray();
            char[] st2array=st2.toLowerCase().toCharArray();
            Arrays.sort(st1array);
            Arrays.sort(st2array);
            boolean flg=Arrays.equals(st1array,st2array);
            if (flg=true){
                flag="It's Anagram";
            }else{
                flag="Not Anagram";
            }
        }
        System.out.println(flag);
    }

}
