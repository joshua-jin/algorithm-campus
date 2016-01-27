package org.robynhan;

public class BinaryAddSolution {
    private int aplusb(int a, int b) {
        if (b == 0) {
            return a;
        }
        int sum = a ^ b;
        int carry = (a & b) << 1;
        return aplusb(sum, carry);
    }

    public String addBinary(String a, String b) {
        return Integer.toBinaryString(aplusb(Integer.valueOf(a, 2), Integer.valueOf(b, 2)));
    }
}
