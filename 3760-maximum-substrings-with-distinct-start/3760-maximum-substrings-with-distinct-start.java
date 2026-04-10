class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> seen=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            seen.add(a);
        }
        return seen.size();
    }
}