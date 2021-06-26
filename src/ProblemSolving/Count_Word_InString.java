package ProblemSolving;

public class Count_Word_InString {
    public static void main(String[] args) {
        String givenString="My name is Mohammed Belayet Hossain. I live in New York.";
        int totalWords=givenString.split(" ").length;
        System.out.println(givenString+"\n");
        System.out.println("Total Words in the String : "+totalWords);

    }
}
