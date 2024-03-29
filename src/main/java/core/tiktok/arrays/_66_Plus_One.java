package core.tiktok.arrays;

public class _66_Plus_One {

    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // move along the input core.array starting from the end
        for (int idx = n - 1; idx >= 0; --idx) {
            // set all the nines at the end of core.array to zeros
            if (digits[idx] == 9) {
                digits[idx] = 0;
            }
            // here we have the rightmost not-nine
            else {
                // increase this rightmost not-nine by 1
                digits[idx]++;
                // and the job is done
                return digits;
            }
        }
        // we're here because all the digits are nines
        digits = new int[n + 1];
        digits[0] = 1;
        return digits;
    }

    public int[] addplusone(int[] digits){
        for(int i = digits.length-1; i >=0; i--){
            if(digits[i] == 9){
                digits[i] = 0;
            }else{
                digits[i] = digits[i]+1;
                return digits;
            }
        }
        digits = new int[digits.length+1];
        digits[0] = 1;
        return digits;
    }
}
