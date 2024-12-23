class Solution {
    public int[] plusOne(int[] digits) {
        boolean carry = false;
        digits[digits.length - 1] += 1;

        for(int i = digits.length - 1; i >= 0; i--){

            if(carry){
                digits[i] += 1;
                carry = false;
            }

            if(digits[i] >= 10){
                digits[i] -= 10;
                carry = true;
            }

            if(i == 0 && carry){
                int[] result = new int[digits.length+1];
                result[0] = 1;
                System.arraycopy(digits, 0, result, 1, result.length - 1 - 1);
                return result;
            }
        }

        return digits;
    }
}