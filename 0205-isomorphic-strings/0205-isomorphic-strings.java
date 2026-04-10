class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> seen=new HashMap<>();
        HashMap<Character,Character> see=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++ ){
            char ch=s.charAt(i);
            char dh=t.charAt(i);
            if(seen.containsKey(ch)){
                if(!seen.get(ch).equals(dh)){
                    return false;
                }
            }
            else{
                seen.put(ch,dh);
            }
            if (see.containsKey(dh)) {
                if (see.get(dh) != ch){
                    return false;
                }
            } 
            else {
                see.put(dh, ch);
            }
        }
        return true;
    }
}