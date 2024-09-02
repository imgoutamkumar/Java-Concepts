package Competitive_Coding;

//countlength of longest string
public class Q8_LengthOfLongestString {
    public static void main(String[] args) {

        String[] words = { "Apple", "Banana", "Carrot", "Watermelon", "Strawberry" };
        int LongestLength = 0;
        String LongestWord = "";
        for (int index = 0; index < words.length; index++) {
            if (words[index].length() > LongestLength) {
                LongestWord = words[index];
                LongestLength = words[index].length();
            }

        }
        System.out.println(
                "Longest word in words string array is : " + LongestWord + ", with character count = " + LongestLength);
    }
}
