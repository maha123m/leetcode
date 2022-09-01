public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int counter =0;// to store number of ones
        while(n!=0){// loop for given number
            n=n&(n-1);
            counter+=1;    
        }
        return counter;   
    }
}