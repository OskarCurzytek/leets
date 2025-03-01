class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 1){
            return true;
        }

        s = s.trim();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();

        int i = 0;
        int j = s.length() - 1;

        while(i <= j){

            if(s.charAt(i) != s.charAt(j)){
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}