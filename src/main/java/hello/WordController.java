package hello;

import org.springframework.web.bind.annotation.RestController;

package hello;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordController {
      static int NO_OF_CHARS = 256;
     
     @GetMapping("/words/{word}")      
     public JsonWord CheckStringPalindromeOrAnagramOfPlaindrome(@PathVariable String word)
     {
       JsonWord jsonWord = null;
       
       if(word!=null)
       {
            Boolean CheckPalindromeString = WordController.CheckStringPalindromeOrNot(word);
            Boolean CheckAnagramOfPlaindrome = WordController.canFormPalindrome(word);
            if(CheckPalindromeString)
            {
               jsonWord = new JsonWord(); 
               jsonWord.setWord(word);
               jsonWord.setPalindrome(true);
               jsonWord.setAnagramOfPalindrome(true);
            }
           else
           {
                if(CheckAnagramOfPlaindrome)
                {
                    jsonWord = new JsonWord(); 
                    jsonWord.setWord(word);
                    jsonWord.setPalindrome(false);
                    jsonWord.setAnagramOfPalindrome(true);
                }
               else
               {
                   jsonWord = new JsonWord(); 
                   jsonWord.setWord(word);
                   jsonWord.setPalindrome(false);
                   jsonWord.setAnagramOfPalindrome(false);
               }
                   
           }
     }
    
    public static boolean CheckStringPalindromeOrNot(String str)
    {
      String  original = str;
      int length = str.length();
     
      for (int i = length - 1; i >= 0; i--)
      {
         reverse = reverse + original.charAt(i);
      }  
      if (original.equals(reverse))
         return true;
      else
         retrun false;
    }
    
    public static boolean canFormPalindrome(String str) 
    { 
        // Create a count array and initialize 
        // all values as 0 
        int[] count = new int[NO_OF_CHARS]; 
  
        // For each character in input strings, 
        // increment count in the corresponding 
        // count array 
        for (int i = 0; i < str.length(); i++) 
            count[str.charAt(i)]++; 
  
        // Count odd occurring characters 
        int odd = 0; 
        for (int i = 0; i < NO_OF_CHARS; i++) { 
            if ((count[i] & 1) != 0) 
                odd++; 
  
            if (odd > 1) 
                return false; 
        } 
  
        // Return true if odd count is 0 or 1, 
        return true; 
    } 
         
    public Boolean isStringNull(String str)
    {
     if(str == null)
         return true;
    }
    
    public Boolean isStringEmpty(String str)
    {
     if(str.equals(""))
         return true;
    }     
}
