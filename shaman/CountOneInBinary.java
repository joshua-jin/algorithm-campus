public class CountOneInBinary {
    public int countOnes(int num) {
        // write your code here
        int count = 0;
        String binaryString = Integer.toBinaryString(num);
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}