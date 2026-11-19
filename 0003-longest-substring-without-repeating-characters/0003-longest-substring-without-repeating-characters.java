class Solution {
    public int lengthOfLongestSubstring(String s) {

        String posval = "";
        int mxcount = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (posval.indexOf(ch) != -1) {
                posval = posval.substring(posval.indexOf(ch) + 1);
            }

            posval += ch;

            mxcount = Math.max(mxcount, posval.length());
        }

        return mxcount;
    }
}