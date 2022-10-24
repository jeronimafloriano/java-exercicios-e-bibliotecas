package hackerhanck.easy.interfaces;

class MyCalculator implements AdvancedArithmetic{
    private int sum = 0;
    @Override
    public int divisor_sum(int n) {
        for (int i = 1; i <= n; i++){
            if(n % i == 0){
                sum += i;
            }
        }
        return sum;
    }
}
