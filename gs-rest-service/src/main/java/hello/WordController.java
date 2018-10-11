package hello;

import java.util.ArrayList;
import java.util.stream.IntStream;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordController {
	 @RequestMapping("/words/{word}")
	    public Palindrome wordIsPalindrome(@PathVariable(value="word") String word) {
	        boolean palindromeUsingIntStream = isPalindromeUsingIntStream(word);
	        return new Palindrome(word,palindromeUsingIntStream,isAnagramOfPalindrome(word));
	    }

	    private boolean isPalindromeUsingIntStream(String text) {
	        String temp  = text.replaceAll("\\s+", "").toLowerCase();
	        return IntStream.range(0, temp.length() / 2)
	                .noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));
	    }

	    private   boolean isAnagramOfPalindrome(String str){
	        ArrayList<Character> a = new ArrayList<Character>();

	        for(int i = 0; i < str.length(); i++){
	            if(a.contains(str.charAt(i))){
	                a.remove((Object)str.charAt(i));
	            }
	            else{
	                a.add(str.charAt(i));
	            }
	        }
	        if(a.size() > 1)
	            return false;
	        return true;
	        
	    }

}
