class Solution {
    public int minimumDeletions(String s) {
        Stack<Character> seen=new Stack<>();
        int count=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(!seen.isEmpty() && seen.peek()== 'b' && s.charAt(i) =='a'){
                seen.pop();
                count++;
            }
            else{
                seen.push(s.charAt(i));
            }
        }
        return count;
    }
}