package hakerrank.daysOfCode30.Day19_Interfaces;


class Calculator implements AdvancedArithmetic{
    int sum = 0;

    @Override
    public int divisorSum(int n) {
        for (int i = 1; i <= n; i++){
            if(n % i == 0){
                sum += i;
            }
        }
        return sum;
    }
}
