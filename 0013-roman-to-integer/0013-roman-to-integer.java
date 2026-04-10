class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> sc=new HashMap<>();
        sc.put('I',1);
        sc.put('V',5);
        sc.put('X',10);
        sc.put('L',50);
        sc.put('C',100);
        sc.put('D',500);
        sc.put('M',1000);
        int sum=0;
        for(int i=0;i<s.length();i++){
            int a=sc.get(s.charAt(i));
            if(i<s.length()-1 && a < sc.get(s.charAt(i+1))){
                sum=sum-a;
            }
            else{
                 sum=sum+a;
            }
        }
        return sum;
    }
}