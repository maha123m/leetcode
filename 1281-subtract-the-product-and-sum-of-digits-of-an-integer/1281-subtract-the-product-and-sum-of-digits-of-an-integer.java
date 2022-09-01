class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int product=1;// because any number multiple by zero equal 0
        while (n>0){
            int digit=n%10;
            sum +=digit;
            product*=digit;
            n/=10;
            
        }
        return product-sum;
        
    }
}
// exiplan:
//n=234 than n%10=4
// n=n/10=23