package Competitive_Coding;

import java.util.HashSet;

//Distinct character in each word in a sentence
public class Q4_CharCount {
    public static void main(String[] args) {

        String str = "pqr ppqr";
        String word[] = str.split(" ");

        for (int index = 0; index < word.length; index++) {

            HashSet<Character> distinctCharacter = new HashSet<>();
            for (int i = 0; i < word[index].length(); i++) {
                distinctCharacter.add(word[index].charAt(i));
            }
            System.out.println("Distinct character in word " + word[index] + " : " + distinctCharacter);
        }

    }
}
