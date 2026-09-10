class Solution {
    public boolean isPalindrome(String s) {
         
         String original = "";  

                 for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                original = original + Character.toLowerCase(s.charAt(i));
            }
        }  

        String reverse = ""; 

         for(int i = original.length()-1; i>=0; i--){
            reverse = reverse + original.charAt(i);
         }
         return original.equals(reverse);
    }
}