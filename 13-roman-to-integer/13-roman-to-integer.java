// IV: I smaller than V which means subtracut V-I=4
//but VI:V larger than I which means addition V+I=6
// 0:represntation by empty string ""
class Solution {
    public int romanToInt(String s) {
    int result = 0;// to store the result 
        
        for(int i=0; i<s.length(); i++)// to move for  all letter in the string 
        {
            char c = s.charAt(i);// to store the charecter in string 
            
            // IV can be -1+5
            if ((i != s.length()-1)&& (symbolToValue(c) < symbolToValue(s.charAt(i+1))))
            {
                result = result - symbolToValue(c);// IV: I smaller than V which means                                                          //subtracut V-I=4
            }else{
                result = result + symbolToValue(c);
            }
        }
        
        return result;
    }
    
    public int symbolToValue(char c)
    {
        switch(c)
        {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }
}