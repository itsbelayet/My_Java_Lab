package ProblemSolving;

public class Count_Word_InString {
    public static void main(String[] args) {

        wordCount();

        String myText = "Now I live in New York: ";
        int val = myText.split(" ").length;
        System.out.println(myText+" Total Word :"+val);

    }

    static public void wordCount() {
        String name = "Belayet";
        String text = "Hi, it is belayet. I come from bangladesh.";

        int wordCount = text.split(" ").length;

        System.out.println(text);
        System.out.println("Total Word in the above String is     : " + wordCount);

        System.out.println("Length of '"+name+"' is "+name.length());

        System.out.println(name.charAt(2));
        System.out.println(name.equalsIgnoreCase("belayet"));

    }
    
}
