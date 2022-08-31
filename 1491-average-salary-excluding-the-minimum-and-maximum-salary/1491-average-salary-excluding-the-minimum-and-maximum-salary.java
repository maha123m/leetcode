class Solution {
    public double average(int[] salary) {
        
        int minSalary = Integer.MAX_VALUE;// for minumum number
        int maxSalary = Integer.MIN_VALUE;// for maxiumum number
        for (int i = 0; i < salary.length; i++) {// this for loop to fin max & min number 
            minSalary = Math.min(minSalary, salary[i]);
            maxSalary = Math.max(maxSalary, salary[i]);
        }
        double sum = 0;// this variable to store the average 
        for (int i = 0; i < salary.length; i++) {
            if (minSalary != salary[i] && maxSalary != salary[i]) {
                sum += salary[i];
            }
        }
        return sum / (salary.length - 2);
        
    }
}