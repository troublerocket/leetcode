// 727. Minimum Window Subsequence - HARD

// Given strings s1 and s2, return the minimum contiguous substring part of s1,
// so that s2 is a subsequence of the part.
// If there is no such window in s1 that covers all characters in s2,
// return the empty string "".
// If there are multiple such minimum-length windows, return the one with the left-most starting index.

// Example 1:
// Input: s1 = "abcdebdde", s2 = "bde"
// Output: "bcde"
// Explanation:
// "bcde" is the answer because it occurs before "bdde" which has the same length.
// "deb" is not a smaller window because the elements of s2 in the window must occur in order.

// Example 2:
// Input: s1 = "jmeqksfrsdcmsiwvaovztaqenprpvnbstl", s2 = "u"
// Output: ""
class Solution727 {
    public String minWindow(String s1, String s2) {
        int i = 0, j = 0;
        int ans = s1.length() + 1, idx = -1;
        while(i < s1.length()){
            if(s1.charAt(i) == s2.charAt(j)){
                j++;
                if(j == s2.length()){ // found the right bound
                    int right = i;
                    // restore j position to the last index of s2
                    j--;
                    while(j >= 0){ // try to found the nearest left bound starting from right
                        while(s1.charAt(i) != s2.charAt(j))
                            i--;
                        i--;
                        j--;
                    }
                    // restore i and j positions to the first index of s1 and s2
                    j++;
                    i++;
                    if(right - i + 1 < ans){
                        ans = right - i + 1;
                        idx = i;
                    }
                }
            }
            i++;
        }
        return idx == -1 ? "" : s1.substring(idx, idx + ans);
    }
}