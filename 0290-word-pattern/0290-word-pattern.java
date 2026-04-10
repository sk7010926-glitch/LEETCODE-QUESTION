class Solution {
    public boolean wordPattern(String pattern, String s) {
        int c=pattern.length();
        String[] word=s.split(" ");
        int d=word.length;
        if(c!=d){
            return false;
        }
        Map<Character,String> ch=new HashMap<>();
        Set<String> sc=new HashSet<>();
        for(int i=0;i<c;i++){
            char ll=pattern.charAt(i);
            String ss=word[i];
            if(ch.containsKey(ll)){
                if(!ch.get(ll).equals(ss)){
                    return false;
                }
            }
                else{
                    if(sc.contains(ss)){
                        return false;
                    }
                    ch.put(ll,ss);
                    sc.add(ss);
                }
        }
        return true;
    }
}