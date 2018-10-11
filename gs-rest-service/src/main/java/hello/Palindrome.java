package hello;

public class Palindrome {

    private String word;
    private boolean palindrome;
    private boolean anagramOfPalindrome;

    public Palindrome(String word, boolean palindrome, boolean anagramOfPalindrome) {
        this.word = word;
        this.palindrome = palindrome;
        this.anagramOfPalindrome = anagramOfPalindrome;
    }

    public Palindrome(){
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public boolean isPalindrome() {
        return palindrome;
    }

    public void setPalindrome(boolean palindrome) {
        this.palindrome = palindrome;
    }

    public boolean isAnagramOfPalindrome() {
        return anagramOfPalindrome;
    }

    public void setAnagramOfPalindrome(boolean anagramOfPalindrome) {
        this.anagramOfPalindrome = anagramOfPalindrome;
    }
}
