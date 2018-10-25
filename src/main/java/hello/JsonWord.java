public class JsonWord
{
   private String word;
   private boolean palindrome;
   private boolean anagramOfPalindorme;


   public String getWord()
   {
      return word;
   }
   
   public Boolean getPalindrome()
   {
      return palindrome;
   }

   public String getAnagramOfPalindorme()
   {
      return anagramOfPalindorme;
   }

   public void setWord(String word)
   {
      this.word = word;
   }

   public void setPalindrome(String palindrome)
   {
      this.palindrome = palindrome;
   }


   public void setAnagramOfPalindorme(String anagramOfPalindorme)
   {
      this.anagramOfPalindorme = anagramOfPalindorme;;
   }
}
