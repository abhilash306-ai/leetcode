class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList <> (right - left + 1);
        for (int num = left; num<= right; num++){
            if (isSelfDividing(num)){
                result.add (num);
            }

        }
        return result;
    }
    private boolean isSelfDividing(int num){
        for (int n = num; n>0; n /= 10){
            int digit = n % 10;
            if (digit == 0 || num % digit != 0) {
                return false;
            }
        }
        return true;
        }
    }
