class Solution {
    boolean solution(String s) {
        int cntP = 0;
        int cntY = 0;
        s = s.toLowerCase();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p') {
                cntP++;
            } else if (s.charAt(i) == 'y') {
                cntY++;
            }
        }
        
        return cntP == cntY ? true : false;
    }
}