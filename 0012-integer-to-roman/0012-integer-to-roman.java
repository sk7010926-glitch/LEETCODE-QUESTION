class Solution {
    public String intToRoman(int num) {
        Map<Integer,String> sc=new HashMap<>();
        sc.put(1,"I");
        sc.put(4,"IV");
        sc.put(5,"V");
        sc.put(10,"X");
        sc.put(50,"L");
        sc.put(100,"C");
        sc.put(500,"D");
        sc.put(1000,"M");
        sc.put(40,"XL");
        sc.put(90,"XC");
        sc.put(400,"CD");
        sc.put(900,"CM");
        sc.put(9,"IX");
        int[] arr={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String red="";
        for(int i=0;i<arr.length;i++){
            if(num>= arr[i]){
                int s=num/arr[i];
                num=num%arr[i];
                for(int j=0;j<s;j++){
                    red=red+sc.get(arr[i]);
                }
            }
        }
        return red;
    }
}