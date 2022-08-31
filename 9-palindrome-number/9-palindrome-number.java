class Solution {
    public boolean isPalindrome(int x) {
        int result=0;// this to store revers value of number x
        if(x<0||((x%10==0)&& x!=0))
            return false;//x<0becase it is negative number and its not Palindrome
                         //(x%10==0)&& x!=0) if number end of zero and x not zero the number                               not palindrium 
                        // because we ignore the zero in the left side 
        
        while(x>result ){
            int reverse=x % 10;//store the last dight in x 
            x=x/10;
            result=result*10+reverse;
            
        }
        return x==result|| x== result/10;
            
        
    }
}