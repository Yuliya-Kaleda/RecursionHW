/**
 * Created by July on 11/3/15.
 */
public class EvenWords
{
    public static void main(String[] args)
    {
        System.out.println(isEvenWord("appa"));
    }

    public static boolean isEvenWord(String word) {
        if (word.length() == 0)
            return true;
        char firstLetter = word.charAt(0);
        
        // you can use indexOf or contains and replace
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == firstLetter) {
                word = word.substring(1, i) + word.substring(i+1);
                return isEvenWord(word);
            }
        }
        return false;
    }
    
    // I like that you are keeping it short and not relying on the libraries. I would love to see more test cases though.
}
