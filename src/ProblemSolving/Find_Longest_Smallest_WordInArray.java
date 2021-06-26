package ProblemSolving;

public class Find_Longest_Smallest_WordInArray {

    public static void main(String[] args) {
        String gst="Java is a programming language.";
        String [] st=gst.split(" ");
        String smalest=st[0];
        String longest="";

        for(String s1:st){
            if(s1.length()<smalest.length()){
                smalest=s1;
            }else if(s1.length()>longest.length()){
                longest=s1;
            }
        }
        System.out.println("Smallest Word of the String is : "+smalest);
        System.out.println("Longest Word of the String is : "+longest);
    }
}
