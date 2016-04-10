public class PlusOne {
    public int[] plusOne(int[] digits) {
        long sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += digits[i] * Math.pow(10, digits.length - i - 1);
        }
        sum++;
        String str = "" + sum;
        int[] result = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[i] = Integer.parseInt(str.substring(i, i + 1));
        }
        return result;
    }
}