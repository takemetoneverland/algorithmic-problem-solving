class Solution {
    public int[] solution(long n) {   
        String str = Long.toString(n);
        int length = str.length();
        int[] answer = new int[length];       
        int idx = 0;
        
        for (int i = length - 1; i >= 0; i--) {
            answer[idx++] = Character.getNumericValue(str.charAt(i));
        }
        
        return answer;
    }
}