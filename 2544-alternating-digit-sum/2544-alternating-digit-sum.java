class Solution {
    public int alternateDigitSum(int n) {
        String s=String.valueOf(n);
        int result=0;
        for(int i=0;i<s.length();i++){
            int digit=s.charAt(i)-'0';
            if(i%2==0){
                result=result+digit;
            }
            else{
                result=result-digit;
            }

        }
        return result;
    }
}