class Solution {
    public static boolean matches(int[] a, int[] b ){
        for(int i=0; i<26; i++){
            if(a[i] != b[i]) return false;
        }
        return true;
    }

    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;

        int[] s1freq = new int[26];
        int[] wf = new int[26];

        for(int i=0; i<s1.length();i++){
            s1freq[s1.charAt(i)-'a']++;
        }

        int ws = s1.length();

        for(int i=0; i<ws; i++){
            wf[s2.charAt(i)-'a']++;
        }

        if(matches(s1freq,wf)){
            return true;
        }

        for(int right = ws; right<s2.length(); right++){
            wf[s2.charAt(right)-'a']++;
            
            int left = right - ws;

            wf[s2.charAt(left)-'a']--;

            if(matches(s1freq,wf)) return true;
        }
        return false;
    }

}