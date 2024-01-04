class Solution {
    public boolean isPalindrome(int num) {
        int r=0,digit=0;
        int t=num;

        while(num>0){
            r=num%10;
            digit=digit*10+r;
            num=num/10;
        } 
 
        if(digit==t){
            return true;
        }else{
            return false;
        }
        }

  
}