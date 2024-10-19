class Solution {
    public int strStr(String haystack, String needle) {

        if(haystack.length() < needle.length()){
            return -1;
        }else if(needle.isEmpty() || haystack.equals(needle)){
            return 0;
        }

        for(int i = 0; i < haystack.length() - needle.length() + 1; i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                for(int j = 0; j < needle.length(); j++){
                    if(haystack.charAt(i+j) == needle.charAt(j)){
                        if(j == needle.length() - 1){
                            return i;
                        }
                    }else{
                        break;
                    }
                }
            }
        }

        return -1;
    }
}