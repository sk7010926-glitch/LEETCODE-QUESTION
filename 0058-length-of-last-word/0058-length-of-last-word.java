class Solution {
    public int lengthOfLastWord(String s) {
        String[] d=s.split(" ");
        int length=0;
        String f="";
        for(int i=d.length-1;i>= 0;i--){
            if(!d[i].equals("")){
                f=d[i];
                break;
            }
        }
        return f.length();
    }
}