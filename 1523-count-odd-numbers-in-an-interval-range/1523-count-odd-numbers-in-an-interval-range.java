class Solution {
    public int countOdds(int low, int high) {
        if(low % 2==0 && high % 2==0){// if two number high & low even 
            return (high - low )/2;
        }
        return ((high - low )/2)+1;// if one of two number or bothh are odd    
    }
}