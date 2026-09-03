class Solution {
    public boolean backspaceCompare(String s, String t) {

        int str_s = s.length() - 1;
        int str_t = t.length() - 1;

        int skip_s = 0;
        int skip_t = 0;

        while (str_s >= 0 || str_t >= 0) {

            // Find next valid character in s
            while (str_s >= 0) {
                if (s.charAt(str_s) == '#') {
                    skip_s++;
                    str_s--;
                } else if (skip_s > 0) {
                    skip_s--;
                    str_s--;
                } else {
                    break;
                }
            }

            // Find next valid character in t
            while (str_t >= 0) {
                if (t.charAt(str_t) == '#') {
                    skip_t++;
                    str_t--;
                } else if (skip_t > 0) {
                    skip_t--;
                    str_t--;
                } else {
                    break;
                }
            }

            // Both strings are finished
            if (str_s < 0 && str_t < 0) {
                return true;
            }

            // Only one string is finished
            if (str_s < 0 || str_t < 0) {
                return false;
            }

            // Valid characters are different
            if (s.charAt(str_s) != t.charAt(str_t)) {
                return false;
            }

            // Characters are equal, move both pointers
            str_s--;
            str_t--;
        }

        return true;
    }
}