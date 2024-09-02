package Competitive_Coding;

//print first letter of words in a sentences
public class Q1_PrintFirstCharacter {
    public static void main(String[] args) {

        String str = "My name is khan";
        String word[] = str.split(" ");

        for (int i = 0; i < word.length; i++) {
            System.out.println(word[i].charAt(0));
        }
    }
}
