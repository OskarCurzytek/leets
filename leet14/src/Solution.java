class Solution {
    public int lengthOfLastWord(String s) {
        String ss = s.strip();
        String[] sss = ss.split(" ");
        return sss[sss.length - 1].length();
    }
}