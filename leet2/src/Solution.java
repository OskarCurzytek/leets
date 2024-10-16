class Solution {
    public String longestCommonPrefix(String[] strs) {

        if(strs.length==0 || strs==null)
        {
            return "";
        }

        String shortStr=strs[0];
        for (String str : strs)
        {
            if(str.length() < shortStr.length()){
                shortStr=str;
            }
        }
        for(int i=0;i<shortStr.length();i++){
            char res = shortStr.charAt(i);
            for (String str:strs){
                if(shortStr.charAt(i)!=str.charAt(i)){
                    return shortStr.substring(0,i);
                }
            }

        }
        return shortStr;

    }

}